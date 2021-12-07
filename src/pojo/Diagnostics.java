package pojo;


import java.util.HashSet;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class Diagnostics {
	@Id
	@GeneratedValue
	private int testId;
	private String tname;
	private int chargefortest;
	@OneToMany(mappedBy="diagnostics")
	private Set<Diagnostic_issue> diagnostic_issue=new HashSet<>();
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getChargefortest() {
		return chargefortest;
	}
	public void setChargefortest(int chargefortest) {
		this.chargefortest = chargefortest;
	}
	public Set<Diagnostic_issue> getDiagnostic_issue() {
		return diagnostic_issue;
	}
	public void setDiagnostic_issue(Set<Diagnostic_issue> diagnostic_issue) {
		this.diagnostic_issue = diagnostic_issue;
	}
	
	

}
