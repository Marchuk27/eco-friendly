package org.ecofriendly.utils;

import java.util.List;

public class AchievementUtils {

    /** Начинающий сортировщик */
    public static void checkForBeginnerRecycler(List<Integer> achievementList, int totalFromTracker) {
        if (!achievementList.contains(3) && totalFromTracker >= 500) {
            achievementList.add(3);
        }
    }

    /** Продвинутый сортировщик */
    public static void checkForMiddleRecycler(List<Integer> achievementList, int totalFromTracker) {
        if (!achievementList.contains(4) && totalFromTracker >= 1000) {
            achievementList.add(4);
        }
    }

    /** Ярый сортировщик */
    public static void checkForSeniorRecycler(List<Integer> achievementList, int totalFromTracker) {
        if (!achievementList.contains(5) && totalFromTracker >= 5000) {
            achievementList.add(5);
        }
    }

    /** Я из Швеции*/
    public static void checkForIamFromSweden(List<Integer> achievementList, int totalFromTracker) {
        if (!achievementList.contains(6) && totalFromTracker >= 10000) {
            achievementList.add(6);
        }
    }
}
