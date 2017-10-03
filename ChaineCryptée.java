import java.*;

//constructeur
public class ChaineCryptée
{
    
    private int decalage;
    private String chaineclaire;

    
    public ChaineCryptée(int d, String c)
    {
        //si la chaine à entrer est null renvoyer chainevide
        if(c==null) {chaineclaire="chainevide";}
        else
        {
        this.decalage=d;
        this.chaineclaire=c;
		}
    }

    public String Crypte()
    {
        int i;
        char c;
        String cryptee="";
        
			
		
        for(i=0;i<chaineclaire.length();i++)
        {
            c=decaleCaractere(chaineclaire.charAt(i),decalage);
            cryptee+=c;
        }
        return cryptee;
    }

    public String Decrypte()
    {
        return chaineclaire;
    }
    
    private static char decaleCaractere (char c, int decalage)
	{
		return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
	}
}