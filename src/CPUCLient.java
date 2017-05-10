
public class CPUCLient {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.allocate(500, 100, 1000);
        f.execute();
    }
}
