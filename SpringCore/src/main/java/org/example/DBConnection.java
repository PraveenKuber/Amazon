package org.example;

public class DBConnection {
    public String DBName;
    public String DBUrl;
    public String DBUser;


    public String getDBName() {
        return DBName;
    }

    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    public String getDBUrl() {
        return DBUrl;
    }

    public void setDBUrl(String DBUrl) {
        this.DBUrl = DBUrl;
    }

    public String getDBUser() {
        return DBUser;
    }

    public void setDBUser(String DBUser) {
        this.DBUser = DBUser;
    }

    public void getAllInfo(){
        System.out.printf("Display::::"+getDBName()+" "+getDBUrl()+" "+getDBUser());
    }
}
