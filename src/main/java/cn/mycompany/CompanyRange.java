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
    private int high;
    private int low;
    private String name;

    public CompanyRange(String name, int low, int high) {
        this.name = name;
        this.low = low;
        this.high = high;
    }


    public static List<String> getCompanys(List<CompanyRange> list, int low, int high) {
        List<String> companyName = new ArrayList<String>();
        for (CompanyRange companyRange : list) {
            if (companyRange.contain(low) || companyRange.contain(high)) {
                companyName.add(companyRange.getName());
            }
        }
        return companyName;
    }

    private boolean contain(int range) {
        return range >= low && range <= high;
    }

    public String getName() {
        return name;
    }
}

