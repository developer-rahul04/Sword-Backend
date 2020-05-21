package autowire.autowirebyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) 
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Tesla modelX=(Tesla)context.getBean("modelX");
        modelX.goForward();
    }
}
