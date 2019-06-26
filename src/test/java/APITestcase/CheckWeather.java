package APITestcase;
/*
 * @author Helen Lee
 * @create 2019-06-23
 * @description
 */

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckWeather {

    @Test(description = "天气判断")
    public void test_(){
        Reporter.log("输出日志");
        Assert.assertEquals("2","2","nothing");
    }
}
