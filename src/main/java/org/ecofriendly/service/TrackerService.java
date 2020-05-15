package org.ecofriendly.service;

import org.apache.commons.lang3.StringUtils;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.user.Account;
import org.ecofriendly.db.repository.AccountRepository;
import org.ecofriendly.db.repository.TrackerRepository;
import org.ecofriendly.utils.AchievementUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TrackerService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TrackerRepository trackerRepository;
    private AchievementUtils achievementUtils;

    public void calculateValuesFromTracker(Tracker trackerForm, String username) {
        checkInputsForAchievements(username, trackerForm);
        int[] inputValuesArr = addInputsFromTrackerToList(trackerForm);
        int[] totalValuesArr = addTotalValuesToList(trackerForm);
        plusValuesFromInputsToTotal(inputValuesArr, totalValuesArr);

        String newTotalValue = calculateGeneralSum(trackerForm.getTotal(), totalValuesArr);
        trackerForm.setTotal(newTotalValue);
        checkTotalValueForAchievements(username, Integer.parseInt(newTotalValue));
        setUpdatedValuesToTrackerJO(trackerForm, totalValuesArr);
    }


    public void setFieldsFromFormToExistTracker(Tracker trackerForm, Tracker existTracker) {
        existTracker.setPlasticInput(trackerForm.getPlasticInput());
        existTracker.setGlassInput(trackerForm.getGlassInput());
        existTracker.setPaperInput(trackerForm.getPaperInput());
        existTracker.setClothesInput(trackerForm.getClothesInput());
        existTracker.setAccumsInput(trackerForm.getAccumsInput());
        existTracker.setTechnInput(trackerForm.getTechnInput());
        existTracker.setMetalInput(trackerForm.getMetalInput());
        existTracker.setDangerInput(trackerForm.getDangerInput());
        existTracker.setOtherInput(trackerForm.getOtherInput());
    }

    /**
     * Добавляем введенные строковые значения в список из элементов типа Short
     */
    private int[] addInputsFromTrackerToList(Tracker trackerForm) {
        int[] inputValuesArr = new int[9];
        inputValuesArr[0] = convertValue(trackerForm.getPlasticInput());
        inputValuesArr[1] = convertValue(trackerForm.getGlassInput());
        inputValuesArr[2] = convertValue(trackerForm.getPaperInput());
        inputValuesArr[3] = convertValue(trackerForm.getClothesInput());
        inputValuesArr[4] = convertValue(trackerForm.getAccumsInput());
        inputValuesArr[5] = convertValue(trackerForm.getTechnInput());
        inputValuesArr[6] = convertValue(trackerForm.getMetalInput());
        inputValuesArr[7] = convertValue(trackerForm.getDangerInput());
        inputValuesArr[8] = convertValue(trackerForm.getOtherInput());

        return inputValuesArr;
    }

    /**
     * Добавляем имеющиеся значения по категориям в список из элементов типа Integer
     */
    private int[] addTotalValuesToList(Tracker trackerForm) {
        int[] totalValuesArr = new int[9];
        totalValuesArr[0] = convertValue(trackerForm.getPlasticTotal());
        totalValuesArr[1] = convertValue(trackerForm.getGlassTotal());
        totalValuesArr[2] = convertValue(trackerForm.getPaperTotal());
        totalValuesArr[3] = convertValue(trackerForm.getClothesTotal());
        totalValuesArr[4] = convertValue(trackerForm.getAccumsTotal());
        totalValuesArr[5] = convertValue(trackerForm.getTechnTotal());
        totalValuesArr[6] = convertValue(trackerForm.getMetalTotal());
        totalValuesArr[7] = convertValue(trackerForm.getDangerTotal());
        totalValuesArr[8] = convertValue(trackerForm.getOtherTotal());
        return totalValuesArr;
    }

    private Integer convertValue(String value) {
        if (Objects.isNull(value) || StringUtils.isEmpty(value)) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }

    /**
     * Прибавление к суммарным значениям по категориям новых введенных значений
     */
    private void plusValuesFromInputsToTotal(int[] inputsArr, int[] totalsArr) {
        for (int i = 0; i < totalsArr.length; i++) {
            totalsArr[i] += inputsArr[i];
        }
    }

    /**
     * Подсчет суммарного значения по всем категориям
     */
    private String calculateGeneralSum(String generalValue, int[] totalsArr) {
        int totalSum = convertValue(generalValue);
        int sum = 0;
        for (int value : totalsArr) {
            sum += value;
        }
        int newGeneralValue = totalSum + sum;

        return String.valueOf(newGeneralValue);
    }

    /**
     * Присвоение новых суммарных значений объекту-сущности Tracker
     */
    private void setUpdatedValuesToTrackerJO(Tracker tracker, int[] totalsArr) {
        tracker.setPlasticTotal(String.valueOf(totalsArr[0]));
        tracker.setGlassTotal(String.valueOf(totalsArr[1]));
        tracker.setPaperTotal(String.valueOf(totalsArr[2]));
        tracker.setClothesTotal(String.valueOf(totalsArr[3]));
        tracker.setAccumsTotal(String.valueOf(totalsArr[4]));
        tracker.setTechnTotal(String.valueOf(totalsArr[5]));
        tracker.setMetalTotal(String.valueOf(totalsArr[6]));
        tracker.setDangerTotal(String.valueOf(totalsArr[7]));
        tracker.setOtherTotal(String.valueOf(totalsArr[8]));
    }


    /**
     * Проверка пользователя для добавления достижений
     */
    public void checkInputsForAchievements(String username, Tracker trackerForm) {
        achievementUtils = new AchievementUtils();
        Tracker existTracker = trackerRepository.getTrackerByAccount_Username(username);
        Account account = accountRepository.findAccountByUsername(username);
        List<Integer> achievementList = account.getAchievementList();

        achievementUtils.checkDangerInputForAchieves(trackerForm.getDangerInput(), existTracker.getDangerTotal(), achievementList);
        achievementUtils.checkGlassInputForAchieves(trackerForm.getGlassInput(),existTracker.getGlassTotal(), achievementList);

        account.setAchievementList(achievementList);
        accountRepository.save(account);
    }

    private void checkTotalValueForAchievements(String username, int totalValue) {
        achievementUtils = new AchievementUtils();
        Account account = accountRepository.findAccountByUsername(username);
        List<Integer> achievementList = account.getAchievementList();
        //Начинающий сортировщик
        achievementUtils.checkForTotalRecycledAchieves(3, 500, achievementList, totalValue);
        //Продвинутый сортировщик
        achievementUtils.checkForTotalRecycledAchieves(4, 1000, achievementList, totalValue);
        //Ярый сортировщик
        achievementUtils.checkForTotalRecycledAchieves(5, 5000, achievementList, totalValue);
        //Я из Швеции
        achievementUtils.checkForTotalRecycledAchieves(6, 10000, achievementList, totalValue);

        account.setAchievementList(achievementList);
        accountRepository.save(account);
    }

}
