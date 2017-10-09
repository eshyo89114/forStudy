package factorStudy.Mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckBox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckBox(String caption, CheckboxGroup group,boolean state){
        super(caption,group,state);
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void setColleagueEnable(boolean enabled){
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e){
        mediator.colleagueChanged();
    }
}
