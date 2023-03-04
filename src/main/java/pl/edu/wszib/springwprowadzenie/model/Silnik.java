package pl.edu.wszib.springwprowadzenie.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_SINGLETON)
public class Silnik {

    private String id;
    private boolean zepsuty = false;

    public Silnik() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void zepsuj() {
        zepsuty = true;
    }

    public boolean isZepsuty() {
        return zepsuty;
    }
}
