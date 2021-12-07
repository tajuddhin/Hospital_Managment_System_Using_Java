package pojo;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class MedicineDb {
@Id
@GeneratedValue
private int mid;
private String mname;
private int avalible_quantity;
private int rate;
@OneToMany(mappedBy="medicine")
private Set<Medicine_issue> medicine_issue=new HashSet<>();
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public int getAvalible_quantity() {
	return avalible_quantity;
}
public void setAvalible_quantity(int avalible_quantity) {
	this.avalible_quantity = avalible_quantity;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public Set<Medicine_issue> getMedicine_issue() {
	return medicine_issue;
}
public void setMedicine_issue(Set<Medicine_issue> medicine_issue) {
	this.medicine_issue = medicine_issue;
}

 

}
