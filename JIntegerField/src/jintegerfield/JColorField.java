/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jintegerfield;

import javax.swing.text.Document;

/**
 *
 * @author sarahatterbury
 */
public class JColorField extends JIntegerField{
    public JColorField(){
        super();
        setText("0");
    }
    
    @Override
    protected Document createDefaultModel(){
       String[] accept = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
       //String number = getText();
       return new ColorDocument(accept);
    }
    
}
