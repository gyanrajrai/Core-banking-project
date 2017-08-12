/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corebanking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin_GYAN
 */
public class DbConnection {

    private PreparedStatement pm = null;
    private Connection con = null;

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conString = "jdbc:sqlserver://GYAN\\Admin_GYAN:1433;databaseName=Banking;integratedSecurity=true";
        con = DriverManager.getConnection(conString);

    }

    public PreparedStatement initStatement(String sql) throws ClassNotFoundException, SQLException {
        pm = con.prepareStatement(sql);
        return pm;
    }
      public ResultSet query() throws SQLException {
        return pm.executeQuery();
    }
       public int update() throws SQLException {
        return pm.executeUpdate();
    }



    public void close() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
            con = null;
        }
    }

  
}
