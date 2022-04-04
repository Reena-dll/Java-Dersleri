public class main {

    static void print(){
        System.out.println("Parametresiz metot");
    }

    static void print(int a){
        System.out.println("Parametreli Metot: "+a);
    }

    static int print(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(5,2));
    }
}
