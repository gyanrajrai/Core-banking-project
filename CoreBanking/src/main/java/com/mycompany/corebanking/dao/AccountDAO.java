/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corebanking.dao;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.corebanking.entity.Account;
import java.sql.SQLException;
/**
 *
 * @author Admin_GYAN
 */
public interface AccountDAO {
    List<Account>getAll() throws ClassNotFoundException,SQLException;
        int insert(Account account) throws ClassNotFoundException,SQLException;

    
    
}
