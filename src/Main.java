import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Создаем контейнер и заполняем его
        ArrayList<Complex> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int real = Integer.valueOf(in.nextLine());
            int img = Integer.valueOf(in.nextLine());
            al.add(new Complex(real,img));
        }

        //Просмотр контейнера
        System.out.println("Array1:");
        for(Complex complex : al){
            System.out.println(complex.getReal() + " + " + complex.getImg() + "i");
        }

        //Изменение контейнера
        al.remove(3);
        al.set(2,new Complex(2,9));

        System.out.println("");
        System.out.println("______________");
        System.out.println("");

        //Просмотр с помощью итераторов
        System.out.println("Array1:");
        Iterator<Complex> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("");
        System.out.println("______________");

        //Создаем 2 контейнер этого же типа
        ArrayList<Complex> arrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++){
            int real = Integer.valueOf(in.nextLine());
            int img = Integer.valueOf(in.nextLine());
            arrayList.add(new Complex(real,img));
        }

        //Удаляем из первого контейнера все элементы после 3-го
        al.subList(3,al.size()).clear();
        al.addAll(arrayList);

        //Просмотр контейнеров с помощью итераторов
        System.out.println("Array1:");
        itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("");
        System.out.println("______________");
        System.out.println("Array2:");
        itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
