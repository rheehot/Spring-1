package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bit.jdbc.MyComponent;
import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.service.EmpService;

public class MyBatisTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("./config/myBatisAppContext.xml");
		
//		DriverManagerDataSource dm = (DriverManagerDataSource) ctx.getBean("dataSource");
		
//		((MyComponent)ctx.getBean("myComponent")).selectEmpResult(7844);
		
		EmpService service = (EmpService) ctx.getBean("empService");
		System.out.println(service.selectEmp(7902));
		
		EmpMapper mapper = (EmpMapper) ctx.getBean("empMapper");
		System.out.println(mapper.selectEmp(7782));
		
		
	}

}
