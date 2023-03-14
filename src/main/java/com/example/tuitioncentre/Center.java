package com.example.tuitioncentre;

// composition of teachers and student batches
// there should be method for add and info display
public class Center {
    RegularTeacher rgTeacher[] = new RegularTeacher[3];
    FreelanceTeacher flTeacher[] = new FreelanceTeacher[3];
    StudentBatch sb[] = new StudentBatch[3];
    int rgSz = 0, flSz = 0, sbSz = 0;
    String name;
    String address;

    public void addRGT(RegularTeacher rt) {
        this.rgTeacher[rgSz] = rt;
        rgSz++;
    }

    public void addFLT(FreelanceTeacher fl) {
        this.flTeacher[flSz] = fl;
        flSz++;
    }

    public void addSB(StudentBatch sb) {
        this.sb[sbSz] = sb;
        sbSz++;
    }

    public RegularTeacher[] getRgTeacher() {
        return rgTeacher;
    }

    public FreelanceTeacher[] getFlTeacher() {
        return flTeacher;
    }

    public StudentBatch[] getSb() {
        return sb;
    }


    public int getRgSz() {
        return rgSz;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
