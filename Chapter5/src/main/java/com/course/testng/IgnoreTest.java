package com.course.testng;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class IgnoreTest {


    @AfterTest
    public  void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false) //忽略测试
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore 3 执行");
    }
}
