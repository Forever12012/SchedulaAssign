package com.doctorDetails.DoctorDetails.Entities;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctors {
	@Id
	private int id;
	private String doctor_name;
	private String loaction;
	private String speciality;
	private List<String> days_Available;
	private int appointmentCapacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public List<String> getDays_Available() {
		return days_Available;
	}
	public void setDays_Available(List<String> days_Available) {
		this.days_Available = days_Available;
	}
	public int getAppointmentCapacity() {
		return appointmentCapacity;
	}
	public void setAppointmentCapacity(int appointmentCapacity) {
		this.appointmentCapacity = appointmentCapacity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(appointmentCapacity, days_Available, doctor_name, id, loaction, speciality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctors other = (Doctors) obj;
		return appointmentCapacity == other.appointmentCapacity && Objects.equals(days_Available, other.days_Available)
				&& Objects.equals(doctor_name, other.doctor_name) && id == other.id
				&& Objects.equals(loaction, other.loaction) && Objects.equals(speciality, other.speciality);
	}
	@Override
	public String toString() {
		return "Doctors [id=" + id + ", doctor_name=" + doctor_name + ", loaction=" + loaction + ", speciality="
				+ speciality + ", days_Available=" + days_Available + ", appointmentCapacity=" + appointmentCapacity
				+ "]";
	}
	public Doctors(int id, String doctor_name, String loaction, String speciality, List<String> days_Available,
			int appointmentCapacity) {
		super();
		this.id = id;
		this.doctor_name = doctor_name;
		this.loaction = loaction;
		this.speciality = speciality;
		this.days_Available = days_Available;
		this.appointmentCapacity = appointmentCapacity;
	}
	public Doctors() {
		
	}
	
	
}
