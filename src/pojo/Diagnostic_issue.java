package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Diagnostic_issue {
@Id
@GeneratedValue
private int did;
@ManyToOne
@JoinColumn(name="pid")
private Patient patient1;
@ManyToOne
@JoinColumn(name="testid")
private Diagnostics diagnostics;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public Patient getPatient() {
	return patient1;
}
public void setPatient(Patient patient) {
	this.patient1 = patient;
}
public Diagnostics getDiagnostics() {
	return diagnostics;
}
public void setDiagnostics(Diagnostics diagnostics) {
	this.diagnostics = diagnostics;
}




}
