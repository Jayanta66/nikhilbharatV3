package com.example.nikhilbharatV3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nikhilbharatV3.model.TypAnyThing;
import com.example.nikhilbharatV3.repository.TypAnyThingRepository;





@Service
public class TypAnyThingService {

	@Autowired
	private TypAnyThingRepository imageGalleryRepository;
	
	public void saveImage(TypAnyThing imageGallery) {
		imageGalleryRepository.save(imageGallery);	
	}

	public List<TypAnyThing> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	public Optional<TypAnyThing> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
}

