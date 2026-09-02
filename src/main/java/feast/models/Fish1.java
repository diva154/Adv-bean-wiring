package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish1 {

    //field injection, does not need constructor
    //Spring injects dependencies directly into private fields using Java Reflection,
    // completely bypassing constructors or setter methods.
    @Autowired
    private Duck2 duck2;

    @Override
    public String toString() {
        return "which is inside of TraditionalFeast" + duck2.toString();
    }
}
