package MultiThreadingvjit;

import java.io.*;

public class CopyDataThread extends Thread {
public void copy() throws IOException, InterruptedException
{
	File f=new File("D://source.txt");
	File f1=new File("D://target.txt");
	FileReader fr =new FileReader(f);
	FileWriter fw =new FileWriter(f1);
	int num=1,ch;
	while((ch=fr.read())!=-1)
	{
		fw.write(ch);
		num++;
		if(num%10==0)
		{
			sleep(5000);
			System.out.println("10 characters are copied");
		}
	}
}
}
