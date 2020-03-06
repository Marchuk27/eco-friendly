package org.ecofriendly.database.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AuthDataReceiver {
    private AuthDataReceiver() {}

    private static AuthDataReceiver instance;
    private static final String DB_CONFIG_FILE_PATH = "/src/main/resources/db_config.txt";

    public static AuthDataReceiver getInstance() {
        if (instance == null) {
            instance = new AuthDataReceiver();
        }
        return instance;
    }

    public static String[] getAuthDataForDB(){
        String[] configParams = new String[4];
        String startPath = (new File("").getAbsolutePath());
        File dbConfig = new File(startPath + DB_CONFIG_FILE_PATH);

        try {
            FileReader fileReader = new FileReader(dbConfig);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> readLines = new ArrayList<String>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                readLines.add(line);
            }
            configParams = readLines.toArray(new String[4]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return configParams;
    }
}
