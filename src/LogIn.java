import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LogIn extends JFrame implements ActionListener {
    HashMap<String,String> info = new HashMap<String,String>();

    Image icon;
    JLabel userLabel;
    JLabel passLabel;
    JLabel targetLabel;
    JTextField userField;
    JTextField target;

    JPasswordField passField;
    JButton btnFallowLog;
    JButton btnUnFallowLog;
    JButton btnRes;

    JPanel panel;

    JLabel labelP;

    public LogIn(HashMap<String,String> info) throws HeadlessException {
        this.info=info;
        panel = new JPanel();
     //   icon = new ImageIcon(getClass().getResource("/logo.png")).getImage();
        userLabel=new JLabel("UserName");
        passLabel=new JLabel("Password");
        userField =new JTextField();
        passField =new JPasswordField();
        btnFallowLog = new JButton("Fallow");
        btnUnFallowLog = new JButton("UnFallow");
        btnRes = new JButton("Reset");
        labelP = new JLabel("Memol");
        targetLabel = new JLabel("Target");
        target=new JTextField();


        userLabel.setBounds(15,40,70,20);
        passLabel.setBounds(15,80,70,20);
        targetLabel.setBounds(15,120,70,20);
        userField.setBounds(85,40,150,22);
        passField.setBounds(85,80,150,22);
        target.setBounds(85,120,150,22);
        btnUnFallowLog.setBounds(110,150,85,30);
        btnFallowLog.setBounds(20,150,85,30);
        btnRes.setBounds(200,150,70,30);
        panel.setBounds(30,190,220,45);

        btnFallowLog.setBackground(Color.GREEN);
        btnUnFallowLog.setBackground(Color.GREEN);
        btnRes.setBackground(Color.RED);

        userField.setBackground(Color.GREEN);
        passField.setBackground(Color.GREEN);
        target.setBackground(Color.GREEN);




        userLabel.setForeground(Color.GREEN);
        passLabel.setForeground(Color.GREEN);
        targetLabel.setForeground(Color.GREEN);
        labelP.setForeground(Color.black);
        labelP.setFont(new Font(null,Font.ITALIC,25));



        panel.setBackground(Color.GREEN);
        panel.add(labelP);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(500,150,300,450);
        this.setIconImage(icon);
        this.setResizable(false);
        this.setTitle("AutoInsta");

        this.getContentPane().setBackground(Color.black);



        this.add(userField);
        this.add(passField);
        this.add(targetLabel);
        this.add(target);
        this.add(userLabel);
        this.add(passLabel);
        this.add(btnFallowLog);
        this.add(btnUnFallowLog);
        this.add(btnRes);
        this.add(panel);
        this.setVisible(true);


        btnFallowLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = String.valueOf(passField.getPassword());




//               if (info.containsKey(user)){
//                   if (info.get(user).equals(pass)){
//                       labelP.setText("Log in Successfull");
//                       panel.setBackground(Color.GREEN);
//                   }
//               }
//               else {
//                   panel.setBackground(Color.red);
//                   labelP.setText("Invalid :(");
//               }

            }
        });



        btnRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passField.setText("");
                target.setText("");
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
