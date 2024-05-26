package lowleveldesign.Structural.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Files{
    String name;
    List<Files> filesList;

    public List<Files> getFilesList() {
        return filesList;
    }

    public void setFilesList(List<Files> filesList) {
        this.filesList = filesList;
    }

    public Directory(String name ) {
        this.filesList= new ArrayList<>();
        //this.filesList=filesList;
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name +"\t");
        for (Files f :filesList){
            System.out.println(f);
        }


    }
}
