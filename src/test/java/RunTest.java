import com.bingo.ApplicationMain;
import com.bingo.component.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author:yaobin
 * @date:2020/4/22,15:18
 */


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:application.properties"})
@SpringBootTest(classes = {ApplicationMain.class})
public class RunTest {

    @Autowired
    private MyBean myBean;




    @Test
    public void test1(){
        myBean.printPerson();



    }

    @Test
    public void tes2(){
        System.out.println(1);
    }
}
