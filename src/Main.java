import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final String[] username = new String[1];
        final String[] password = new String[1];
        final String[] target = new String[1];

        UserPassword userPassword =new UserPassword();
        HashMap<String,String> info= userPassword.getInfo();
        LogIn log =new LogIn(info);


        log.btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 username[0] =log.userField.getText();
                 target[0] =log.target.getText();
                 password[0] =String.valueOf(log.passField.getPassword());

                if (username[0].length()>0&&
                        (password[0].length())>0&&
                        target[0].length()>0) {
                    log.labelP.setText("Please wait...");

                    try {
                        Follow p2 = new Follow();
                        p2.login(username[0],password[0]);
                        int count = 1;
                        while (count < 7){
                            System.out.println("Number of load :"+"["+count+"]");
                            p2.navigateToProfile(target[0]);
                            p2.clickFallowers();
                            p2.startFallow();
                            count++;
                        }
                    }catch (Exception b){
                        System.out.print("Error : "+b.getMessage());
                    }
                }
                else {
                    log.labelP.setText("Fields are empty");
                }
                if (username[0].length()==0){
                    log.labelP.setText("Enter username");
                } if (password[0].length()==0){
                    log.labelP.setText("Enter password");
                } if (target[0].length()==0){
                    log.labelP.setText("Enter target");
                }




            }
        });




















    }
}