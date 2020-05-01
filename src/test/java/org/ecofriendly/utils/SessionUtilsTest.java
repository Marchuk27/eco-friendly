package org.ecofriendly.utils;

import org.junit.Assert;
import org.junit.Test;

public class SessionUtilsTest {
    @Test
    public void generateUuidTest(){
        Integer testNum = SessionUtils.generateAdminSessionUUID();
        Assert.assertNotNull(testNum);
        Assert.assertEquals(5, String.valueOf(testNum).length());
    }
}
