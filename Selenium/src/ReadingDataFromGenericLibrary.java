import java.io.IOException;

import com.actitime.generic.FileLib;

public class ReadingDataFromGenericLibrary {

	public static void main(String[] args) throws IOException {
FileLib fl=new FileLib();

String url = fl.readPropertyFile("url");
String username = fl.readPropertyFile("un");
String password = fl.readPropertyFile("pw");
System.out.println(url+"\n"+username+"\n"+password);
	}

}
