import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Obtendo a data atual do sistema em diferentes tipos de objetos

        // Obtendo a data atual (apenas ano/mês/dia)
        LocalDate d1 = LocalDate.now();

        // Obtendo a data e hora atual (incluindo hora:minuto:segundo)
        LocalDateTime d2 = LocalDateTime.now();

        // Obtendo a data e hora atual em formato UTC (Instant)
        Instant d3 = Instant.now();


        // Convertendo strings em LocalDate e LocalDateTime

        // Convertendo uma string para LocalDate (sem hora)
        LocalDate d4 = LocalDate.parse("2024-07-10");

        // Convertendo uma string para LocalDateTime com hora específica
        LocalDateTime d5 = LocalDateTime.parse("2024-07-10T11:34:14");

        // Convertendo uma string para Instant (com zona de tempo explícita)
        Instant d6 = Instant.parse("2024-07-10T11:34:14Z"); // Horário GMT
        Instant d7 = Instant.parse("2024-07-10T11:34:14-03:00"); // Fuso horário de Brasília

        // Formatando datas e horas
        // documentação no site da oracle -> https://encurtador.com.br/LKY9R

        // Formatando um LocalDate para uma string específica
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d8 = LocalDate.parse("10/07/2024", formatter1);

        // Convertendo uma string formatada para LocalDateTime
        LocalDateTime d9 = LocalDateTime.parse("10/07/2024 14:54", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        // Criando LocalDate e LocalDateTime explicitamente

        // Criando um LocalDate específico
        LocalDate d10 = LocalDate.of(2024, 7, 10);

        // Criando um LocalDateTime específico
        LocalDateTime d11 = LocalDateTime.of(2024, 7, 10, 14, 58);
    }
}