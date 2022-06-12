package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class TimerBean extends Timer {
    public Timer getTimer(){
        return new TimerBean();
    }
}
