package com.jamal.ecommerce.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.jamal.ecommerce.dto.MobileDTO;
import com.jamal.ecommerce.service.MobileService;
import com.jamal.ecommerce.utils.MobileUtil;
@Service
public class MobileServiceImpl implements MobileService {

	private final Logger log = LoggerFactory.getLogger(MobileServiceImpl.class);

	@Override
	public List<MobileDTO> findByPriceEur(Integer priceEur) {
		List<MobileDTO> mobileList = MobileUtil.getAllMobileList();
		List<MobileDTO> filterMobileList = null;
		if (!CollectionUtils.isEmpty(mobileList) &&  priceEur>0) {
			filterMobileList = mobileList.stream().filter(e -> e.getRelease().getPriceEur() == priceEur).limit(10)
					.collect(Collectors.toList());
		}
		return filterMobileList;
	}

	@Override
	public List<MobileDTO> findBySim(String sim) {
		List<MobileDTO> mobileList = MobileUtil.getAllMobileList();
		List<MobileDTO> filterMobileList = null;
		if (!CollectionUtils.isEmpty(mobileList) && !StringUtils.isEmpty(sim)) {
			filterMobileList = mobileList.stream().filter(e -> e.getSim().contains(sim)).limit(18)
					.collect(Collectors.toList());
		}
		return filterMobileList;
	}

	@Override
	public List<MobileDTO> findByAnnounceDateAndPrice(String announceDate, Integer price) {
		List<MobileDTO> mobileList = MobileUtil.getAllMobileList();
		List<MobileDTO> filterMobileList = null;
		if (!CollectionUtils.isEmpty(mobileList) && !StringUtils.isEmpty(announceDate) && null != price) {
			filterMobileList = mobileList.stream().filter(e -> (announceDate.equals(e.getRelease().getAnnounceDate())
					&& e.getRelease().getPriceEur() <= price)).limit(2).collect(Collectors.toList());
		}
		return filterMobileList;
	}

}
