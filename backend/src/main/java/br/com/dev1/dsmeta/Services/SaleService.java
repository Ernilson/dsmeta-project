package br.com.dev1.dsmeta.Services;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.dev1.dsmeta.entity.Sale;
import br.com.dev1.dsmeta.repository.SalesRepository;

@Service
public class SaleService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SalesRepository sr;

	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		return sr.findSales(min, max, pageable);
	}
		//https://www.youtube.com/watch?v=lgZnMqPBtdU&t=2233s
}
