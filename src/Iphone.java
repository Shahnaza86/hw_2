public class Iphone extends Mobile {
    public String getInternet() {
        return internet;
    }

    private String internet;

    public Iphone(String model, int charge, int memory) {
        super(model, charge, memory);}


    @Override
    public void print() {
        System.out.println("Model Iphone" + getModel() +
                "\nCharge:" + getCharge() +
                "\nMemory: " + getMemory()+
                "\nInternet:SUPER"+
        "\n_________");

    }

    }

