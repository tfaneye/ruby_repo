package takingInputDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public void createOurFirstFile(){
        String fileNme = "\\src\\SecondNewClassNote.txt";
        String rootPath = System.getProperty("user.dir"); //C:\AutomationTraining\BatchB\ruby_repo\FirstTasteOfIntelliJProject
        String filePath = rootPath + fileNme;
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoFile(){
        String fileNme = "\\src\\ThirdNewClassNote.properties";
        String rootPath = System.getProperty("user.dir"); //C:\AutomationTraining\BatchB\ruby_repo\FirstTasteOfIntelliJProject\src\
        String filePath = rootPath + fileNme;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("This is our first file we are writing into!!\n We are happy with it\nThank you all for your patience!!");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
