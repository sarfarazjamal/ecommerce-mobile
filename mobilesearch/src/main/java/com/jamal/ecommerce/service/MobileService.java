package com.jamal.ecommerce.service;

import java.util.List;

import com.jamal.ecommerce.dto.MobileDTO;

public interface MobileService {

	public List<MobileDTO> findByPriceEur(Integer priceEur);

	public List<MobileDTO> findBySim(String sim);

	public List<MobileDTO> findByAnnounceDateAndPrice(String announceDate, Integer price);

}
