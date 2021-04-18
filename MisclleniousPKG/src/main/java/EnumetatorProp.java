import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnumetatorProp {
	static  Properties prop;
	private final String path="C:\\Users\\v-sompa\\eclipse-workspace\\MisclleniousPKG\\src\\main\\java\\Java.Properties";
	
	public EnumetatorProp() throws IOException {
		BufferedReader reader;
		reader= new BufferedReader(new FileReader(path));
		Properties prop= new Properties();
		prop.load(reader);
	}
	
	@Ignore
	void test() {
		
	}
	
	


	@Test(dependsOnMethods= {"test"})
	public static void main(String[] args) {
		
		//@SuppressWarnings({ "rawtypes", "unchecked" })
		/*Enumeration keyvalues=prop.keys();
		while(keyvalues.hasMoreElements()) {
			String key= (String) keyvalues.nextElement();
			String value= prop.getProperty((String) key);
			System.out.println(key+""+ value);
		}*/
		
		/*Iterator<String>it=(Iterator<String>) prop.keySet();
		while(it.hasNext()) {
			String key= it.next();
			String value=(String) prop.get(key);
			System.out.println(key+""+ value);
			
		}*/
		
		 Set<Entry<Object,Object>>entries=prop.entrySet();
			for(Entry<Object,Object> entry:entries) {
				System.out.println(entry.getKey()+ " " + entry.getValue());
			}
		
		
		//prop.getProperty("")
		
		
		
		
		
		

	}
}


