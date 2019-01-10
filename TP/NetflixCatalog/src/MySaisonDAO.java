import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author npestell
 *
 */
public class MySaisonDAO implements IMySaisonDAO {

	
	@Override
	public List<MySaisonDO> findAll() {
		List<MySaisonDO> saisons = new ArrayList();
		List<Integer> fkSerie = new ArrayList<Integer>(Arrays.asList(1, 1, 2));
		List<Integer> numSaison = new ArrayList<Integer>(Arrays.asList(1, 2, 1));
		List<Integer> nbEpisodes = new ArrayList<Integer>(Arrays.asList(13, 9, 13));
		for (int i = 0; i < 3; i++) {
			MySaisonDO saison = new MySaisonDO();
			saison.setId(i);
			saison.setFk_serie(fkSerie.get(i));
			saison.setNum_saison(numSaison.get(i));
			saison.setNb_episodes(nbEpisodes.get(i));
			saisons.add(saison);
		}

		return saisons;
	}

}
