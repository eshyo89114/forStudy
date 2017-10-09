package factorStudy.Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener,Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns){
        super(text,columns);
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void setColleagueEnable(boolean enabled){
        setEnabled(enabled);
        setBackground(enabled ? new Color(128,128,128) : new Color(222,93,63));
    }

    public void textValueChanged(TextEvent e){
        mediator.colleagueChanged();
    }
}
