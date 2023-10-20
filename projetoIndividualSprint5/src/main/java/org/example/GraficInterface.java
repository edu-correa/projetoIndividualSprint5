package org.example;

import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraficInterface extends JFrame {
    private String user;

    public GraficInterface(String user) throws HeadlessException {
        this.user = user;
    }

    public GraficInterface(GraphicsConfiguration gc, String user) {
        super(gc);
        this.user = user;
    }

    public GraficInterface(String title, String user) throws HeadlessException {
        super(title);
        this.user = user;
    }

    public GraficInterface(String title, GraphicsConfiguration gc, String user) {
        super(title, gc);
        this.user = user;
    }

    public void loginScreen(){
        Inserts banco = new Inserts(user);

        JFrame myScreen = new JFrame("Login");
        myScreen.setSize(300,300);

        JPanel myJPanel = new JPanel();
        myJPanel.setSize(300, 300);

        myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.PAGE_AXIS));



        // componente JTextArea
        JLabel txtEmail = new JLabel("Email: ");
        myJPanel.add(txtEmail);
        JTextArea Email = new JTextArea(1,1);
        myJPanel.add(Email);
        JLabel txtSenha = new JLabel("Senha: ");
        myJPanel.add(txtSenha);
        JTextArea Password = new JTextArea();
        myJPanel.add(Password);
        JButton botao = new JButton("Logar");
        myJPanel.add(botao);



        // conectar Jpanel a JFrame
        myScreen.add(myJPanel);

        // hacer visible JFrame
        myScreen.setVisible(true);
        myScreen.setDefaultCloseOperation(HIDE_ON_CLOSE);

        botao.addActionListener(e -> banco.buscarUsuario(new Usuario(Email.getText(), Password.getText()), myScreen));

    }

    public void dataScreen(){
        System.out.println("teoricamente cheguei aqui");
        Inserts banco = new Inserts(user);

        JFrame myScreen = new JFrame("Dados");
        myScreen.setSize(300,300);

        JPanel myJPanel = new JPanel();
        myJPanel.setSize(300, 300);

        myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.PAGE_AXIS));

        JButton botao = new JButton("Inserir dados");
        myJPanel.add(botao);


        myScreen.add(myJPanel);

        // hacer visible JFrame
        myScreen.setVisible(true);
        myScreen.setDefaultCloseOperation(EXIT_ON_CLOSE);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Inserindo dados!");
                Integer quantidade = 0;
                while (true){
                    quantidade++;
                    banco.inserirDados();
                    if (quantidade == 40){
                        JOptionPane.showMessageDialog(null, "40 dados foram adicionados!");
                        break;
                    }
                }
            }
        });

    }
}
