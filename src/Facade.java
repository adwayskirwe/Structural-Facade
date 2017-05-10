
public class Facade {
    int gpumemory,rammemory,hddmemory;
    GPU gpu;
    Ram ram;
    Harddisk hdd;
    public Facade(){
        gpu=new GPU();
        ram=new Ram();
        hdd=new Harddisk();
    }

    public void allocate(int g,int r,int h){
        gpumemory=g;
        rammemory=r;
        hddmemory=h;

        gpu.allocateGPU(gpumemory);
        ram.allocateRam(rammemory);
        hdd.allocateHdd(hddmemory);

    }

    public void execute(){
        gpu.executeGPU();
        ram.executeRam();
        hdd.executeHdd();

    }
}
