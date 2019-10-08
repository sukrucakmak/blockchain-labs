package org.sukru.cryptographichash;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String message1 = "Hello from Sukru!";
        System.out.println("Hash Code of '"+ message1 +"': "+ message1.hashCode());
        
        String message2 = "Hello from Sükrü!";
        System.out.println("Hash Code of '"+ message2 +"': "+ message2.hashCode());
        
        String message3 = "Hello from Şükrü!";
        System.out.println("Hash Code of '"+ message3 +"': "+ message3.hashCode());
    }
}
