import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton sendButton;
    private JTextPane textPane1;
    private JPanel mainpanel;

    public Main() {
      this.setSize(800,600);
      this.setContentPane(mainpanel);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ChatController cc = new ChatController("16");
        PotokObnovl po = new PotokObnovl();
        cc.setChatPane(textPane1);
        cc.obnovitChat();
        po.start();
      sendButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            String msg = textField1.getText().toString();
            cc.dobavitSoobsch(msg);
            textField1.setText("");
            cc.obnovitChat();
          }
      });
    }
}
