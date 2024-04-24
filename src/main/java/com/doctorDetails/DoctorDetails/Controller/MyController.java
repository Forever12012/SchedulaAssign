package com.doctorDetails.DoctorDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctorDetails.DoctorDetails.Entities.Doctors;
import com.doctorDetails.DoctorDetails.Services.DoctorServices;

@RestController
public class MyController {
	
	@Autowired
	private DoctorServices doctorServices;
	
	// Get all the Doctors
	@GetMapping("/doctors")
	public List<Doctors> getDoctors()
	{
		return this.doctorServices.getDoctors();
	}
	
	// Get Doctors by ID
	@GetMapping("/doctors/{doctorId}")
	public Optional<Doctors> getDoctor(@PathVariable String doctorId)
	{
		return this.doctorServices.getDoctor(Integer.parseInt(doctorId));
	}
	
	
	//Get Availability of Doctors by ID
	@GetMapping("/doctors/{doctorId}/availability")
	public List<String> getAvailabilty(@PathVariable String doctorId)
	{
		return this.doctorServices.getAvailabilty(Integer.parseInt(doctorId));
	}
	
	// Add new doctors
	@PostMapping("/doctors")
	public Doctors addDoctors(@RequestBody Doctors doctors)
	{
		return this.doctorServices.addDoctors(doctors);
	}
}
