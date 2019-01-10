
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class NetflixCatalogController
 */
@WebServlet("/NetflixCatalogController")
public class NetflixCatalogController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		// a faire : différent packet : dto, do, dao,beans, 
		// serveur sur la fac : ps aux | grep tomcat
		// 25904  0.3  1.3 7795564 219020 ?      Sl   13:29   0:35 ...
		// kill -9 25904
		// documenter tout les public !
		// public/protected/private/default(que dans el package)
		// final sur variable qui n'as pas vocation a etre réinstancié
		// ctrl + shift+ f = formateur code
		// dés qu'on peux on déclare avec l'interface (polymorphisme)
		
		final IMySeriesListService seriesListService = new MySeriesListService();

		final SerieListeDTO view = new SerieListeDTO();
		view.setSerieList(seriesListService.findAll());

		response.setContentType("application/json");
		response.getWriter().append(new Gson().toJson(view));

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
