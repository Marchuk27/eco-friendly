package org.ecofriendly.utils;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import static org.ecofriendly.constants.AdminConstants.MAIN_UUID;
import static org.ecofriendly.constants.AdminConstants.REQUESTS_UUID;
import static org.ecofriendly.constants.AdminConstants.NEWS_UUID;
import static org.ecofriendly.constants.AdminConstants.MNG_DB_UUID;

public class SessionUtils {

    /**
     * Структура, в которой хранится uuid сессии админа, и логин админа
     * проверяется при авторизации админа
     */
    private static Map<Integer, String> adminSessionMap = new HashMap<>();

    public static Integer generateAdminSessionUUID() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(99999);
    }

    /**
     * SessionMap methods
     */
    public static Map<Integer, String> getAdminSessionMap() {
        return adminSessionMap;
    }

    public static void addParamToSessionMap(Integer uuid, String adminLogin) {
        adminSessionMap.put(uuid, adminLogin);
    }

    public static void deleteParamFromSessionMap(Integer uuid) {
        adminSessionMap.remove(uuid);
    }

    public static Boolean validateAdminAccess(Integer uuid, String operationCode, int operationNum) {
        boolean accessFlag = false;
        switch (operationNum) {
            case 1:
                accessFlag = StringUtils.equalsForOperationUuid(MAIN_UUID, operationCode);
                break;
            case 2:
                accessFlag = StringUtils.equalsForOperationUuid(REQUESTS_UUID, operationCode);
                break;
            case 3:
                accessFlag = StringUtils.equalsForOperationUuid(NEWS_UUID, operationCode);
                break;
            case 4:
                accessFlag = StringUtils.equalsForOperationUuid(MNG_DB_UUID, operationCode);
                break;
        }
        if (accessFlag) {
            return adminSessionMap.containsKey(uuid);
        }
        return false;
    }
}
