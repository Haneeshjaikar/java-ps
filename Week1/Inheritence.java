package Week1;

public class Inheritence extends visibility {
    public static void main(String args[]){
        visibility vis = new visibility();
        System.out.println(vis.pub);
        // System.out.println(vis.pri);  not visible
        System.out.println(vis.pro);
    
    }
}
