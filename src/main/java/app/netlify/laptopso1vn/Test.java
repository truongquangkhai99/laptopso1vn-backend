package app.netlify.laptopso1vn;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String Url = "Thai0913442325.";

		System.out.println( DigestUtils.md5Hex( Url ) );
	}
}
