package factorStudy.Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator{

    private ColleagueCheckBox  checkGuest;
    private ColleagueCheckBox  checkUser;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton    buttonOK;
    private ColleagueButton    buttonCancel;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(checkGuest);
        add(checkUser);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("password:"));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);

        colleagueChanged();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();
        show();
    }

    public void createColleagues(){
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckBox("Guest", g, true);
        checkUser = new ColleagueCheckBox("User", g, false);
        textUser = new ColleagueTextField("",10);
        textPass = new ColleagueTextField("",10);
        textPass.setEchoChar('#');
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkUser.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkUser.addItemListener(checkUser);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    public void colleagueChanged(){
        if(checkGuest.getState()){
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOK.setColleagueEnable(true);
        }else{
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }

    private void userpassChanged(){
        if(textUser.getText().length()>0){
            textPass.setColleagueEnable(true);
            if(textPass.getText().length()>4 && textUser.getText().length()>4){
                buttonOK.setColleagueEnable(true);
            }else{
                buttonOK.setColleagueEnable(false);
            }
        }else{
            textPass.setColleagueEnable(false);
            buttonOK.setColleagueEnable(false);
        }
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(e.toString());
        System.exit(0);
    }
}
