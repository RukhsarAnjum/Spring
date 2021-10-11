package com.training.autowirebyname2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private String empName;
    @Autowired
    private Address address;

	@Autowired
    @Qualifier
	private Address address2;


    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress2() {
        return address2;
    }
    public void setAddress2(Address address2) {
        this.address2 = address2;
    }
}
