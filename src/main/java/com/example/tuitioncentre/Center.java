package com.example.tuitioncentre;

import java.util.ArrayList;

// composition of teachers and student batches
// there should be method for add and info display
public class Center {
    String name;
    String address;
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<StudentBatch> sbs = new ArrayList<StudentBatch>();

    public void addStudentBatch(StudentBatch sb) {
        sbs.add(sb);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void displayTeachers() {

    }

    public static void main(String args[]) {
        Center ipohcenter = new Center();
        RegularTeacher rteacher = new RegularTeacher();
        FreelanceTeacher fteacher = new FreelanceTeacher();

        // polymorphism
        ipohcenter.addTeacher(rteacher);
        ipohcenter.addTeacher(fteacher);
        ipohcenter.displayTeachers();
    }
}
