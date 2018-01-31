/*********************************************************
 * 2017fall CSE 682 Project
 * Title: FindIt
 * Purpose: A restaurant recommendation web application
 * Group Leader: Chunyang Zhan
 * Group Member: Xiling Wang, Honghao An, Chenyang Du, Yue Zhao
 * 				 Haiyang Zhang, Yufei Fang
 * 
 * Version 1.1
 * Updated Factory pattern, added Ticketmaster API as test
 * 
 * Version History:
 * Version 1.0: Implement main functionality
 * 
 *********************************************************/

package rpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class UserLogout
 */
@WebServlet("/logout")
public class UserLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession session=request.getSession();  
			session.invalidate();  
			RpcHelper.writeJsonObject(response, new JSONObject().put("result", "SUCCESS"));
			return;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}

	
}
