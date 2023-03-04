package pl.edu.wszib.springwprowadzenie.model.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dziecko {

    private final static Logger logger = LoggerFactory.getLogger(Dziecko.class);

    @Autowired
    private Ciastko ciastko = new Ciastko();

    public void zjedzCiastko() {
        if(ciastko.isZjedzone()) {
            logger.info("Już zjedzone");
        } {
            ciastko.zjedz();
            logger.info("Chomp");
        }
    }

}
