import java.util.ArrayList;
import java.util.List;

public class SerieListeDTO {
	List<MySerieDTO> serieList = new ArrayList();

	public List<MySerieDTO> getSerieList() {
		return serieList;
	}

	public void setSerieList(List<MySerieDTO> serieList) {
		this.serieList = serieList;
	}
}
