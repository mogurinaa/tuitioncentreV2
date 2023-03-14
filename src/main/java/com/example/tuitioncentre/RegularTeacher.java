package com.example.tuitioncentre;

public class RegularTeacher extends Teacher{
    private float pay;

    public RegularTeacher() {
        System.out.println("RegularTeacher object created!");
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
