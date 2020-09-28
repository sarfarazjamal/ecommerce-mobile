package com.jamal.ecommerce.controller;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamal.ecommerce.dto.MobileDTO;
import com.jamal.ecommerce.service.MobileService;

/**
 * REST controller for managing {@link com.jamal.ecommerce}.
 */
@RestController
@RequestMapping("/mobile")
public class ProductResource {

	private final Logger log = LoggerFactory.getLogger(ProductResource.class);

	/* private static final String ENTITY_NAME = "healthyuaeAddress"; */
	/*
	 * @Value("${jhipster.clientApp.name}") private String applicationName;
	 */
	@Autowired
	private MobileService mobileService;

	/**
	 * {@code GET /search/{price} : get the "price"
	 *
	 * @param price the id of the addressDTO to retrieve.
	 * 
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the addressDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/search")
	public List<MobileDTO> getMobile(@RequestParam(required = false, defaultValue = "0") Integer priceEur,
			@RequestParam(required = false, defaultValue = "") String sim,
			@RequestParam(required = false, defaultValue = "") String announceDate,
			@RequestParam(required = false, defaultValue = "0") Integer price) {
		log.debug("REST request to get Address : {}", priceEur);
		List<MobileDTO> mobileList = null;

		mobileList = (null != priceEur && priceEur > 0) ? mobileService.findByPriceEur(priceEur)
				: !StringUtils.isEmpty(sim) ? mobileList = mobileService.findBySim(sim)
						: (!StringUtils.isEmpty(announceDate) && null != price && price > 0)
								? mobileService.findByAnnounceDateAndPrice(announceDate, price)
								: Collections.EMPTY_LIST;

		return mobileList;
	}

}
