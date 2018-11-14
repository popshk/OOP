package popshk.Vocabulary;

import java.io.*;
import java.util.*;

public class FullStack implements Serializable  {

	private static final long serialVersionUID = 5281797358788044486L;
	
	private final FileWriter writer = new FileWriter("/home/popshk/Рабочий стол/test1/Dictionary.txt");
	
	Map<String,String> map;
	
	public FullStack(Map<String, String> map) throws IOException {
		this.map=map;
	}
	
	public void Translator(){
		try{
			while (true) {
				BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
					
					System.out.print("Введите слово: ");
				
					String s = read.readLine();
					
					if(s.equals("exit")) break;

					System.out.print("Перевод: ");
				
				if(map.containsKey(s)) {
					System.out.println(map.get(s));					
				} else if (map.containsValue(s)){
					Set<Map.Entry<String,String>> entrySet=map.entrySet();

					for (Map.Entry<String,String> entry : entrySet) {
					    if (s.equals(entry.getValue())) {
					       System.out.println(entry.getKey());// нашли наше значение и возвращаем  ключ
					    }
					}
				} else{
					System.out.println("Совпадения не найдены!!!");
					continue;
				}
			}
			} catch (Exception e){
				e.printStackTrace();
			}
	}
	
	public void InputWords(){
		try{
			
			while(true){
			
				BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.print("Введите слово: ");
				String a = read.readLine();
					if(a.equals("exit")){
						break;
					}else{
						System.out.print("Введите перевод: ");
						String r = read.readLine();
						map.put(a, r);
					}	
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void WriteTxt(){
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			try {
				writer.write(it.next().toString()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
