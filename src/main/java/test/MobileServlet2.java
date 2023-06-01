package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Ref;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/nextLink")
public class MobileServlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String model=req.getParameter("model");
	String company=req.getParameter("company");
	String osType=req.getParameter("OS");
	double amount=(double) req.getAttribute("totalAmount");
	double finalAmt=0.0;
	if (osType.equalsIgnoreCase("android")) {
		finalAmt=amount-amount-0.1;
	} else {
		finalAmt=amount-amount-0.05;
	}
	
	PrintWriter pw =resp.getWriter();
	pw.print("<h1> Model Name is _"+model+"</h1>");
	pw.print("<h1> Cmpany Name is _"+company+"</h1>");
	pw.print("<h1> OS-Type Name is _"+osType+"</h1>");
	pw.print("<h1> Amount Name is _"+amount+"</h1>");
	pw.print("<h1> Final-Amount Name is _"+finalAmt+"</h1>");
	
}


}
