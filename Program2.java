lass AccessSpecifierDemo {
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue,int proValue, int pubValue)
    {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
    public void getVar()
    {
        System.out.println("priVar: "+priVar+"\n"+"Provar: "+proVar+"\n"+"pubVar: "+pubVar);
    }

}
public class Program2{

    public static void main(String[] args) {
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        obj.setVar(1,2,4);
        obj.getVar();
    }
}

