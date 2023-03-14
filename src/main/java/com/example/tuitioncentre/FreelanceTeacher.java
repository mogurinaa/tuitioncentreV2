package com.example.tuitioncentre;

public class FreelanceTeacher {
    private Name name;
    private String IC;
    private Address address;
    private String qualification;
    private int yearsExp;
    private float pay = 50;

    public FreelanceTeacher() {
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

    public float calcPay(int hour) {
        float payrate = pay * hour;
        return payrate;
    }

    public static void main(String args[]) {
        FreelanceTeacher ft = new FreelanceTeacher();
        float pay = ft.calcPay(10);
    }
}
