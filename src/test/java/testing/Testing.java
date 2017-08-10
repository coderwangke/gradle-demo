package testing;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by liuzijie on 2017/7/28.
 */
public class Testing {

    @BeforeTest
    public void bex(){
        System.out.print("xxx");
    }



    @Test
    public void test1(){
        Assert.assertTrue(true);
    }

    public void test2(){
        Assert.assertTrue(false);
    }
}
