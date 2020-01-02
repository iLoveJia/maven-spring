package gunsmoke;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yz on 2020/1/2.
 */
public class Container {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("user1"));
        System.out.println(ctx.getBean("user2"));
        System.out.println(ctx.getBean("cat1"));
//        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();
//        ctx1.register(Config.class);
//        System.out.println(ctx1.getBean("user11"));

    }
}
