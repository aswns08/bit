/* Value Object
 * => Class 문법을 사용하여 사용자 정의 데이터 타입 만들기
 * 
 * 1) Serializable 인터페이스 구현
 *    => SerialVersionUID 스태틱 변수 선언
 * 
 * 2) 인스턴스 변수 선언
 * 
 * 3) setter/getter 생성
 * 
 * 4) 기본 생성자와 파라미터 값을 받는 생성자 선언
 * 
 * 5) equals()/hashCode() 메서드 오버라이딩
 * 
 * 6) toString() 오버라이딩
 */
package java02.test20.server;

import java.io.Serializable;

public class Member implements Serializable, Cloneable {
  private static final long serialVersionUID = 1L;
  
  protected String		uid;
  protected String		pwd;
  protected String		email;
  protected String		uname;
  protected String		tel;
  protected String		fax;
  protected String		addr;
  protected String		phot;
  protected int			ano;
  

  @Override
  public Member clone() throws CloneNotSupportedException {
    return (Member) super.clone();
  }
  
  public Member() {}
  

public Member(String uid, String pwd, String email, String uname, String tel,
		String fax, String addr, String phot, int ano) {
	this.uid = uid;
	this.pwd = pwd;
	this.email = email;
	this.uname = uname;
	this.tel = tel;
	this.fax = fax;
	this.addr = addr;
	this.phot = phot;
	this.ano = ano;
}

@Override
public String toString() {
	return "Member [uid=" + uid + ", pwd=" + pwd + ", email=" + email
			+ ", uname=" + uname + ", tel=" + tel + ", fax=" + fax + ", addr="
			+ addr + ", phot=" + phot + ", ano=" + ano + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((addr == null) ? 0 : addr.hashCode());
	result = prime * result + ano;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((fax == null) ? 0 : fax.hashCode());
	result = prime * result + ((phot == null) ? 0 : phot.hashCode());
	result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
	result = prime * result + ((tel == null) ? 0 : tel.hashCode());
	result = prime * result + ((uid == null) ? 0 : uid.hashCode());
	result = prime * result + ((uname == null) ? 0 : uname.hashCode());
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
	Member other = (Member) obj;
	if (addr == null) {
		if (other.addr != null)
			return false;
	} else if (!addr.equals(other.addr))
		return false;
	if (ano != other.ano)
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (fax == null) {
		if (other.fax != null)
			return false;
	} else if (!fax.equals(other.fax))
		return false;
	if (phot == null) {
		if (other.phot != null)
			return false;
	} else if (!phot.equals(other.phot))
		return false;
	if (pwd == null) {
		if (other.pwd != null)
			return false;
	} else if (!pwd.equals(other.pwd))
		return false;
	if (tel == null) {
		if (other.tel != null)
			return false;
	} else if (!tel.equals(other.tel))
		return false;
	if (uid == null) {
		if (other.uid != null)
			return false;
	} else if (!uid.equals(other.uid))
		return false;
	if (uname == null) {
		if (other.uname != null)
			return false;
	} else if (!uname.equals(other.uname))
		return false;
	return true;
}

public String getUid() {
	return uid;
}

public void setUid(String uid) {
	this.uid = uid;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getFax() {
	return fax;
}

public void setFax(String fax) {
	this.fax = fax;
}

public String getAddr() {
	return addr;
}

public void setAddr(String addr) {
	this.addr = addr;
}

public String getPhot() {
	return phot;
}

public void setPhot(String phot) {
	this.phot = phot;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}
  
  
  
}













