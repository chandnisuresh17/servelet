import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class serve extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter p = response.getWriter();
		 p.println("Dona is dump");
		
		
	}
}

