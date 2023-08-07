package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Java java = new Java();
       // System.out.println(java);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Java java1 = applicationContext.getBean("java", Java.class);
      //  System.out.println(java1);

        Js js = applicationContext.getBean("js",Js.class);
       // System.out.println(js);

        Python python = applicationContext.getBean("python",Python.class);
       // System.out.println(python);

        Group group1 = applicationContext.getBean("group", Group.class);
        group1.getCourse().getGroupName();
        System.out.println(group1);
        applicationContext.close();
    }
}
