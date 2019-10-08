package org.sukru.cryptographichash;

import java.security.MessageDigest;

public class SecureHashAlgorithm {
	
	public static void main(String[] args) throws Exception {
		String message = "Hello from Sukru";
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedHash = digest.digest(message.getBytes());
		
		System.out.println("Encoded: "+ bytesToHex(encodedHash));
	}
	
	private static String bytesToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			
			if(hex.length()==1) hexString.append('0');
			
			hexString.append(hex);
		}
		
		return hexString.toString();
	}

}
