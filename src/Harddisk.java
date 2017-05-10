
public class Harddisk {
    int mem;
    public void allocateHdd(int g){
        mem=g;
        System.out.println("Allocated "+mem+" MB memory in hdd");
    }
    public void executeHdd(){
        System.out.println("Executing with "+mem+" MB memory in hdd");
    }
}
