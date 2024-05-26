package lowleveldesign.Structural.FileSystem;

import java.util.ArrayList;

public class FileSystemApp {
    public static void main(String[] args) {
        Directory directory= new Directory("root");
        Files file= new File("system");
        ArrayList list= new ArrayList();
        list.add(file);
        directory.setFilesList(list);
        directory.ls();

    }
}
