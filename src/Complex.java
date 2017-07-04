import java.util.Objects;

public class Complex implements Comparable<Complex>{
    private int real;
    private int img;
    public Complex(){
        real = 0; img = 0;
    }
    public Complex(int real, int img){
        this.real = real; this.img = img;
    }
    @Override
    public  boolean equals (Object obj){
        return  obj.getClass() == getClass() && real == ((Complex)obj).real;
    }
    public int compareTo(Complex arg){
        if(real > arg.real) return 1;
        else if (real < arg.real) return -1;
        return 0;
    }
    public int getReal(){ return real; }
    public int getImg(){ return img; }
    public void setReal(int real){ this.real = real; }
    public void setImg(int img){ this.img = img; }

    @Override
    public String toString() {
        return String.format("%d + %di", real, img);
    }

    @Override
    public int hashCode(){
        return Objects.hash(real,img);
    }
}
