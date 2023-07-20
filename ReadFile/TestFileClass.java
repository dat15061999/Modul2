package ReadFile;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        file.getAbsoluteFile();
        System.out.println(new java.util.Date(file.lastModified()));
    }
}
