package com.example.tuitioncentre;

public class Main {
    public static void main(String args[]) {
        Database db = new Database(
                "localhost", "3306",
                "tuitioncentre",
                "admin", "admin");
        db.connect();
        db.runQuery("select * from student");

    }
}
