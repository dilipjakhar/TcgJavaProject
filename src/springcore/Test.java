package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
	    Object object=	factory.getBean("scrb");
        Scrb scrb1=(Scrb)object;
        scrb1.duty();
        scrb1.emp();
        System.out.println("<----------------------->");
        Tcg tcg1=(Tcg)factory.getBean("tcg");
        tcg1.duty();
        tcg1.emp();
	}

}
