import com.lyt.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        User user=(User) context.getBean("user");
        user.show();
    }
}
