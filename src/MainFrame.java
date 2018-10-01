import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        this.setTitle("Main");
        this.setBounds(400, 100, 300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



}
