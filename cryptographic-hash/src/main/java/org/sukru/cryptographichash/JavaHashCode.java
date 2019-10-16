package org.sukru.cryptographichash;

/**
 * Hello world!
 *
 */
public class JavaHashCode 
{
    public static void main( String[] args )
    {
    	// one-way
        String message1 = "Hello from Sukru!";
        System.out.println("Hash Code of '"+ message1 +"': "+ message1.hashCode());
        
        // deterministic
        System.out.println("Hash Code of '"+ message1 +"': "+ message1.hashCode());
        
        // fixed size
        String message2 = "Hello from Sükrü!";
        System.out.println("Hash Code of '"+ message2 +"': "+ message2.hashCode());
        
        // pseudo random
        String message3 = "Hello from Şükrü!";
        System.out.println("Hash Code of '"+ message3 +"': "+ message3.hashCode());
    }
}
