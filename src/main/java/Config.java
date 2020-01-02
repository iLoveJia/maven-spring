import gunsmoke.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yz on 2020/1/2.
 */
@Configuration
@ComponentScan(basePackages = "gunsmoke")
public class Config {
    @Bean
    public User user11()
    {
        User tempUser = new User();
        tempUser.setAge(88);
        tempUser.setName("miaomiao");
        return tempUser;
    }
}
