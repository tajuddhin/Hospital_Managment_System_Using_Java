package pojo;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private int pid;
	private int ssnid;
	private String name;
	private Date doa;
	private String typeofbed;
	private String address;
	private int age;
	private String state;
	private String city;
	private Date dateofdischarge;
	@OneToMany(mappedBy="patient",cascade=CascadeType.ALL)
	private Set<Medicine_issue> medicine_issue=new HashSet<>();
	@OneToMany(mappedBy="patient1",cascade=CascadeType.ALL)
	private Set<Diagnostic_issue> diagnostic_issue=new HashSet<>();
    
	public Set<Diagnostic_issue> getDiagnostic_issue() {
		return diagnostic_issue;
	}
	public void setDiagnostic_issue(Set<Diagnostic_issue> diagnostic_issue) {
		this.diagnostic_issue = diagnostic_issue;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getssnid() {
		return ssnid;
	}
	public void setssnid(int ssnid) {
		this.ssnid = ssnid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoa() {
		return doa;
	}
	public void setDoa(Date doa) {
		this.doa = doa;
	}
	public String getTypeofbed() {
		return typeofbed;
	}
	public void setTypeofbed(String typeofbed) {
		this.typeofbed = typeofbed;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(Date dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public Set<Medicine_issue> getMedicine_issue() {
		return medicine_issue;
	}
	public void setMedicine_issue(Set<Medicine_issue> medicine_issue) {
		this.medicine_issue = medicine_issue;
	}
	
	
}
