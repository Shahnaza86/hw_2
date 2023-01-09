public class Main {
    public static void main(String[] args) {
        Mobile iphone = createObject("Iphone");
        iphone.print();
        Mobile sumsung = createObject("Sumsung");
        sumsung.print();
        Mobile xiomi = createObject("Xiomi");
        xiomi.print();


    }

    private static Mobile createObject(String className) {
        switch (className) {
            case "Iphone":
                return new Iphone("13 pro Max", 4, 512);
            case "Sumsung":
                return new Sumsung(" S6", 3, 256);
            case "Xiomi":
                return new Xiomi(" Mi 5", 2, 64);

        }return null;
    }
}