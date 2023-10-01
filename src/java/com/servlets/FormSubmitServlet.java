/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.RequestDispatcher;
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
public class FormSubmitServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        System.out.println("This is called from HttpServlet");
        response.setContentType("text/html");
        PrintWriter output=response.getWriter();
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");
        String cars=request.getParameter("cars");
        String horns=request.getParameter("horns");
        if(horns != null)
         { 
               output.println("<h3>Name: "+name+"</h3>");
               output.println("<h3>email: "+email+"</h3>");
               output.println("<h3>password: "+password+"</h3>");
               output.println("<h3>gender: "+gender+"</h3>");
               output.println("<h3>cars: "+cars+"</h3>");
               output.println("<h3>horns: "+horns+"</h3>");
               output.println("<h1>today is "+new Date()+"</h1>");
               
               RequestDispatcher rd= request.getRequestDispatcher("successservlet");
               rd.forward(request, response);
         }else{
        
          output.println("<h3>Please Accept the terms and condition</h3>");
          RequestDispatcher rd= request.getRequestDispatcher("index.html");
          rd.include(request, response);
        }
      
    } 
}
