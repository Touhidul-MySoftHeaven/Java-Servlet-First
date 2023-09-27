/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
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
public  class FirstServlet implements Servlet{
   
    ServletConfig config;
  @Override
  public void init(ServletConfig config)
  {
      this.config=config;
      System.out.println("Creating Object Initialization....");
  }

    @Override
  public void destroy()
  {
      System.out.println("destroying ....");
  }
   @Override
  public ServletConfig getServletConfig()
  {
      return this.config;
  }
    @Override
  public String getServletInfo()
  {
      return "This is created by 1104011";
  }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter output=response.getWriter();
       output.println("<h1>This is from Servlet Good Working</h1>");
       output.println("<h1>today is "+new Date()+"</h1>");
       
    }

    
  
}
