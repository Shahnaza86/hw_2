public class Sumsung extends  Mobile {
    public String getColor() {
        return color;
    }

    private String color;

    public Sumsung(String model, int charge, int memory) {
        super(model, charge, memory);
    }


    @Override
    public void print() {
        System.out.println("Model Sumsung" + getModel() +
                "\nCharge:" + getCharge() +
                "\nMemory: " + getMemory()+
                "\nColor:White"+
                "\n_________");





    }
}
