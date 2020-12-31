package Model;

import java.util.ArrayList;

public class Manufacturers {
    private String siteAddress;
    private String siteRegionState;
    private String reportSource;
    private String officePhoneNumber;
    private String siteName;
    private ArrayList< Object > childCompanies = new ArrayList < Object > ();


    // Getter Methods

    public String getSiteAddress() {
        return siteAddress;
    }

    public String getSiteRegionState() {
        return siteRegionState;
    }

    public String getReportSource() {
        return reportSource;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public String getSiteName() {
        return siteName;
    }

    public ArrayList<Object> getChildCompanies() {
        return childCompanies;
    }

    // Setter Methods

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public void setSiteRegionState(String siteRegionState) {
        this.siteRegionState = siteRegionState;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setChildCompanies(ArrayList<Object> childCompanies) {
        this.childCompanies = childCompanies;
    }
}
