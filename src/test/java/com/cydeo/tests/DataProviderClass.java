package com.cydeo.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider (name = "operator")
    public Object[][] dpMethod(){
        return new Object[][] {{1,2,3},{4,5,9},{2,6,8}};
    }

    @Test(dataProvider = "operator")
    public void sum(int a, int b, int result){
        int sum=a+b;
        Assert.assertEquals(sum, result);
    }
}
