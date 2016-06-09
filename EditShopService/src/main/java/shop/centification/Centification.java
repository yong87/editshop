package shop.centification;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Centification {

	public String GenerateCentificationKey(String id) {

		Random rand = new Random();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 20; i++) {

			if (rand.nextInt(100) + 1 > 50) {
				sb.append((char) (rand.nextInt(25) + 65));
			} else {
				sb.append((char) (rand.nextInt(25) + 97));
			}
		}
		return sb.toString();
	}
	
	
}
