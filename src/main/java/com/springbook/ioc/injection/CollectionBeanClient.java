package com.springbook.ioc.injection;

import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
//		List<String> addressList = bean.getAddressList();
//		for(String address : addressList) {
//			System.out.println(address.toString());
//		}
		
//		Set<String> addressSet = bean.getAddressSet();
//		for(String address : addressSet) {
//			System.out.println(address.toString());
//		}
		
//		Map<String, String> addressMap = bean.getAddressMap();
//		System.out.println(addressMap.get("고길동"));
		
		Properties addrressProperty = bean.getAddressProperty();
		System.out.println(addrressProperty.get("마이콜"));
		
		factory.close();

	}

}
