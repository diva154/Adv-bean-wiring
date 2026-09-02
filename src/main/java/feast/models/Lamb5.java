package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//add annotation and create bean Goat5,
//field injection, does not need constructor
//Spring injects dependencies directly into private fields using Java Reflection,
// completely bypassing constructors or setter methods.
@Component
public class Lamb5 {

    @Autowired
    private Goat6 goat6;


    @Override
    public String toString() {
        return "which is stuffed inside a goat," + goat6.toString();
    }
}
