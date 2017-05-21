package com.sd.myFile;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;

public class FileDemoMain {
  public static void main(String[] args) throws Exception{
    File readme=null;
    InputStream isReadme = null;
    InputStreamReader isrReadme=null;
    BufferedReader brReadme = null;
    String str;
    try {
      String cwd=new File(".").getCanonicalPath();
      readme=new File(cwd, "README.txt");
      isReadme=new FileInputStream(readme);
      isrReadme=new InputStreamReader(isReadme,"UTF8");
      brReadme= new BufferedReader(isrReadme);
      while((str=brReadme.readLine()) !=null) {
        System.out.println(str);
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      if(brReadme !=null)
        brReadme.close();
    }
  }
}