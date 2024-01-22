package auth;

import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


import dao.SQL;
import metier.Admin;

/**
 * Servlet implementation class adminAut
 */
@WebServlet("/adminAut")
public class adminAut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminAut() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
        String login=request.getParameter("name");
        String pass=request.getParameter("pass");
        Admin adm = new Admin();
        adm.setLogin(login);;
        adm.setPass(pass);;
        //out.print(adm.getPassword() + "     " + Password);
        
        int exist =SQL.checkAdmin(adm);
        
        if(exist==1){
        	
        	response.sendRedirect("mod.jsp");
        	
        }
		else{
			
			JOptionPane.showMessageDialog(null,"login or Password Incorrecte","Message",JOptionPane.INFORMATION_MESSAGE);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			}
	}

	}


