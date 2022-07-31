/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DBman.DbManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class saveqp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet saveqp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet saveqp at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Q=request.getParameter("Q");
        String A=request.getParameter("A");
        String B=request.getParameter("B");
                String C=request.getParameter("C");
                        String D=request.getParameter("D");
                                String ANS=request.getParameter("ANS");
PrintWriter pw=response.getWriter();
DbManager db=new DbManager();
db.cmd="Select Answer from qp";
ResultSet r=db.DQL();
int count=0;
try
{
    while(r.next())
    { 
        count++;
    }
}catch (Exception e)
{
}
if(count>=20)
{
    pw.print("<script>alert('Sorry!You cannot add more than fixed Questions.');window.location='Admin/upload.jsp';</script>"); 
}
{
DbManager dbm=new DbManager();
dbm.cmd="Insert into qp(Question,A,B,C,D,Answer) values('"+Q+"','"+A+"','"+B+"','"+C+"','"+D+"','"+ANS+"')";
boolean status=dbm.DML();
if(status==true)
{
    pw.print("<script>alert('Question Added Successfully!');window.location='Admin/upload.jsp';</script>");
}
else
{
   pw.print("<script>alert(' Unable to Add the Question');window.location='Admin/upload.jsp';</script>"); 
}}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
