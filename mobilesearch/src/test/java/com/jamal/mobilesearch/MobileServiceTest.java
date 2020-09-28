package com.jamal.mobilesearch;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.test.context.ActiveProfiles;

import com.jamal.ecommerce.dto.MobileDTO;
import com.jamal.ecommerce.service.impl.MobileServiceImpl;
import com.jamal.ecommerce.utils.MobileUtil;

@ActiveProfiles(profiles = { "test" })
public class MobileServiceTest {
	@InjectMocks
	private MobileServiceImpl mobileService;

	private MobileDTO mobileDTO;
	private List<MobileDTO> listOfmobile = new ArrayList<>();

	@BeforeEach
	public void init() {
		Mockito.mock(MobileUtil.class);
		mobileService = new MobileServiceImpl();
		mobileDTO = new MobileDTO();
		mobileDTO.setId(1);
		mobileDTO.setBrand("Apple");
		mobileDTO.setPhone("Apple iPad Pro 12.9 (2018)");
		mobileDTO.setPicture("sdsd");
		mobileDTO.setSim("Nano-SIM eSIM");
		mobileDTO.setResolution("2048 x 2732 pixels");
		listOfmobile.add(mobileDTO);
	}

	@Test
	public void findByPriceEurTest() {
		List<MobileDTO> result =mobileService.findByPriceEur(200);
		assertTrue(result.size() == 10);
		
	}
	@Test
	public void findByPriceEurFailTest() {
		List<MobileDTO> result =mobileService.findByPriceEur(787878);
		assertTrue(result.size() == 0);
		
	}
	
	@Test
	public void findBySimTest() {
		List<MobileDTO> result =mobileService.findBySim("eSim");
		assertTrue(result.size() <=18);
		
	}
	
	@Test
	public void findBySimFailTest() {
		List<MobileDTO> result =mobileService.findBySim("6fder43434");
		assertTrue(result.size() == 0);
		
	}
	
	@Test
	public void findByAnnounceDateAndPriceTest() {
		List<MobileDTO> result =mobileService.findByAnnounceDateAndPrice("1999", 200);
		assertTrue(result.size() == 2);
		
	}
	
	@Test
	public void findByAnnounceDateAndPriceFailTest() {
		List<MobileDTO> result =mobileService.findByAnnounceDateAndPrice("1994549", 200);
		assertTrue(result.size() == 0);
		
	}

}
