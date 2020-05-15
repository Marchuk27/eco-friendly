package org.ecofriendly.utils;

import java.util.List;
import java.util.Objects;

public class AchievementUtils {

    /**
     * Начинающий сортировщик
     * Продвинутый сортировщик
     * Ярый сортировщик
     * Я из Швеции
     */
    public void checkForTotalRecycledAchieves(int achievementId, int amountForAchieve,
                                                     List<Integer> achievementList, int totalFromTracker) {
        if (!achievementList.contains(achievementId) && totalFromTracker >= amountForAchieve) {
            achievementList.add(achievementId);
        }
    }

    public void checkDangerInputForAchieves(String dangerInput, String dangerTotal, List<Integer> achievementList) {
        if (achievementList == null) {
            return ;
        }
        if ((dangerInput == null || dangerInput.isEmpty()) && dangerTotal == null) {
            return;
        }

        if (!dangerInput.isEmpty()) {
            if (Objects.isNull(dangerTotal) || dangerTotal.equals("0")) {
                if (!achievementList.contains(2)) {
                    //Достижение "Безумец"
                    achievementList.add(2);
                }
            }
        }
    }

    public void checkGlassInputForAchieves(String glassInput, String glassTotal, List<Integer> achievementList) {
        if (!glassInput.isEmpty()) {
            //Достижение "Начинающий стекольщик"
            checkInputForAchieves(achievementList, 7, 30, glassInput, glassTotal);
            //Достижение "Продвинутый стекольщик"
            checkInputForAchieves(achievementList, 8, 500, glassInput, glassTotal);
            //Достижение "Ярый стекольщик"
            checkInputForAchieves(achievementList, 9, 2000, glassInput, glassTotal);
        }
    }

    public void checkCheckListForAchieves(List<Integer> achievementList,List<String> ideaList) {
        if (!achievementList.contains(10) && ideaList.size() >= 2) {
            //Достижение "Идейный"
            achievementList.add(10);
        }
    }

    private void checkInputForAchieves(List<Integer> achievementList, int achievementId, int amountForAchieve,
                                       String inputValue, String totalValue) {
        if (!achievementList.contains(achievementId)) {
            if ((Integer.parseInt(inputValue) + Integer.parseInt(totalValue) >= amountForAchieve)) {
                achievementList.add(achievementId);
            }
        }
    }
}
