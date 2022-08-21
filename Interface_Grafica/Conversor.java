import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Conversor implements ActionListener{
    private JFrame janela;
    private JLabel rotuloPalavra;
    private JLabel rotuloPalavraAlterada;
    private JTextField campoPalavra;
    private JTextField campoPalavraAlterada;
    private JButton converter;

    public Conversor(){
        janela = new JFrame("Conversor");
        rotuloPalavra = new JLabel("Informe uma palavra:");
        rotuloPalavraAlterada = new JLabel("Palavra Convertida:");
        campoPalavra = new JTextField();
        campoPalavraAlterada = new JTextField();

        converter = new JButton("Converter para Maiuscula");
        converter.addActionListener(this);

        montarJanela();
    }

    public void montarJanela(){
        janela.setSize(300, 200);
        janela.setLayout(new BorderLayout());

        JPanel painelEsq = new JPanel();
        painelEsq.setLayout(new BoxLayout(painelEsq, BoxLayout.X_AXIS));
        painelEsq.add(rotuloPalavra);
        painelEsq.add(campoPalavra);
        janela.add(painelEsq, BorderLayout.NORTH);

        JPanel painelCentro = new JPanel();
        painelCentro.setLayout(new FlowLayout());
        painelCentro.add(converter);
        janela.add(painelCentro, BorderLayout.CENTER);

        JPanel painelInf = new JPanel();
        painelInf.setLayout(new BoxLayout(painelInf, BoxLayout.X_AXIS));
        painelInf.add(rotuloPalavraAlterada);
        painelInf.add(campoPalavraAlterada);
        janela.add(painelInf, BorderLayout.SOUTH);

    }

    public void exibir(){
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == converter){
            String palavra = campoPalavra.getText();
            palavra = palavra.toUpperCase();
            campoPalavraAlterada.setText(palavra);
        }
    }


}
