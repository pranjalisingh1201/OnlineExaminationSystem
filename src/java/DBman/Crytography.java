/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBman;

/**
 *
 * @author DELL
 */
public class Crytography {
    public String encryptMyData(String PlainText)
    {
        String EncryptedText="";
        for(int x=0;x<PlainText.length();x++)
        {
            char ch=PlainText.charAt(x);
            int ASCIIValue;
            ASCIIValue = (int)ch;
            if(ASCIIValue>=65 && ASCIIValue<=90)
                ASCIIValue=122-ASCIIValue+65;
            else if(ASCIIValue>=97 && ASCIIValue<=122)
                ASCIIValue=90-ASCIIValue+97;
            else if(ASCIIValue>=48 && ASCIIValue<=57)
                ASCIIValue=57-ASCIIValue+48;
            ch=(char)ASCIIValue;
            EncryptedText=EncryptedText+ch;
        }
    
return EncryptedText;
    
}
}