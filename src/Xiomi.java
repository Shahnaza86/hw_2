public class Xiomi extends Mobile {
    public String getDinamic() {
        return dinamic;
    }

    private String dinamic;

    public Xiomi(String model, int charge, int memory) {
        super(model, charge, memory);
    }

    @Override
    public void print() {
       System.out.println("Model Xiomi" + getModel() +
                "\nCharge:" + getCharge() +
                "\nMemory: " + getMemory()+
                "\nDinamic:Powerful"+
               "\n_________");
    }
}
