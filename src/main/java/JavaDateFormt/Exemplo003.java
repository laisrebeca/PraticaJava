package JavaDateFormt;

import java.time.LocalTime;

public class Exemplo003 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:55:37.421

    }
}
