package com.lti.demos;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Customer {
private int custNo;
private String custName;
private double billAmount;
public int getCustNo() {
return custNo;
}
@Test
@Disabled

public void setCustNo(int custNo) {
this.custNo = custNo;
}

public String getCustName() {
return custName;
}


public void setCustName(String custName) {
this.custName = custName;
}
public double getBillAmount() {
return billAmount;
}
public void setBillAmount(double billAmount) {
this.billAmount = billAmount;
}
public Customer(int custNo, String custName, double billAmount) {
super();
this.custNo = custNo;
this.custName = custName;
this.billAmount = billAmount;
}

public Customer() {
super();
}
@Override

public String toString() {
return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmount=" + billAmount + "]";
}}

