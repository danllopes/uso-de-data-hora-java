import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Obtendo a data atual do sistema em diferentes tipos de objetos

        // Obtendo a data atual (apenas ano/mês/dia)
        LocalDate d1 = LocalDate.now();

        // Obtendo a data e hora atual (incluindo hora:minuto:segundo)
        LocalDateTime d2 = LocalDateTime.now();

        // Obtendo a data e hora atual em formato UTC (Instant)
        Instant d3 = Instant.now();
    }
}