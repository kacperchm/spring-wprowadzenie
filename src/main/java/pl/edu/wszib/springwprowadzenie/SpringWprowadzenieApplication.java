package pl.edu.wszib.springwprowadzenie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import pl.edu.wszib.springwprowadzenie.configuration.Zoo;
import pl.edu.wszib.springwprowadzenie.model.Samochod;
import pl.edu.wszib.springwprowadzenie.model.Silnik;
import pl.edu.wszib.springwprowadzenie.model.zoo.JunglaZWoda;
import pl.edu.wszib.springwprowadzenie.model.zoo.Wybieg;

@SpringBootApplication
public class SpringWprowadzenieApplication implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext context;
    private static final Logger logger = LoggerFactory.getLogger(SpringWprowadzenieApplication.class);

    @Autowired
//    @Qualifier("silnik2")
    private Silnik silnik;



    @Autowired
    private Samochod samochod;
    public static void main(String[] args) {
        SpringApplication.run(SpringWprowadzenieApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    samochod.odpal();
    silnik.zepsuj();
    samochod.odpal();

    MyPrototype.getPrototype();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
