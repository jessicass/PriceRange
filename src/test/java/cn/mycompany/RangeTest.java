package cn.mycompany;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 13-7-30
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
public class RangeTest {
    @Test
    public void testGetRangeRight() throws Exception {
        CompanyRange a = new CompanyRange("A", 1000, 3000);
        CompanyRange b = new CompanyRange("B", 6000, 10000);
        CompanyRange c = new CompanyRange("C", 500, 2500);
        List<CompanyRange> list = new ArrayList<CompanyRange>();
        list.add(a);
        list.add(b);
        list.add(c);
        int low = 2500;
        int high = 5000;
        assertThat(CompanyRange.getCompanys(list,low,high).contains("A"),is(true));
        assertThat(CompanyRange.getCompanys(list,low,high).contains("C"),is(true));
    }
}
