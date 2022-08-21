import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLogin implements ActionListener{
    private JFrame janela;
    private JLabel rotuloLogin;
    private JLabel rotuloSenha;
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private JMenuItem itemMenuSobre;

    public TelaLogin(){
        janela = new JFrame("Tela de Login");
        rotuloLogin = new JLabel("Login:", new ImageIcon("src/user.png"), SwingConstants.LEFT);
        rotuloSenha = new JLabel("Senha:", new ImageIcon("src/senha.png"), SwingConstants.LEFT);
        campoLogin = new JTextField();
        campoSenha = new JPasswordField();
        botaoEntrar = new JButton("Entrar");
        botaoEntrar.addActionListener(this);

        montarMenu();
        montarJanela();
    }

    public void montarJanela(){
        janela.setSize(400, 300);
        //janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.setLayout(new GridLayout(3,2));
        janela.add(rotuloLogin);
        janela.add(rotuloLogin);
        janela.add(campoLogin);
        janela.add(rotuloSenha);
        janela.add(campoSenha);
        janela.add(botaoEntrar);

        janela.pack();
    }

    public void montarMenu(){
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuAjuda = new JMenu("Ajuda");
        itemMenuSobre = new JMenuItem("Sobre");

        menuAjuda.add(itemMenuSobre);
        barraMenu.add(menuAjuda);
        janela.setJMenuBar(barraMenu);

        itemMenuSobre.addActionListener(this);
    }

    public void exibir(){
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == botaoEntrar){
            String login = campoLogin.getText();
            String senha = new String(campoSenha.getPassword());
            JOptionPane.showMessageDialog(janela, "A senha do usuário: " + login + " é: " + senha + ".");
        }else if(e.getSource() == itemMenuSobre){
            String nome = JOptionPane.showInputDialog(janela, "Olá, qual é o seu nome?");
            int resposta;
            resposta = JOptionPane.showConfirmDialog(janela, nome + ", você sabe a versão desse aplicativo?");
            if(resposta == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(janela, "Uau, parabéns " + nome + "!");
            }else{
                JOptionPane.showMessageDialog(janela, nome + ", esta é a Versão 1.0!");
            }
        }
    }

}
