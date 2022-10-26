package com.sap.sapproject.invoice;
import javax.persistence.*;

@Entity
@IdClass(InvoiceKey.class)
@Table(name = "Invoice_Item")
public class InvoiceItem {
    @Id
    private int invoiceNumber;

    private int itemNumber;
    private String country;
    private String taxCode;
    private int amount;
    private double netComputedAmount;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getNetComputedAmount() {
        return netComputedAmount;
    }

    public void setNetComputedAmount(double netComputedAmount) {
        this.netComputedAmount = getAmount();
    }

}