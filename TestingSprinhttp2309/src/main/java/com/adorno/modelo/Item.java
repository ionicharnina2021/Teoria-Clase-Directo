package com.adorno.modelo;


import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {

	private long id = -1;
	private String description;
	private boolean checked=false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Item() {
	}

	public Item(long id, String description) {
		this.id = id;
		this.description = description;
	}

	public Item(long id, String description, boolean checked) {
		this.id = id;
		this.description = description;
		this.checked = checked;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;
		Item item = (Item) o;
		return description.equals(item.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}
}
