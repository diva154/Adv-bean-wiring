package feast;

import feast.models.Fish1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TraditionalFeast {

    private Fish1 fish;

    public String getTraditionalFeast() {
        return "Traditional Bedouin Wedding Feast consists of stuffing " + fish.toString();
    }
//setter injection
    //Spring injects dependencies via public setter methods marked with @Autowired.
    @Autowired
    public void setFish(Fish1 fish) {
        this.fish = fish;
    }
}
