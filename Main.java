 
public class Main
{
    
    public Main()
    {
        ChaineCryptée cc1= new Chainecryptée.FromCrypted("EFG",3);
        ChaineCryptée cc2= new Chainecryptée.FromDeCrypted("EFG",3);
        
        System.Out.printl(cc1.Crypte());
        System.Out.printl(cc1.Decrypte());
        
        System.Out.printl(cc2.Crypte());
        System.Out.printl(cc2.Decrypte());
        
    }

    
}
