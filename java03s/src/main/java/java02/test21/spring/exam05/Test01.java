/* Spring Bean Container 사용하기
 * 호출할 생성자 지정하
 * 
 */
package java02.test21.spring.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Car c = new Car();
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{"java02/test21/spring/exam05/application-context.xml"}); 
				

		Car c1 = (Car)ctx.getBean("b01");
		System.out.println(c1);
		
		Car c2 = (Car)ctx.getBean("b02");
		System.out.println(c2);

		
	}

}
