import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyApplication {

    Logger logger = LoggerFactory.getLogger(MyApplication.class);

    @RequestMapping("/")
    String home() {
        logger.info("access root");
        return "Hello World!";
    }
    
    @RequestMapping("a")
    String methoda() {
        logger.info("access /a");
        return "Hello World!a";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

