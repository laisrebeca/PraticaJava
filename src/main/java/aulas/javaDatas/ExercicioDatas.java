package aulas.javaDatas;
import java.util.Date;

public class ExercicioDatas {
    public static void main (String[] args){
        Date dataNasc = new Date(1039892400000L);

        Date dataMaio = new Date(1273953600000L);


        boolean isAfter = dataNasc.after(dataMaio);
        System.out.println("Sua Data de Nascimento: " + dataNasc);
        System.out.println("Dia: " + dataMaio);


        System.out.println("Sua Data de Nascimento é antes do dia 15 de Maio de 2010: " + isAfter);



        boolean isBefore = dataNasc.before(dataMaio);
        System.out.println("Sua Data de Nascimento é antes do dia 15 de Maio de 2010: " + isBefore);
    }
}

