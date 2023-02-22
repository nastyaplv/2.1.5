package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 dark;

    @Autowired
    public void setDuck5(Duck5 dark) {
        this.dark = dark;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + dark.toString();
    }
}
