package Week1;

public class visibility {
    public String pub = "Public";
    private String pri = "Private";
    protected String pro = "Protected";



public static void main(String args[]){
    visibility vis = new visibility();
    System.out.println(vis.pub);
    System.out.println(vis.pri);
    System.out.println(vis.pro);

}
}
