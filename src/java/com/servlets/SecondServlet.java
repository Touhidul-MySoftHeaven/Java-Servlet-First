/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author User
 */
public class SecondServlet extends GenericServlet{
    
     @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter output=response.getWriter();
       output.println("<h1>This is from Servlet Good AfterNoon</h1>");
       output.println("<h1>today is "+new Date()+"</h1>");
       
    }
}
