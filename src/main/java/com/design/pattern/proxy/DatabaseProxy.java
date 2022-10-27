package com.design.pattern.proxy;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseProxy {

    private static DatabaseProxy instance;
    Connection con;

    public DatabaseProxy()
    {
        this.OpenConnection();

    }

    public void OpenConnection()
    {
        try {
            this.con = DriverManager.getConnection(SystemConfiguration.databaseConnectionUrl, SystemConfiguration.databaseConnectionUser, SystemConfiguration.databaseConnectionPassword);
            if (this.con == null) {
                System.out.println("==>DBConnect: getConnection: connection null ");
            }
        }
        catch (Exception ex) {
            System.out.println("==>DBConnect: getConnection: exception: " + ex.getMessage());
        }

    }

    public static void main(String[] args) {

        DatabaseProxy databaseProxy = new DatabaseProxy();
        databaseProxy.OpenConnection();
    }

}
