public class MetotOverloading {

    static void print(){
        System.out.println("PARAMETRESİZ METOT");
    }

    static void print(int a) {
        System.out.println("Parametreler : " + a);
    }
    public static void main(String[] args) {
        print();
        print(3);
    }
}
