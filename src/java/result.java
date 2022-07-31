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
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class result extends HttpServlet {

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
            out.println("<title>Servlet result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet result at " + request.getContextPath() + "</h1>");
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
    private Object session;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String arr2[] = new String[20];//database values of answer
        String arr[] = new String[20];//answers of students
        HttpSession session=request.getSession();
        String id =(String)session.getAttribute ("UserId");
        arr[0] = request.getParameter("1");
        arr[1] = request.getParameter("2");
        arr[2] = request.getParameter("3");
        arr[3] = request.getParameter("4");
        arr[4] = request.getParameter("5");
        arr[5] = request.getParameter("6");
        arr[6] = request.getParameter("7");
        arr[7] = request.getParameter("8");
        arr[8] = request.getParameter("9");
        arr[9] = request.getParameter("10");
        arr[10] = request.getParameter("11");
        arr[11] = request.getParameter("12");
        arr[12] = request.getParameter("13");
        arr[13] = request.getParameter("14");
        arr[14] = request.getParameter("15");
        arr[15] = request.getParameter("16");
        arr[16] = request.getParameter("17");
        arr[17] = request.getParameter("18");
        arr[18] = request.getParameter("19");
        arr[19] = request.getParameter("20");

        DbManager dbm = new DbManager();
        dbm.cmd = "Select Answer from qp";
        ResultSet rs = dbm.DQL();
        try {
            int x = 0;
            while (rs.next()) 
            {
                arr2[x] = rs.getString("Answer");
               
                x++;
            }
            int count=0;
            for(int i=0;i<20;i++)
            {
                if(arr[i]!=null)
                {
                    if(arr[i].equals(arr2[i]))
                    {
                        count++;
                    }
                }
            }
            int t=20,o,i;
            i=t-count;
            o=t-i;
          String str="";
          for(int z=0;z<20;z++)
          {
           str+=arr[z];  
          }
          DbManager db=new DbManager();
          db.cmd="Insert into res values('"+id+"','"+o+"','"+i+"','"+t+"','"+str+"')";
          boolean status=db.DML();
          if(status==true)
          {
           pw.print("<script>window.location='UserZone/res.jsp?o="+o+"&i="+i+"&t="+t+"'</script>");  
          }
          else
          {
           pw.print("<script>alert(Unable to save the Result.);</script>");   
          }
        } 
        catch (Exception e) {
            
        }
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
