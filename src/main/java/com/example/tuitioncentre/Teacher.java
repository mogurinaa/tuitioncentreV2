package com.example.tuitioncentre;

public class Teacher {
    Name name;
    String IC;
    Address address;
    String qualification;
    int yearsExp;

    public void setName(String first, String middle, String last) {
        name = new Name(first, middle, last);
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setAddress(String street, String district, String postcode, String state) {
        address = new Address(street, district, postcode, state);
    }

    public String getFName() {
        String firstname = this.name.getFName();
        return firstname;
    }

    public void setQual(String qual) {
        qualification = qual;
    }
    public void setExp(int exp) {
        yearsExp = exp;
    }


}
