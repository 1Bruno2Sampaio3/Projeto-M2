package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class PartidaFutebol {

	private List<Gol> golsMandantes;
	private List<Gol> golsVizitantes;
	private List<Gol> golsPenaltesMandantes;
	private List<Gol> golsPenaltesVizitantes;
	private List<Cartao> cartoesMandante;
	private List<Cartao> cartoesVizitante;

	public PartidaFutebol() {
		golsMandantes = new ArrayList<Gol>();
		golsVizitantes = new ArrayList<Gol>();
		golsPenaltesMandantes = new ArrayList<Gol>();
		golsPenaltesVizitantes = new ArrayList<Gol>();
		cartoesMandante = new ArrayList<Cartao>();
		cartoesVizitante = new ArrayList<Cartao>();
	}

	public List<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	
	public void serGolVizitante(Gol g)
	{
		golsMandantes.add(g);
	}

	public List<Gol> getGolsVizitantes() {
		return golsVizitantes;
	}
	
	public void setGolVizitante(Gol g)
	{
		golsVizitantes.add(g);
	}

	public List<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	
	public void setGolPenaltMandante(Gol g)
	{
		golsPenaltesMandantes.add(g);
	}

	public List<Gol> getGolsPenaltesVizitantes() {
		return golsPenaltesVizitantes;
	}
	
	public void setGolPenaltVizitante(Gol g)
	{
		golsPenaltesVizitantes.add(g);
	}

	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	
	public void setCartaoMandante(Cartao c)
	{
		cartoesMandante.add(c);
	}

	public List<Cartao> getCartoesVizitante() {
		return cartoesVizitante;
	}

	public void setCartaoVisitante(Cartao c)
	{
		cartoesVizitante.add(c);
	}

}
