package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropTest {

	public static void load() {
		String path = "/config/db.properties";  //최상위 폴더는 src 이므로 /는 src 이다.
		InputStream is = 
				PropTest.class.getResourceAsStream(path);  
		System.out.println(is);
		Properties prop = new Properties();    // 마우스 두번째
		try {
			prop.load(is);
			is.close();  			//다 prop가 읽었으니 닫아줌
			System.out.println(prop.getProperty("url"));    // 두번쨰 결과값
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("pwd"));
			System.out.println(prop.getProperty("driver"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		load();
	}
}
