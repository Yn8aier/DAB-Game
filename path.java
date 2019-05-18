package Project;

import java.io.File;
import java.io.IOException;

public class path {
	public static void main(String[] args) throws Exception {
		File directory = new File("");
		String path = directory.getCanonicalPath();
		path = path.replaceAll("\\\\","\\\\\\\\");
		System.out.println(path);
	}

}
