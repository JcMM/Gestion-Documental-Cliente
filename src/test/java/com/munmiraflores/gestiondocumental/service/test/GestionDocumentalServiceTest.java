package com.munmiraflores.gestiondocumental.service.test;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.munmiraflores.gestiondocumental.service.GestiondocumentalService;
import com.munmiraflores.gestiondocumental.util.Util;

public class GestionDocumentalServiceTest {

	
	private GestiondocumentalService gestiondocumentalService = null;
	
	public GestionDocumentalServiceTest()
	{
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.gestiondocumentalService = (GestiondocumentalService) context.getBean("gestiondocumentalServiceClient");
	}
	
	
	@Test
	public void testCalcularNotaFinalDSD()
    {
		
		double p1=Util.Redondear(
				gestiondocumentalService.calcularNotaFinalDSD(15.0, 12.0,13.5, 9.5, 16.9));
		
		System.out.println(p1);
		
		Assert.assertEquals(12.03, p1,0);
		
		
    }
	
	
	
	
	/*
	@Test
	public void testCalcularTFParaAprobarDSD()
    {
		
		double p1=gestiondocumentalService.calcularNotaFinalDSD(15.0, 12.0,13.5, 9.5, 16.9);
		
		double p2=gestiondocumentalService.calcularTFParaAprobarDSD(15.0, 12.0,13.5, 9.5, 16.9,p1);
		System.out.println(p2);
		
		Assert.assertEquals(13.155000000000001, p2);
		
		
    }
	*/
}
