package io.split.dbm.userstore;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CargillServlet
 */
@WebServlet("/query")
public class UserstoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	static Map<String, String> cache = new TreeMap<String, String>();
	static {
		cache.put("adam", "[ \"gamma\", \"delta\", \"omega\" ]");
		cache.put("bruce", "[ \"beta\" ]");
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserstoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(cache.get(request.getParameter("username")));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
