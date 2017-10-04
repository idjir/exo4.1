package pack;

public class Main
{
    
    public Main()
    {
        //testcrypter
        ChaineCryptée cc1=  ChaineCryptée.FromCrypted("EFG",3);
        System.out.println(cc1.Crypte());
        System.out.println(cc1.Decrypte());
        
        //testdecrypter
        ChaineCryptée cc2=  ChaineCryptée.FromDecrypted("EFG",3);
        System.out.println(cc2.Crypte());
        System.out.println(cc2.Decrypte());
        
    }

    
}
