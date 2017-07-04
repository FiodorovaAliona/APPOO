import java.util.*;

public class Main2 {

    public static boolean isReal(Complex obj){
        return obj.getImg()==0;
    }

    public static void main(String[] args){

        //Создаем контейнер и заполняем его
        ArrayList<Complex> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int real = Integer.valueOf(in.nextLine());
            int img = Integer.valueOf(in.nextLine());
            arrayList.add(new Complex(real,img));
        }

        //Сортируем контейнер по убыванию
        Collections.sort(arrayList, Collections.reverseOrder());

        //Просмотр контейнеров с помощью итераторов
        System.out.println("Array:");
        Iterator<Complex> itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("______________");
        System.out.println("");

        //Поиск элемента
        int index = -1, i = 0;
        itr = arrayList.iterator();
        while(itr.hasNext()){
            if (isReal(itr.next())) index = i;
            i++;
        }
        System.out.println("Index: " + i);
        System.out.println("______________");
        System.out.println("");

        //Поиск элементов и перенос во второй контейнер
        Stack<Complex> stack = new Stack<>();
        for(Complex d : arrayList){
            if(d.getImg() == 0) {
                stack.add(d);
            }
        }

        //Просмотр 2-го контейнера
        System.out.println("Stack:");
        for(Complex obj : stack)
        {
            System.out.println(obj);
        }
        System.out.println("______________");
        System.out.println("");

        //Сортируем контейнеры по возрастанию
        Collections.sort(arrayList);
        Collections.sort(stack);

        //Просматриваем оба контейнера
        System.out.println("Array:");
        for(Complex obj : arrayList)
        {
            System.out.println(obj);
        }
        System.out.println("______________");
        System.out.println("");
        System.out.println("Stack:");
        for(Complex obj : stack)
        {
            System.out.println(obj);
        }
        System.out.println("______________");
        System.out.println("");

        //Создаем 3 контейнер и добавляем в него элементы из 2 предыдущих
        ArrayList<Complex> arrayListNew = new ArrayList<>();
        arrayListNew.addAll(arrayList);
        arrayListNew.addAll(stack);

        //Просматриваем 3-й контейнер
        System.out.println("United:");
        for(Complex obj : arrayListNew)
        {
            System.out.println(obj);
        }
        System.out.println("______________");
        System.out.println("");

        index = -1;
        for (Complex d : arrayListNew){
            if(isReal(d)) index++;
        }
        System.out.println("Index " + (index!=-1));
        System.out.println("______________");
        System.out.println("");

        //Поиск элементов и перенос во второй контейнер
        Optional<Complex> t  = arrayListNew.stream().filter(b->b.getImg()==0).findFirst();
        if (t.isPresent()) System.out.println("Element naiden " + t.get());
        else System.out.println("Element ne naiden");

        long a  = arrayListNew.stream().filter(b->b.getImg()==0).count();
        System.out.println(a + " elements are real");
    }
}
