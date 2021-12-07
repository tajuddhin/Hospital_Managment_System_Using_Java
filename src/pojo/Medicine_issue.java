package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
@Entity
public class Medicine_issue {
	@Id
	@GeneratedValue
	private int missueid;
	@ManyToOne
	@JoinColumn(name="pid")
	private Patient patient;
	@ManyToOne
	@JoinColumn(name="mid")
	private MedicineDb medicine;
    private int quantity;
	public int getMissueid() {
		return missueid;
	}
	public void setMissueid(int missueid) {
		this.missueid = missueid;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public MedicineDb getMedicine() {
		return medicine;
	}
	public void setMedicine(MedicineDb medicine) {
		this.medicine = medicine;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    

}
