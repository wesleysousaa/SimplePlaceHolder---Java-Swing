package SnUtils;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Placeholder implements FocusListener{
    private JTextField item;
    private String nome;
    private JTextArea txtArea;
    private Color corFocada;
    private Color corDesfocada;
    
    /**
     * Cria um Placeholder com as configurações recebidas por parâmetro
     * @param item → Recebe um JTextField e personaliza
     * @param nome → Recebe uma String com o nome que aparecerá ao campo perder o foco
     */
    
    public Placeholder(JTextField item, String nome){
        this.txtArea = new JTextArea();
        this.txtArea.setText("none");
        this.item = item;
        this.nome = nome;
        this.corFocada = Color.black;
        this.corDesfocada = Color.gray;
    }
    
    /**
     * Cria um Placeholder com as configurações recebidas por parâmetro
     * @param txtArea → Recebe um JTextArea e personaliza
     * @param nome → Recebe uma String com o nome que aparecerá ao campo perder o foco
     */
    
    public Placeholder(JTextArea txtArea, String nome){
        this.item = new JTextField();
        this.item.setText("none");
        this.nome = nome;
        this.txtArea = txtArea;
        this.corFocada = Color.black;
        this.corDesfocada = Color.gray;
    }
    
    /**
     * Cria um Placeholder com as configurações recebidas por parâmetro
     * @param item → Recebe um JTextField e personaliza
     * @param nome → Recebe uma String com o nome que aparecerá ao campo perder o foco
     * @param corFocada → Recebe uma cor para o texto quando o campo não estiver vazio
     * @param corDesfocada → Recebe uma cor para o texto quando o campo estiver vazio
     */
    
    public Placeholder(JTextField item, String nome, Color corFocada, Color corDesfocada){
        this.txtArea = new JTextArea();
        this.txtArea.setText("none");
        this.item = item;
        this.nome = nome;
        this.corFocada = corFocada;
        this.corDesfocada = corDesfocada;
    }
    
    /**
     * Cria um Placeholder com as configurações recebidas por parâmetro
     * @param item → Recebe um JTextArea e personaliza
     * @param nome → Recebe uma String com o nome que aparecerá ao campo perder o foco
     * @param corFocada → Recebe uma cor para o texto quando o campo não estiver vazio
     * @param corDesfocada → Recebe uma cor para o texto quando o campo estiver vazio
     */
    
    public Placeholder(JTextArea txtArea, String nome, Color corFocada, Color corDesfocada){
        this.item = new JTextField();
        this.item.setText("none");
        this.nome = nome;
        this.txtArea = txtArea;
        this.corFocada = corFocada;
        this.corDesfocada = corDesfocada;
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if(item.getText().equals(nome)){
            item.setText("");
            item.setForeground(corFocada);
        }else{
            if(txtArea.getText().equals(nome)){
                txtArea.setText("");
                txtArea.setForeground(corFocada);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(item.getText().equals("")){
            item.setText(nome);
            item.setForeground(corDesfocada);
        }else{
            if(txtArea.getText().equals("")){
                txtArea.setText(nome);
                txtArea.setForeground(corDesfocada);
            }
        }
    }
}