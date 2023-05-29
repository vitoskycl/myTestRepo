package cl.vitosky.main;

import org.apache.commons.lang.StringUtils;

import cl.vitosky.utils.AES;

public class EncodeDecodePassword {

	public static void main(String[] args) {
		String secretKey = "";
		String strToDecrypt;
		String strToEncrypt;
		
		if (args != null && args.length > 0) {
			int i=0;
			for (final String s : args) {
				if (StringUtils.equals(s, "-s")) {
					secretKey = args[i+1];
				}				
				if (StringUtils.equals(s, "-d")) {
					strToDecrypt = args[i+1];
					System.out.println(AES.decrypt(strToDecrypt, secretKey));
				}
				if (StringUtils.equals(s, "-e")) {
					strToEncrypt = args[i+1];
					System.out.println(AES.encrypt(strToEncrypt, secretKey));
				}
				i++;
			}			
		}else{
			System.out.println("faltan parametros");
		}
	}
}
