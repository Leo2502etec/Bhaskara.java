package formulabhaskara.java.mavenproject1;

public class FormulaBhaskara {

    public static void main(String[] args) {
    
      scanner sc = new
    scanner(System.in);
      
      double a, b, c;
      double delta, x1, x2; 
      
      System.out.print("Digite o valor de A: ");
      a = sc.nextDouble();
      System.out.print("Digite o valor de B: ");
      b = sc.nextDouble();
      System.out.print("Digite o valor de C: ");
      c = sc.nextDouble();
      
      delta = (b * b) - (4 * a * c);
      if (delta < 0){
      System.out.println("Delta é negativo, sendo assim não existe raízes reais ");
      } else{
      x1 = (-b + Math.sqrt(delta)) / (2 * a);    
      x2 = (-b + Math.sqrt(delta)) / (2 * a); 
      
      System.out.println("Delta = " + delta);
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
      
      } 
      sc.close();      
    }
}

