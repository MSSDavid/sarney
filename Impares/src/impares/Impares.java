package impares;

public class Impares {

    public static void main(String[] args) {
      
      int soma = 0;
        
      for (int numero = 0; numero <=100; numero++) {
          if ((numero % 2)!=0) {
          soma += numero;   
          }
          
      }
       System.out.println(soma);
    
          }
}
