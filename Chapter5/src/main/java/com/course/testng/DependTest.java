package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 run");
    }
    //test1作为test2的一些前置条件，依赖
    //依赖测试：被依赖的方法如果执行失败，依赖的方法就会被忽略，不执行
    /**依赖测试的场景：
     * test1里面的一些方法要作为test2的一些前置条件
     * 比如需要买东西之前，需要登录，如果登录失败，那就无法购买
     * */
}
