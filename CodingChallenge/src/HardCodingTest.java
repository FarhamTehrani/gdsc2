import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HardCodingTest {

    private HardCodingImplementation testee = new HardCodingImplementation();

    @Test
    public void getConcatinationTest(){
        int[] nums = {1,2,3};
        int[] ans = {1,2,3,1,2,3};
        Assert.assertArrayEquals(ans, testee.getConcatination(nums));
    }

    @Test
    public void defangIPaddr(){
        String ip = "123.3.0.342";
        String defanged = "123[.]3[.]0[.]342";
        Assert.assertEquals(defanged, testee.defangIPaddr(ip));
    }
}
