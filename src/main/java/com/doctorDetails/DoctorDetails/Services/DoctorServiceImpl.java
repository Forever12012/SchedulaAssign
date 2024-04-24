package com.doctorDetails.DoctorDetails.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorDetails.DoctorDetails.Entities.Doctors;

@Service
public class DoctorServiceImpl implements DoctorServices {

	@Autowired
	private DoctorsDAO doctorsDao;
	
	public DoctorServiceImpl()
	{
		//list = new ArrayList<Doctors>();
		//list.add(new Doctors(1, "Dr. John Doe", "123 Main Street", "Cardiology", List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"), 10));
		//list.add(new Doctors(2, "Dr. Jane Smith", "456 Elm Street", "Pediatrics", List.of("Monday", "Wednesday", "Friday"), 12));
	}
	
	@Override
	public List<Doctors> getDoctors() {
		return doctorsDao.findAll();
	}

	@Override
	public Optional<Doctors> getDoctor(int doctorId) {
		// TODO Auto-generated method stub
		return doctorsDao.findById(doctorId);
	}

	@Override
	public List<String> getAvailabilty(int doctorID) {
		// TODO Auto-generated method stub
		List<String> d = new ArrayList<String>();
//		for (Doctors doctors : list) {
//			if(doctors.getId() == doctorID)
//			{
//				d.addAll(doctors.getDays_Available());
//			}
//		}
		for(Doctors doctors : doctorsDao.findAll())
		{
		if(doctors.getId() == doctorID)
			{
			System.out.println("Doctor's Availibilty");
			d.addAll(doctors.getDays_Available());
			}
		}
		return d;
	}

	@Override
	public Doctors addDoctors(Doctors doctors) {
		// TODO Auto-generated method stub
		return doctorsDao.save(doctors);
	}
	
	
}
