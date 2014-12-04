package java63.web03.domain;

import java.io.Serializable;

public class ProductListItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected int       no;
	protected String    name;
	protected int       quantity;
	protected int       makerNo;
	protected String		maker;
	
	
	@Override
	public String toString() {
		return "ProductListItem [no=" + no + ", name=" + name + ", quantity="
				+ quantity + ", makerNo=" + makerNo + ", maker=" + maker + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + makerNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductListItem other = (ProductListItem) obj;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (makerNo != other.makerNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMakerNo() {
		return makerNo;
	}
	public void setMakerNo(int makerNo) {
		this.makerNo = makerNo;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
}

