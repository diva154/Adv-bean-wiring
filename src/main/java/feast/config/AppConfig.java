package feast.config;

import feast.models.Chicken3;
import feast.models.Duck2;
import feast.models.Goat6;
import feast.models.Horse7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "feast")
public class AppConfig {


    @Bean
    public static Duck2 getDuck(Chicken3 chicken3) {
        return new Duck2(chicken3);
    }

    @Bean
    public Goat6 getGoat(Horse7 horse7){
        return new Goat6(horse7);
    }
}
