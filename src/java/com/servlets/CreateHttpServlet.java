/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author User
 */
public class CreateHttpServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        System.out.println("This is called from HttpServlet");
        response.setContentType("text/html");
        PrintWriter output=response.getWriter();
       output.println("<h1>This is from Servlet Good Working</h1>");
       output.println("<h1>today is "+new Date()+"</h1>");
    }        
    
}
