package lowleveldesign.Structural.FileSystem;

public class File implements Files{
    String name ;

    @Override
    public String toString() {
        return " ==> "+ name ;
    }

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println( name );
    }
}
