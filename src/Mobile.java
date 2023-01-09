public abstract class Mobile implements Printable{
    private String model;
    private int charge;
    private int memory;

    public Mobile(String model, int charge, int memory) {
        this.model = model;
        this.charge = charge;
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public int getCharge() {
        return charge;
    }

    public int getMemory() {
        return memory;
    }
    public abstract void print();

}
