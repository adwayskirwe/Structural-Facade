
public class GPU {
    int mem;
    public void allocateGPU(int g){
        mem=g;
        System.out.println("Allocated "+mem+" MB memory in gpu");
    }
    public void executeGPU(){
        System.out.println("Executing with "+mem+" MB memory gpu");
    }
}
