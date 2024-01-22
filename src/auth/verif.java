package auth;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.SQL;
import metier.Admin;

/**
 * Servlet implementation class verif
 */
@WebServlet("/verif")
public class verif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verif() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String email=request.getParameter("email");
		String compte=request.getParameter("compte");
       
        if(email==null ||compte==null){
        	
        	   out.print("<p style='color: red; position: absolute; top: 73%; left: 40% ;'>vueillez entrez tous les champs!</p>");
        			RequestDispatcher r=request.getRequestDispatcher("/facture.jsp");
        					
        			r.include(request, response);
        			
        }

        	 else{
        		 RequestDispatcher r=request.getRequestDispatcher("/menu.jsp");
					
     			r.forward(request, response);
        		} 
       
       
        
	}

}
