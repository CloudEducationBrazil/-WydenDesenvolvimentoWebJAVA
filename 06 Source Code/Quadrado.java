// https://www.devmedia.com.br/entendendo-interfaces-em-java/25502
interface FiguraGeometrica {
     public String getNomeFigura();
     public int getArea();
     public int getPerimetro();
}

class Quadrado implements FiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;

        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;

        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }
}

public class Main {
    public static void main(String[] args){
        Quadrado figGeo = new Quadrado();
        
        System.out.print(figGeo.getLado());
        
    }
    
}
