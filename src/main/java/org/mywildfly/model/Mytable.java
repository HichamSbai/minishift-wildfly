package org.mywildfly.model;
// Generated 06.08.2017 15:43:53 by Hibernate Tools 5.2.0.Final

public class Mytable implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2039165087050336934L;
	private int id;
	private String name;

	public Mytable() {
	}

	public Mytable(int id) {
		this.id = id;
	}

	public Mytable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
