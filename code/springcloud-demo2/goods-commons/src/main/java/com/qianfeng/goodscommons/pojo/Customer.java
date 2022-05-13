package com.qianfeng.goodscommons.pojo;



public class Customer {

    private Integer customerId;
    private String customerName;
    private String customerAddress;
    private Integer customerTicket;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerTicket() {
        return customerTicket;
    }

    public void setCustomerTicket(Integer customerTicket) {
        this.customerTicket = customerTicket;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerTicket=" + customerTicket +
                '}';
    }
}
