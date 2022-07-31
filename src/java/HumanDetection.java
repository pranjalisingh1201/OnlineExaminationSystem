/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.javafx.iio.ImageStorage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import below packages for captcha code
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
/**
 *
 * @author DELL
 */
public class HumanDetection extends HttpServlet {

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
        BufferedImage bi=new BufferedImage(150,50,BufferedImage.TYPE_INT_RGB);
        Graphics2D gr= bi.createGraphics();
        gr.setBackground(Color.white);
        gr.clearRect(0, 0, 146, 46);
        Paint p=new Color(0,0,0);
        Font f=new Font("SansSerif",Font.ITALIC,30);
        Color c= new Color(0,0,0);
        Rectangle r =new Rectangle();//width,height,width,height
        gr.setPaint(p);
        gr.drawRect(0, 0, 148, 48);
        gr.setColor(c);
        gr.setFont(f);
        String mycode[]=new String[]{"Mykss","Qwerty","xY4Un","S45Nio","uP2Nm","Rt3iO","eNi08m","tTni92","2Hopw","90jsfw","7xGmw","9wEty"};
        Random ran= new Random();
        int index=Math.abs(ran.nextInt()%mycode.length);
        String code=mycode[index];
        request.getSession().setAttribute("captcha",code);
        char []arr=code.toCharArray();
        
        gr.drawString(code, 20, 30);
        gr.dispose();
        response.setContentType("image/png");
        OutputStream os=response.getOutputStream();
        ImageIO.write(bi,"png", os);
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
        processRequest(request, response);
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
