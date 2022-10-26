package com.sap.sapproject.invoice;
import javax.persistence.*;

@Entity
@IdClass(InvoiceKey.class)
@Table(name = "Invoice_Header")
public class InvoiceHeader {
    @Id
    private int invoiceNumber;

    private int totalAmount;
    private String externalSystem;
    private double netAmount;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getExternalSystem() {
        return externalSystem;
    }

    public void setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }


}
