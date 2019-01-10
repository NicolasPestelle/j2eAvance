import java.util.ArrayList;
import java.util.List;

public class MySeriesListService implements IMySeriesListService {

	@Override
	public List<MySerieDTO> findAll() {
		MySerieDAO serieDAO = new MySerieDAO();
		MySaisonDAO saisonDAO = new MySaisonDAO();
		List<MySerieDO> series = serieDAO.findAll();
		List<MySaisonDO> saisons = saisonDAO.findAll();
		List<MySerieDTO> resultat = new ArrayList();
		MySerieDTO newDTO;

		for (int i = 0; i < series.size(); i++) {
			newDTO = new MySerieDTO();
			newDTO.setNom(series.get(i).getNom());
			newDTO.setSaisons(SumSaison(saisons, i+1));
			newDTO.setTotal_episodes(SumEpisode(saisons, i+1));
			resultat.add(newDTO);
		}

		return resultat;
	}

	public int SumEpisode(List<MySaisonDO> saisons, int id) {
		int resultat = 0;

		for (int i = 0; i < saisons.size(); i++) {
			if (saisons.get(i).getFk_serie() == id)
				resultat+= saisons.get(i).getNb_episodes();
		}

		return resultat;
	}

	public int SumSaison(List<MySaisonDO> saisons, int id) {

		int resultat = 0;

		for (int i = 0; i < saisons.size(); i++) {
			if (saisons.get(i).getFk_serie() == id)
				resultat++;
		}

		return resultat;
	}

}
