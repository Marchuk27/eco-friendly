package org.ecofriendly.service;

import org.apache.commons.lang3.StringUtils;
import org.ecofriendly.db.entity.Tracker;
import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.db.repository.TrackerRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class TrackerService {
    private final TrackerRepository trackerRepository;

    public TrackerService(TrackerRepository trackerRepository) {
        this.trackerRepository = trackerRepository;
    }

    public void calculateValuesFromTracker(Tracker trackerForm) {
        int[] inputValuesArr = addInputsFromTrackerToList(trackerForm);
        int[] totalValuesArr = addTotalValuesToList(trackerForm);
        plusValuesFromInputsToTotal(inputValuesArr, totalValuesArr);

        String newTotalValue = calculateGeneralSum(trackerForm.getTotal(), totalValuesArr);
        trackerForm.setTotal(newTotalValue);
        setUpdatedValuesToTrackerJO(trackerForm, totalValuesArr);
    }

    public Map<String, String> getTrackerValuesByAccountId(Long userAccountId) {
        Tracker trackerPage = trackerRepository.getTrackerByUserAccount_Id(userAccountId);
        Map<String, String> trackerValues = new HashMap<>();
        trackerValues.put("Пластик", trackerPage.getPlasticTotal());
        trackerValues.put("Стекло", trackerPage.getGlassTotal());
        trackerValues.put("Бумага", trackerPage.getPaperTotal());
        trackerValues.put("Одежда", trackerPage.getClothesTotal());
        trackerValues.put("Батарейки", trackerPage.getAccumsTotal());
        trackerValues.put("Техника", trackerPage.getTechnTotal());
        trackerValues.put("Металл", trackerPage.getMetalTotal());
        trackerValues.put("Опасное", trackerPage.getDangerTotal());
        trackerValues.put("Другое", trackerPage.getOtherTotal());
        return trackerValues;
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
}
