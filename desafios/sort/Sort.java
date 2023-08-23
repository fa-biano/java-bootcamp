import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
  public static void main(String[] args) {
    try (Scanner terminalInput = new Scanner(System.in)) {
      ArrayList<String> assets = new ArrayList<>();

      int qtyAssets = terminalInput.nextInt();
      // o nextInt nao passa para a próxima linha. 
      // Para evitar que a primeira iteração no for retorne uma string vazia, precisar dar um nextLine.
      terminalInput.nextLine();

      for (int i = 0; i < qtyAssets; i++){
        String newAsset = terminalInput.nextLine();
        assets.add(newAsset);
      }

      Collections.sort(assets);

      for (String asset : assets) {
        System.out.println(asset);
      }
    }
  }
}