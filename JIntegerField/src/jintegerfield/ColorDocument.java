/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jintegerfield;

import javax.swing.JOptionPane;
import javax.swing.text.*;

/**
 *
 * @author sarahatterbury
 */
public class ColorDocument extends RestrictedDocument{
    String[] charList;
    public ColorDocument(String[] charList) {
        super(charList);
        this.charList = charList;
    }
    
    public boolean validate(String exp){
        //int len = charList.length;
        
        if(!super.validate(exp))
            return false;
        int value = Integer.parseInt(exp);
        if(value >=0 && value <= 255)
                return true;
        return false;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException{
        if(str == null || !validate(str)){
            return;
        }
        super.insertString(offset, str, a);
    }
}
