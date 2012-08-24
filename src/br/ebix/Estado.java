package br.ebix;

public enum Estado {

	ALAGOAS(1, "ALAGOAS"), SERGIPE(2, "SERGIPE"), CEARA(3, "CEARA");

	private int id;
	private String value;
	
	private Estado(int id, String value) {
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
