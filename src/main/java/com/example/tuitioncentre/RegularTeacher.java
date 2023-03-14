package com.example.tuitioncentre;

public class RegularTeacher {
    private Name name;
    private String IC;
    private Address address;
    private String qualification;
    private int yearsExp;
    private float pay;

    public RegularTeacher() {
        System.out.println("RegularTeacher object created!");
    }

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

    public float calcPay() {
        if (yearsExp < 5)  {
            pay = 2000;
        }
        else if (yearsExp < 10) {
            pay = 4000;
        }
        else if (yearsExp < 15) {
            pay = 8000;
        }
        else {
            pay = 10000;
        }
        return pay;
    }
}
