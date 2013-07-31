package cn.mycompany;

import org.junit.Before;
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
    private CompanyRangeList companyRangeList;
    private List<CompanyRange> list;

    @Before
    public void setUp() throws Exception {
        CompanyRange a = new CompanyRange("A", 1000, 3000);
        CompanyRange b = new CompanyRange("B", 6000, 10000);
        CompanyRange c = new CompanyRange("C", 500, 2500);

        companyRangeList = new CompanyRangeList();
        companyRangeList.addCompanyRange(a);
        companyRangeList.addCompanyRange(b);
        companyRangeList.addCompanyRange(c);
        list = companyRangeList.getCompanyRangeList();
    }

    @Test
    public void testGetRangeRight() throws Exception {
        int low = 2500;
        int high = 5000;
        assertThat(companyRangeList.getCompanys(list,low,high).contains("A"),is(true));
        assertThat(companyRangeList.getCompanys(list,low,high).contains("C"),is(true));
    }

    @Test
    public void testGetRangeRight1() throws Exception {
        int low = 900;
        int high = 5000;
        assertThat(companyRangeList.getCompanys(list,low,high).contains("A"),is(true));
        assertThat(companyRangeList.getCompanys(list,low,high).contains("C"),is(true));
    }

    @Test
    public void testGetRangeRightWith1Range() throws Exception {
        int low = 3000;
        assertThat(companyRangeList.getCompanys(list,"low",low).contains("A"),is(true));
        assertThat(companyRangeList.getCompanys(list,"low",low).contains("B"),is(true));
    }
    @Test
    public void testGetRangeRightWith1Range1() throws Exception {
        int high = 5000;
        assertThat(companyRangeList.getCompanys(list,"high",high).contains("A"),is(true));
        assertThat(companyRangeList.getCompanys(list,"high",high).contains("C"),is(true));
    }
}
