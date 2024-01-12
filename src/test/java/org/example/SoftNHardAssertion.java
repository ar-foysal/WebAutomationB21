package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftNHardAssertion extends DriverSetup {
    @Test
    public void testDiffAssertion(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Print A");
        softAssert.assertEquals(1, 2);
//        Assert.assertEquals(1, 2);
        System.out.println("Print B");
        System.out.println("Print C");
        softAssert.assertTrue(false);
        System.out.println("Print D");
        softAssert.assertAll();
    }
}
