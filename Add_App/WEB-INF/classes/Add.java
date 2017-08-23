import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet(urlPatterns={"/add"})

public class Add extends HttpServlet{
	public Add(){}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		int c = a + b;
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println(c);
	}//+91 7000207029 
}
