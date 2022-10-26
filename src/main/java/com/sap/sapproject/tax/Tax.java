package com.sap.sapproject.tax;
import javax.persistence.*;

@Entity
@IdClass(TaxKey.class)
@Table(name = "Tax")
public class Tax {
    @Id
    private String country;
    @Id
    private String taxCode;

    private int taxPercentage;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
