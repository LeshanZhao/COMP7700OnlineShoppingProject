import java.util.Date;
import javax.swing.*;
public class MainView extends JFrame
{
    private JTextField _txtUsername = new JTextField(10);
    private JTextField _txtPassword = new JTextField(15);

    private JButton _btnLogin = new JButton("Login");
    private JButton _btnExit = new JButton("Exit");

    public MainView()
    {
        this.setTitle("Login COMP 7700 Online Shopping System");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setSize(500,500);

        JPanel loginPanel = new JPanel();
        loginPanel.add(new JLabel("Username: "));
        loginPanel.add(_txtUsername);
        _txtUsername.setHorizontalAlignment(JTextField.RIGHT);

        loginPanel.add(new JLabel("Password: "));
        loginPanel.add(_txtPassword);
        _txtPassword.setHorizontalAlignment(JTextField.RIGHT);

        this.getContentPane().add(loginPanel);

        JPanel btnPanel = new JPanel();
        btnPanel.add(_btnLogin);
        btnPanel.add(_btnExit);
        this.getContentPane().add(btnPanel);
    }

    public JButton getBtnLogin() { return _btnLogin;}

    public JButton getBtnExit() { return _btnExit;}
}
