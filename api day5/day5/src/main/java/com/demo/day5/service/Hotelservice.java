package com.demo.day5.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.day5.repository.Hotelrepo;
import com.demo.day5.model.Hotelmodel;

@Service

public class Hotelservice {
	@Autowired
	Hotelrepo hrepo;
	public Hotelmodel saveDetails(Hotelmodel hm) {
		return hrepo.save(hm);
	}
	public Hotelmodel updateDetails(Hotelmodel hm) {
		return hrepo.saveAndFlush(hm);
	}
	public boolean deleteHotel(int hotelId) {
		if(hrepo.existsById(hotelId)) {
			hrepo.deleteById(hotelId);
			return true;
		}
		return false;
	}
	public List<Hotelmodel> getDetails(){
		return hrepo.findAll();
	}

}