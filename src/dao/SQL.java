package dao;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

import metier.Admin;
import metier.Client;
import metier.Produit;

public class SQL {
	
	
	    public  static Connection getConnection()  throws ClassNotFoundException, SQLException{
	        String dbDriver = "com.mysql.jdbc.Driver";
	        String dbURL = "jdbc:mysql:// localhost:3306/";
	        // Database name to access
	        String dbName = "mini";
	        String dbUsername = "root";
	        String dbPassword = "";
	
	       Class.forName(dbDriver);
	        Connection con = DriverManager.getConnection(dbURL + dbName,
	                                                     dbUsername, 
	                                                     dbPassword);
	        return con;
	    }
	
	//*********************************************************************************************
	
	//Ajouter Un Client a la base de donnees
	public static int inserer(Client c ) {
		int st=0;

		try {
			String sql="INSERT INTO `Client`( `nom_complet`, `pass`) VALUES (?,?)";
			
			Connection con = getConnection();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,c.getLogin());
			preparedStatement.setString(2,c.getPass());
			
			st=preparedStatement.executeUpdate();
			con.close();
			
		} catch (SQLException | ClassNotFoundException ee) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,ee,null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		return st;
	}
	
	//************************************************************************************
	
	//Ajouter Un Produit a la base de donnees
		public static int inserer(Produit p ) {
			int st=0;

			try {
				String sql="INSERT INTO `Produit`( `libelle`,`prix`,`lien`) VALUES (?,?,?)";
				
				Connection con = getConnection();
				PreparedStatement preparedStatement=con.prepareStatement(sql);
				preparedStatement.setString(1,p.getLibelle());
				preparedStatement.setFloat(2,p.getPrix());
				preparedStatement.setString(3,p.getLien());
				st=preparedStatement.executeUpdate();
				con.close();
				
			} catch (SQLException | ClassNotFoundException ee) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,ee,null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			return st;
		}
		
	
	
	//************************************************************************************
	public static int checkAdmin(Admin ad) {
    	int exist=0;
    	
    	try {
    	String sql="SELECT * FROM `Admin`  WHERE  login = ? and pass = ?";
    	Connection con =getConnection();
    	PreparedStatement preparedStatement=con.prepareStatement(sql);
    	preparedStatement.setString(1,ad.getLogin());
    	preparedStatement.setString(2,ad.getPass());
    	ResultSet resultSet=preparedStatement.executeQuery();
    	
    	if(resultSet.next()) {
    	            
    	exist=1;
    	
    	}
    	
    	con.close();
    	
    	} catch (SQLException | ClassNotFoundException e) {
    	// TODO Auto-generated catch block
    	JOptionPane.showMessageDialog(null,e+"hello","Message",JOptionPane.INFORMATION_MESSAGE);
    	}
    	return exist;
    	}
	
	//*************************************************************************************************************
	
	public static List<Produit> getProduit() {
		List<Produit> list=new ArrayList<Produit>();

		try {
			String sql="SELECT * FROM `Produit`";
			Connection con = SQL.getConnection();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				           Produit p=new Produit();
                           p.setLibelle(resultSet.getString(1));
                           p.setPrix(resultSet.getFloat(2));
                           p.setLien(resultSet.getString(3));
                            
                            
				list.add(p);
			}

			con.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//*******************************************************************************************************
	public static int delete(int code) {
		int st=0;

		try {
			String sql="DELETE FROM `Produit`  WHERE code_produit="+code;
			Connection con = SQL.getConnection();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			st=preparedStatement.executeUpdate();
			
			
			con.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
//*************************************************************************************************************
	public static int ModifierProduit(Produit p) {
		int st=0;

		try {
			//String sql="UPDATE `Produit` SET `libelle`=?,`prix`=?,`lien`=? WHERE code_produit=?";
			String sql="UPDATE `Produit` SET `libelle`=?,`prix`=?,`lien`=? WHERE ?";
			Connection con = SQL.getConnection();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,p.getLibelle());
			preparedStatement.setFloat(2,p.getPrix());
			preparedStatement.setString(3,p.getLien());
			
			
			st=preparedStatement.executeUpdate();
			con.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
	//*************************************************************************
	public static Produit getSProduit(int libelle) {
		Produit p=null;

		try {
			String sql="SELECT * FROM `Produit` WHERE  libelle=?";
			Connection con =getConnection();
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,p.getLibelle());
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
               p=new Produit();
				p.setLibelle(resultSet.getString("libelle"));
				p.setPrix(resultSet.getFloat("prix"));
				p.setLien(resultSet.getString("lien"));
				
			}

			con.close();
			
		} catch (SQLException | ClassNotFoundException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		return p;
	}
	
	
	}

 
