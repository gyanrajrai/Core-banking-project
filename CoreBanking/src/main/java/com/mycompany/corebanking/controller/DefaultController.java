/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corebanking.controller;

import com.mycompany.corebanking.dao.AccountDAO;
import com.mycompany.corebanking.dao.impl.AccountDAOimpl;
import com.mycompany.corebanking.entity.Account;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "account", urlPatterns ="{/}")
public class DefaultController extends HttpServlet {

    private AccountDAO acccountDAO = new AccountDAOimpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewpath = "/WEB-INF/account/";
        String page = "index.jsp";
        try {
            String uri = request.getRequestURI().toLowerCase();
            if (uri.contains("/add")) {
                page = "add.jsp";

            } else {
                request.setAttribute("accounts", acccountDAO.getAll());

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

        request.getRequestDispatcher(viewpath + page).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Account ac = new Account();
        ac.setName(request.getParameter("accountName"));
        ac.setName(request.getParameter("accountDescription"));

        ac.setDescription(request.getParameter("interest"));

        ac.setMinimumBalance(Integer.parseInt(request.getParameter("minimumBalance")));

        ac.setStatus(request.getParameter("status") != null);
        try{
            int result=acccountDAO.insert(ac);
            response.sendRedirect(request.getContextPath()+"/accounts");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
      

    }

}
