package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/moblink")
public class bill extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double price =Double.parseDouble(req.getParameter("price"));
	int unit=Integer.parseInt(req.getParameter("units"));
	
double total= price*unit;
req.setAttribute("totalAmount", total);
RequestDispatcher rd=req.getRequestDispatcher("nextLink");
rd.forward(req, resp);
}

}
