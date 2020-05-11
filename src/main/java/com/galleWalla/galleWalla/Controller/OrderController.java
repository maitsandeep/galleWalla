package com.galleWalla.galleWalla.Controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.galleWalla.galleWalla.bean.GrainCatalogue;
import com.galleWalla.galleWalla.bean.GrainCatalogueDetails;
import com.galleWalla.galleWalla.bean.Kisaan;
import com.galleWalla.galleWalla.bean.KisaanAddressDetails;
import com.galleWalla.galleWalla.bean.KisaanOrderDetails;
import com.galleWalla.galleWalla.repository.GrainCatalogueDetailsRepository;
import com.galleWalla.galleWalla.repository.GrainCatalogueRepository;
import com.galleWalla.galleWalla.repository.KisaanAddressDetailsRepositroy;
import com.galleWalla.galleWalla.repository.KisaanOrderRepository;
import com.galleWalla.galleWalla.repository.KisaanRepository;

@RestController
public class OrderController {

	@Autowired
	private KisaanRepository kisaanRepository;
	@Autowired
	private KisaanOrderRepository kisaanOrderRepository;
	@Autowired
	private KisaanAddressDetailsRepositroy kisaanAddressDetailsRepositroy;
	@Autowired
	GrainCatalogueRepository grainCatalogueRepository;
	@Autowired
	GrainCatalogueDetailsRepository grainCatalogueDetailsRepository;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world";
	}

	@PostMapping("/kisaanLogin")
	public ResponseEntity<Object> kisaanLogin(@RequestBody Kisaan kisaan) {

		Kisaan kisaanlogin = kisaanRepository.save(kisaan);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(kisaanlogin.getId()).toUri();
		return ResponseEntity.created(location).build();

	}

	@PostMapping("/placeOrder")
	public ResponseEntity<Object> placeorder(@RequestBody KisaanOrderDetails orderDetails) {
		KisaanOrderDetails kod = kisaanOrderRepository.save(orderDetails);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(kod.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/kisaanAdress")
	public ResponseEntity<Object> kisaanAddress(@RequestBody KisaanAddressDetails kisaanAddress) {
		KisaanAddressDetails kad = kisaanAddressDetailsRepositroy.save(kisaanAddress);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(kad.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

	@PostMapping("/addGrain")
	public ResponseEntity<Object> addGrain(@RequestBody GrainCatalogue grainCatalogue) {
		GrainCatalogue gc = grainCatalogueRepository.save(grainCatalogue);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(gc.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/addGrainDetails")
	public ResponseEntity<Object> addGrainDetails(@RequestBody GrainCatalogueDetails grainCatalogueDetails) {
		GrainCatalogueDetails gcd = grainCatalogueDetailsRepository.save(grainCatalogueDetails);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(gcd.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

}
