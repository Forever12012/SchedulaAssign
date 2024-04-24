package com.doctorDetails.DoctorDetails.Services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctorDetails.DoctorDetails.Entities.Doctors;

public interface DoctorsDAO extends JpaRepository<Doctors, Integer> {

}
