package com.ethan.model;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class CustomerOrder {

    public int getAge() {
        return age;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public PcPart getPartOrdered() {
        return partOrdered;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPartOrdered(PcPart partOrdered) {
        this.partOrdered = partOrdered;
    }

    public CustomerOrder(String forename, int age, String surname, String fullAddress, String mobileNumber, PcPart partOrdered) {
        this.forename = forename;
        this.age = age;
        this.surname = surname;
        this.fullAddress = fullAddress;
        this.mobileNumber = mobileNumber;
        this.partOrdered = partOrdered;
    }

    private int age;
    private String forename;
    private String surname;
    private String fullAddress;
    private String mobileNumber;
    private PcPart partOrdered;
}
