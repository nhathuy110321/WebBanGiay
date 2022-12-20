package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.giaybean;
import bo.loaibo;
import bo.giaybo;

/**
 * Servlet implementation class htgiay
 */
@WebServlet("/htgiay")
public class htgiay extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public htgiay() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dsloai = lbo.getloai();
		
		request.setAttribute("dsloai", dsloai);
		
		giaybo sbo = new giaybo();
		ArrayList<giaybean> dsgiay = sbo.getgiay();
		
		if (request.getParameter("search")!=null){
		    	dsgiay = sbo.timKiemTheoTen(dsgiay, request.getParameter("search"));}
		 else if (request.getParameter("ml")!=null){
		    	dsgiay = sbo.timKiemTheoLoai(dsgiay, request.getParameter("ml"));
		    
		    }
		int trang;
		if(request.getParameter("trang") == null) {
			trang = 1;
		}else trang = Integer.parseInt(request.getParameter("trang"));
		
		request.setAttribute("trang", trang);
		
		
		
		
		request.setAttribute("dsgiay", dsgiay);
		RequestDispatcher rd = request.getRequestDispatcher("htgiay.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
