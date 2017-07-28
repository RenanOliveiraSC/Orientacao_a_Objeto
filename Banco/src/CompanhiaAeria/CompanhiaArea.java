package CompanhiaAeria;

import java.util.List;

public class CompanhiaArea {

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;

	public List<Boing> getBoings() {
		return boings;
	}

	public void setBoings(List<Boing> boings) {
		this.boings = boings;
	}

	public List<Monomotor> getMonomotores() {
		return monomotores;
	}

	public void setMonomotores(List<Monomotor> monomotores) {
		this.monomotores = monomotores;
	}

	public List<Bimotor> getBimotores() {
		return bimotores;
	}

	public void setBimotores(List<Bimotor> bimotores) {
		this.bimotores = bimotores;
	}

	public double retornaFaturamentoPassagens(){
		//TODO implmentar o calculo do faturamento
		return 0d;
	}
}
