// "Let's get together and hash it out." - Tony Stark

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashes {

	//give a name to the string that will hold your hash
    private String crazyHash;

	//creates lakuhnhvao8745o87ta "crazyHash"

    public void makeHash(String hashName) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] byteArr = md.digest(hashName.getBytes(StandardCharsets.UTF_8));

        StringBuilder buildStr = new StringBuilder();

        for (byte b : byteArr) {
            buildStr.append(String.format("%02x", b));
        }

		//assign the hash to previously initialized variable
        crazyHash = buildStr.toString();
    }

    public String getHashedStr() {

		//return your new hash value.
		return crazyHash;
    }

}
