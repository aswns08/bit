/* Value Object
 * => Class 문법을 사용하여 사용자 정의 대이터 타입 만들기
 * 
 * 1) Serializable 인터페이스 구
 * 
 */
package java02.test15;

import java.io.Serializable;

public class Product implements Serializable{
 private static final long serialVersionUID = 1L;

 protected int		no;
 protected String	name;
 protected int		quantity;
 protected int		makerNO;
 
 public Product() {}
 
 public Product(int no, String name, int quantity, int makerNO) {

	this.no = no;
	this.name = name;
	this.quantity = quantity;
	this.makerNO = makerNO;
}


@Override
public String toString() {
	return "Product [no=" + no + ", name=" + name + ", quantity=" + quantity
			+ ", makerNO=" + makerNO + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + makerNO;
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
	Product other = (Product) obj;
	if (makerNO != other.makerNO)
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
public int getMakerNO() {
	return makerNO;
}
public void setMakerNO(int makerNO) {
	this.makerNO = makerNO;
}
 
 
}
