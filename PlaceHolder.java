package ouvintes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlaceHolder implements FocusListener{
    private JTextField item;
    private String nome;
    private JTextArea txtArea;
    
    public PlaceHolder(JTextField item, String nome){
        this.txtArea = new JTextArea();
        this.txtArea.setText("none");
        this.item = item;
        this.nome = nome;
    }
    
    public PlaceHolder(JTextArea txtArea, String nome){
        this.item = new JTextField();
        this.item.setText("none");
        this.nome = nome;
        this.txtArea = txtArea;
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if(item.getText().equals(nome)){
            item.setText("");
            item.setForeground(Color.black);
        }else{
            if(txtArea.getText().equals(nome)){
                txtArea.setText("");
                txtArea.setForeground(Color.black);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(item.getText().equals("")){
            item.setText(nome);
            item.setForeground(Color.lightGray);
        }else{
            if(txtArea.getText().equals("")){
                txtArea.setText(nome);
                txtArea.setForeground(Color.lightGray);
            }
        }
    }
}