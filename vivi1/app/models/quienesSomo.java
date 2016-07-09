package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class quienesSomo extends Model {
	private int idQuienesSomos;
	private String historiaQuienesSomos;
	private String misionQuienesSomos;
	
	
	public quienesSomo(int idQuienesSomos, String historiaQuienesSomos,
			String misionQuienesSomos) {
		super();
		this.idQuienesSomos = idQuienesSomos;
		this.historiaQuienesSomos = historiaQuienesSomos;
		this.misionQuienesSomos = misionQuienesSomos;
	}
	
	public int getIdQuienesSomos() {
		return this.idQuienesSomos;
	}

	public void setIdQuienesSomos(int idQuienesSomos) {
		this.idQuienesSomos = idQuienesSomos;
	}

	public String getHistoriaQuienesSomos() {
		return this.historiaQuienesSomos;
	}

	public void setHistoriaQuienesSomos(String historiaQuienesSomos) {
		this.historiaQuienesSomos = historiaQuienesSomos;
	}

	public String getMisionQuienesSomos() {
		return this.misionQuienesSomos;
	}

	public void setMisionQuienesSomos(String misionQuienesSomos) {
		this.misionQuienesSomos = misionQuienesSomos;
	}


}
