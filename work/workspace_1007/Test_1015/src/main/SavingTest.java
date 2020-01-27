package main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.Savings;
import a.SavingsDaoImpl1;
import a.SavingsDaoImpl2;

public class SavingTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("./config/applicationContext.xml"); 
		
		//ver1)
		SavingsDaoImpl1 bean1=(SavingsDaoImpl1)ctx.getBean("savingsDao"); 
		
		List<Savings> list = bean1.findSavingList();
		
		Iterator<Savings> iter = list.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		System.out.println("================================================");
		
		//ver2)
		SavingsDaoImpl2 bean2=(SavingsDaoImpl2)ctx.getBean("savingsDao2");

		List<Savings> list2 = bean2.findSavingList();
		iter = list2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}