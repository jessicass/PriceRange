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

    public boolean contain(int low, int high) {
        return !((low < rangeLow && high < rangeLow) || (low > rangeHigh && high > rangeHigh)) ;
    }

    public boolean contain(String rangeStr, int range) {
        if(rangeStr.equalsIgnoreCase("low")){
            return !(range > rangeHigh);
        }
        if (rangeStr.equalsIgnoreCase("high")) {
            return !(range < rangeLow);
        }
        return false;
    }
}

