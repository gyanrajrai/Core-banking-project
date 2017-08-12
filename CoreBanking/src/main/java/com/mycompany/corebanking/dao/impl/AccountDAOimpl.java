/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corebanking.dao.impl;

import com.mycompany.corebanking.dao.AccountDAO;
import com.mycompany.corebanking.database.DbConnection;
import com.mycompany.corebanking.entity.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin_GYAN
 */
public class AccountDAOimpl implements AccountDAO {

    DbConnection db = new DbConnection();

    @Override
    public List<Account> getAll() throws ClassNotFoundException, SQLException {
        List<Account> acList = new ArrayList<>();
        db.connect();
        String sql = "SELECT * FROM Account";
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Account ac = new Account();
            ac.setId(rs.getInt("id"));
            ac.setName(rs.getString("name"));
            ac.setDescription(rs.getString("desription"));
            ac.setInterest(rs.getFloat("interest"));
            ac.setMinimumBalance(rs.getInt("MinimumBalance"));
            ac.setStatus(rs.getBoolean("staus"));
            acList.add(ac);

        }
        db.close();
        return acList;

    }

    @Override
    public int insert(Account account) throws ClassNotFoundException, SQLException {
        db.connect();
        String sql = "INSERT INTO Account(Name,description,interest,MinimumBalance,status)" + "Values(?,?,?,?,?)";
        PreparedStatement stm = db.initStatement(sql);
        stm.setString(1, account.getName());
        stm.setString(2, account.getDescription());
        stm.setFloat(3, account.getInterest());
        stm.setInt(4, account.getMinimumBalance());
        stm.setBoolean(5, account.isStatus());
       int result= db.update();
       db.close();
        
    
        return result;
    }

}
