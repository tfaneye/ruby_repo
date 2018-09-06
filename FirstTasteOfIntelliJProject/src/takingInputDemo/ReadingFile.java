package takingInputDemo;

import java.io.*;
import java.util.Properties;

public class ReadingFile {

    public void readPlainText(){

        String rootPath = System.getProperty("user.dir");
        String fileName = "\\src\\NewClassNote.txt";
        String fullFilePath = rootPath.concat(fileName);

        String line = null;

        try {
            FileReader fileReader = new FileReader(fullFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null ){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPropertiesText(){

        String rootPath = System.getProperty("user.dir");
        String fileName = "\\src\\ThirdNewClassNote.properties";
        String fullFilePath = rootPath.concat(fileName);

        try {
            FileInputStream fis = new FileInputStream(fullFilePath);
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println(prop);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
