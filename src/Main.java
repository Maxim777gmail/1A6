import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Рябов-Жаркой Максим Владимирович";

        // Дата и время получения задания (задаем вручную или через now())
        LocalDateTime receivedDateTime = LocalDateTime.of(2026, 10, 28, 10, 0);

        // Дата и время сдачи задания (текущее время или фиксированное)
        LocalDateTime submittedDateTime = LocalDateTime.now();

        // Форматом приводим к удобному виду
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + developerLastName);
        System.out.println("Получение задания: " + receivedDateTime.format(formatter));
        System.out.println("Сдача задания: " + submittedDateTime.format(formatter));
    }
}
