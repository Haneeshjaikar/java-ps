// Import the File class
import java.io.File;
import java.io.Serializable;
    public class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        static String country = "ITALY";
        private int age;
        private String name;
        transient int height;
    
        // getters and setters
    }
    
    
