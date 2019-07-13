import com.cc.course.aop.service.AuthService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenchao on 2019/7/13.
 */
@ContextConfiguration(locations = "classpath*:application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthServiceTest {
    @Autowired
    private AuthService authService;

    @Test
    @Ignore
    public void testLogin(){
        authService.login("","");
    }

    @Test
    public void testLogoff(){
        authService.logOff("");
    }

}
