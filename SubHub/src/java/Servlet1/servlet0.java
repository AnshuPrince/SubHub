/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet1;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
/**
 *
 * @author Anshu_Prince
 */
public class servlet0 implements Servlet{
    
    @Override
    public void init(ServletConfig sc)
    {
        sc = config;
        System.out.println("Inside init  .Runs only once");
    }
    @Override
    public void service(ServletRequest req,ServletResponse rs) throws IOException
    {
        PrintWriter out = rs.getWriter();
        out.println("Hello servlet");
    }
    @Override
    public String getServletInfo()
    {
        return "No information to show";
    }
    @Override
    public void destroy()
    {
        System.out.println("In destroy");
    }

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig()
    {
        return config;
    }
    private ServletConfig config;
}
