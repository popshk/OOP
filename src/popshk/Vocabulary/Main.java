package popshk.Vocabulary;

import java.io.*;
import java.util.*;

public class Main{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
			FileInputStream fis = new FileInputStream("/home/popshk/Рабочий стол/test1/MapSave.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
				try {
					
					HashMap<String, String> map = (HashMap<String, String>)ois.readObject();
					FullStack fullStack = new FullStack(map);
					
					while(true){
						System.out.println("1 - заполнить словарь");
						System.out.println("2 - переводчик");
						System.out.println("exit - выйти в предидущее меню, или закончить программу");
						String q = read.readLine();
						
							if(q.equals("1")) fullStack.InputWords();
							if(q.equals("2")) fullStack.Translator();
							if(q.equals("exit")){
								fullStack.WriteTxt();
									FileOutputStream fos = new FileOutputStream("/home/popshk/Рабочий стол/test1/MapSave.txt");
									ObjectOutputStream oos = new ObjectOutputStream(fos);
										try {
											oos.writeObject(map);
										} catch (Exception e) {
											oos.close();
										}
											break;
						}	
					}
				} catch (Exception e) {
					ois.close();
				}
				
	}
		
}


