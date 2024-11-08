package game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileRuleTXT {
	public static void ruleTXT(String locationTXT, String rulesTXT) {
		try(
				FileWriter creatorFile = new FileWriter(locationTXT, true);
				BufferedWriter buffer = new BufferedWriter(creatorFile);
				PrintWriter writerTXT = new PrintWriter(buffer);				
				) {
			writerTXT.append(rulesTXT);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
