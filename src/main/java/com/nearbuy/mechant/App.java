package com.nearbuy.mechant;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nearbuy.mechant.db.model.Deals;
import com.nearbuy.mechant.db.model.Merchant;
import com.nearbuy.mechant.db.repository.MerchantRepository;

@SuppressWarnings("unused")
@SpringBootApplication(scanBasePackages= "com.nearbuy.mechant")
@EnableScheduling
@EnableAsync
@EnableAutoConfiguration(exclude = { JndiConnectionFactoryAutoConfiguration.class, DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	
    }
}	

//public class App implements CommandLineRunner{
//	
//	
//	@Autowired
//	private MerchantRepository repository;
//	
//    @SuppressWarnings("unused")
//	public static void main( String[] args ) {
//		ApplicationContext context = SpringApplication.run(App.class, args);
//		
//    }
//
//	@Override
//	public void run(String... arg0) throws Exception {
//		repository.deleteAll();
//		
//		//int id, String name, String location, String category, ArrayList<Deals> deals
//		ArrayList<Deals> d=new ArrayList<Deals>();
//		Deals d1=new Deals(1,"BOGO",150,50);
//		Deals d2=new Deals(2,"Weekend",450,50);
//		d.add(d1);
//		d.add(d2);
//		//int id, String dname,int dprice,int discount
//		
//		repository.save(new Merchant(12,"BBQ Nation", "GGN", "Eat", d));
//		repository.save(new Merchant(13,"WonderSpa", "Noida", "Spa", d));
//		
//		//get all merchants
//		System.out.println("Merchants found with findAll():");
//		System.out.println("-------------------------------");
//		for (Merchant merchant : repository.findAll()) {
//			System.out.println(merchant);
//		}
//		System.out.println();
//		
//		//find a merchant
//		System.out.println("Merchant found with ID 12:");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findBymerchantId(12));
//	}
// 
//}
