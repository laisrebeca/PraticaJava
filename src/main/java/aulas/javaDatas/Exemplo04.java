package aulas.javaDatas;
import java.util.Date;

public class Exemplo04 {
    public static void main(String[] args) {
      Date dataP = new Date(1513124807691L);

      Date dataF = new Date(1713124807691L);

      Date mesmaDataF = new Date(1713124807691L);

      boolean isEquals = dataF.equals(mesmaDataF);

      System.out.println(isEquals);

      int compareCase1 = dataP.compareTo(dataF);

      int compareCase2 = dataF.compareTo(dataP);

      int compareCase3 = dataF.compareTo(mesmaDataF);

      System.out.println(compareCase1);

      System.out.println(compareCase2);

      System.out.println(compareCase3);

    }
}
