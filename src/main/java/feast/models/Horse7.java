package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Horse7 {
    private final Camel8 camel8;
//Constructor injection
//Dependencies are provided through a class constructor when the object is instantiated.
    @Autowired
    public Horse7(Camel8 camel8) {
        this.camel8 = camel8;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a camel, " + camel8.toString();
    }
}
