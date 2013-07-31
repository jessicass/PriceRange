package cn.mycompany;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 13-7-31
 * Time: 上午9:22
 * To change this template use File | Settings | File Templates.
 */
public class CompanyRangeList {
    private List<CompanyRange> companyRangeList = new ArrayList<CompanyRange>();
    private List<String> companyName = new ArrayList<String>();;

    public void addCompanyRange(CompanyRange c) {
        companyRangeList.add(c);
    }

    public List<CompanyRange> getCompanyRangeList() {
        return companyRangeList;
    }

    public List<String> getCompanys(List<CompanyRange> list, int low, int high) {
        for (CompanyRange companyRange : list) {
            if (companyRange.contain(low, high)) {
                companyName.add(companyRange.getName());
            }
        }
        return companyName;
    }

    public List<String> getCompanys(List<CompanyRange> list, String rangeStr, int range) {
        for (CompanyRange companyRange : list) {
            if (companyRange.contain(rangeStr, range)) {
                companyName.add(companyRange.getName());
            }
        }
        return companyName;
    }
}
