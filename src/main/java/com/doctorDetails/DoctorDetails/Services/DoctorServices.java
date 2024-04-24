package com.doctorDetails.DoctorDetails.Services;

import java.util.List;
import java.util.Optional;

import com.doctorDetails.DoctorDetails.Entities.Doctors;

public interface DoctorServices {
	public List<Doctors> getDoctors();
	
	public Optional<Doctors> getDoctor(int doctorId);

	public List<String> getAvailabilty(int doctorID);

	public Doctors addDoctors(Doctors doctors);
	
	
}
