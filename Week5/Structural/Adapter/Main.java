package Week5.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        BuilderImplementation builderImpl = new BuilderImplementation();
        
        builderImpl.build("house", "Kothapet");
        builderImpl.build("Skyscrapper", "Jubilee Hills");
        builderImpl.build("Skyscrapper", "Uppal");
        builderImpl.build("Hotel", "Tarnaka"); 
    }
}