class Funcionario {
    private String mat;
    private String nome;
    private Double sal;
    
    public Funcionario (String mat, String nome, Double sal) {
        this.mat  = mat;
        this.nome = nome;
        this.sal  = sal;
    }
    
    public String getMat(){
        return this.mat;
    }

    public String setMat(String mat){
        return this.mat = mat;
    }
}

public class Main {
	public static void main(String[] args) {
      Funcionario func;
      func = new Funcionario("321", "Heleno", 8.090);

      System.out.println(func.getMat());	    
      System.out.println(func.setMat("764"));	    
	}
}       