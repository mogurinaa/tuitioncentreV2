package com.example.tuitioncentre;

import java.sql.*;

public class Database {
    private String url;
    private String port;
    private String db;
    private String username;
    private String passwd;
    private Connection con;
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public Database(String url, String port, String db,
                    String username, String passwd) {
        try {
            Class.forName(driver);
        }
        catch(Exception e){ System.out.println(e);}

        // assign attributes
        this.url = url;
        this.port = port;
        this.db = db;
        this.username = username;
        this.passwd = passwd;
    }

    public void connect() {
        // change string to attribute
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://"+this.url + ":" +this.port+"/"+this.db,
                    this.username, this.passwd);
        }
        catch(Exception e){ System.out.println(e);}

    }

    public void runQuery(String query) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
                System.out.println(rs.getString(1));
        }
        catch(Exception e){ System.out.println(e);}

    }

    public void close() {
        try {
            con.close();
        }
        catch(Exception e){ System.out.println(e);}
    }

}