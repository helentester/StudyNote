package UITestcase;
/*
 * @author Helen Lee
 * @create 2019-06-20
 * @description
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLink {

    @Test
    public void test_AllLink(){
        Assert.assertEquals("1","1");
    }

    @Test
    public void test_01(){
        Assert.assertEquals(1,1);
    }
}
