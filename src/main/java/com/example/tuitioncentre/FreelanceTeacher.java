package com.example.tuitioncentre;
// inheritance
public class FreelanceTeacher extends Teacher {
    private float payrate = 50;

    public FreelanceTeacher() {
    }

    public float calcPay(int hour) {
        float pay = payrate * hour;
        return pay;
    }

    public static void main(String args[]) {
        FreelanceTeacher ft = new FreelanceTeacher();
        float pay = ft.calcPay(10);
    }
}
