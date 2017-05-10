
public class Ram {
    int mem;
    public void allocateRam(int g){
        mem=g;
        System.out.println("Allocated "+mem+" MB memory in ram");
    }
    public void executeRam(){
        System.out.println("Executing with "+mem+" MB memory in ram");
    }
}
