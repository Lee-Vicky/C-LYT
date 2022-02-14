import com.lyt.dao.UserDao;
import com.lyt.dao.UserDaoImpl;
import com.lyt.dao.UserDaoMySqlImpl;
import com.lyt.service.UserService;
import com.lyt.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        UserServiceImpl userServiceImpl=(UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
