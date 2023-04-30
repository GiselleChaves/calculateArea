import java.util.Scanner;

public class Exercicio3 {
  /**
   * 3. Faça um programa que leia as dimensões de uma casa (largura e comprimento) e as 
   * dimensões de um terreno (largura e comprimento). A seguir, o programa deve calcular e 
   * escrever a área da casa, a área do terreno e a área livre. O cálculo de cada área deve ser 
   * realizado por um método.

   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double houseWidth, houseLength, groundWigth, groundLength, houseArea, groundArea, freeArea;

    System.out.println("Informe a largura da Casa:");
    houseWidth = in.nextDouble();
    System.out.println("Informe o comprimento da Casa:");
    houseLength = in.nextDouble();
    System.out.println("Informe a largura do terreno:");
    groundWigth = in.nextDouble();
    System.out.println("Informe o comprimento do terreno:");
    groundLength = in.nextDouble();

    houseArea = calculateArea(houseWidth,houseLength);
    System.out.printf("\nÁrea da Casa em metros: %.2f", houseArea); 
    groundArea = calculateArea(groundWigth,groundLength);
    System.out.printf("\nÁrea do Terreno em metros: %.2f", groundArea); 
    freeArea = groundArea - houseArea;
    System.out.printf("\nÁrea Livre em metros: %.2f", freeArea); 
    System.out.println();
    System.out.printf("\n.::Fim da Execução::.");
    in.close();
  }
  public static double calculateArea(double width, double length){
    return (width*length);
  }
}
