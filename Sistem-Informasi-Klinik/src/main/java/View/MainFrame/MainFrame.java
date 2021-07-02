package View.MainFrame;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;

public class MainFrame extends JFrame {
    private JTabbedPane tabPanel;
    private JComponent component;

    public MainFrame(){
        super("Sistem Informasi Klinik");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabPanel = new JTabbedPane();
        tabPanel.addTab("Pendaftaran",new FormPanel());
        tabPanel.addTab("Tab 2",new FormPanel());
        add(tabPanel);

    }

}
