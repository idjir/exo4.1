import java.*;

public class ChaineCryptée
{
    
    private int decalage;
    private String chainecryptee;

    //constructeur
    public ChaineCryptée(int d, String c)
    {   
        //si la chaine est null afficher chainevide
        if(c==null) {chainecryptee="chainevide";}
        else
        {
        this.decalage=d;
        int i;
        char ch;
        String decryptee="";
        
        for(i=0;i<c.length();i++)
        {
            ch=decaleCaractere(c.charAt(i),decalage);
            decryptee+=ch;
        }
        this.chainecryptee=decryptee;

        }
    }
    
    
    public String Decrypte()
    {
        int i;
        char c;
        String decryptee="";
        
            
        
        for(i=0;i<chainecryptee.length();i++)
        {
            c=decaleCaractere(chainecryptee.charAt(i),(26-decalage));
            decryptee+=c;
        }
        return decryptee;
    }
    
 
    public String Crypte()
    {
        return chainecryptee;
    }
    
    private static char decaleCaractere (char c, int decalage)
    {
        return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
    }
}