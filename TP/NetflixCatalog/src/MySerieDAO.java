import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author npestell
 * 
 */
public class MySerieDAO implements IMySerieDAO {

	/**
	 *  
	 * @see IMySerieDAO#findAll()
	 * retourne les séries
	 */
	@Override
	public List<MySerieDO> findAll() {
		final List<MySerieDO> series = new ArrayList<MySerieDO>();
		final List<String> nom = new ArrayList<String>(Arrays.asList("La casa de Papel", "The 100", "Black Mirror"));
		final List<Boolean> productionOriginal = new ArrayList<Boolean>(Arrays.asList(true, false, true));
		final List<String> annee = new ArrayList<String>(Arrays.asList("2017", "2017", "2017"));
		for (int i = 0; i < 3; i++) {
			MySerieDO serie = new MySerieDO();
			serie.setId(i);
			serie.setNom(nom.get(i));
			serie.setProduction_originale(productionOriginal.get(i));
			serie.setAnnee(annee.get(i));
			series.add(serie);
		}

		return series;
	}

}
