import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private String str;

    public static String doSomething() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        Main main = (Main) context.getBean("main");
        return main.getStr();
    }

    public static void main(String[] args) {
        System.out.print(doSomething());
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}