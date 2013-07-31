package cn.mycompany;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 13-7-30
 * Time: 下午5:56
 * To change this template use File | Settings | File Templates.
 */
public class CompanyRange {
    private int rangeHigh;
    private int rangeLow;
    private String name;

    public CompanyRange(String name, int rangeLow, int rangeHigh) {
        this.name = name;
        this.rangeLow = rangeLow;
        this.rangeHigh = rangeHigh;
    }

    public String getName() {
        return name;
    }

    public static List<String> getCompanys(List<CompanyRange> list, int low, int high) {
        List<String> companyName = new ArrayList<String>();
        for (CompanyRange companyRange : list) {
            if (companyRange.contain(low, high)) {
                companyName.add(companyRange.getName());
            }
        }
        return companyName;
    }

    private boolean contain(int low, int high) {
        return !((low < rangeLow && high < rangeLow) || (low > rangeHigh && high > rangeHigh)) ;
    }
}

