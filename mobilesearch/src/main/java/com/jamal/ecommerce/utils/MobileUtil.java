package com.jamal.ecommerce.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamal.ecommerce.dto.MobileDTO;
/**
 * 
 * @author Sarfaraz jamal
 *
 */
public class MobileUtil {
private final static Logger log = LoggerFactory.getLogger(MobileUtil.class);
	public static List<MobileDTO> getAllMobileList() {
		List<MobileDTO> mobileDToList = null;
		log.debug("REST request to getAllMobileList: {}");
		try {
			File modileData = new File("src/main/resources/data.json");
				log.debug("REST request to fileTest: {}"+modileData.getAbsolutePath());
				ObjectMapper mapper = new ObjectMapper();
				mobileDToList = mapper.readValue(modileData,new TypeReference<List<MobileDTO>>() {});
		} catch (IOException e) {
			log.error(" Error occure while executing getAllMobileList : {}"+e);
		}
		return mobileDToList;
	}
}
