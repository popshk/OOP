package popshk;

import java.io.File;
import java.io.IOException;

public class FilesCreator {
    public static void main(String[] args) throws IOException {

		File file = new File("/home/popshk/Рабочий стол/test1/monitor.txt");
			file.createNewFile();

			/*FileWriter wr = new FileWriter(file);
					wr.write("TEXT");
					//wr.flush();
					wr.close();*/
	}
}
