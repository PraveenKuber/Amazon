package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        DBConnection dbConnection = new DBConnection();
        dbConnection.setDBName("ddddd");
        dbConnection.setDBUrl("1.2.3.4");
        dbConnection.setDBUser("PK");


    }
}
