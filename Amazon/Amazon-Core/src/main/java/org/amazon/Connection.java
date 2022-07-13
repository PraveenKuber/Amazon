package org.amazon;

public class Connection {
    /*Object creation declaration*/
    private static Connection connection=null;

    /*Private constructor*/
    private Connection(){
    }

    /*Get instance*/
    public static Connection getInstance(){
        if(connection==null){
            connection = new Connection();
        }
        return connection;
    }

    public void insertData(){
        System.out.printf("Insert data");
    }

    public void update(){
        System.out.printf("Insert data");
    }

    public void delete(){
        System.out.printf("Insert data");
    }



}
