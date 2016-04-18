package homework.Util;

import java.util.regex.Pattern;

public class Constant {
	public static final Pattern PATTERN = Pattern.compile("(:)");
	private static final String FILE_NAME = "src/main/resources/transfers.txt";
	public static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
	static final String TEST_FILE_TXT = "src/test/resources/testFile.txt";

	private Constant() {
	}
}
