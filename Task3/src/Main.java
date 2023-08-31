import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        //Коллкция букв, которые могут быть в федеральном номере
        Set<Character> letterSet = Set.of('А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х');
        //Поток ввода
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Паттерн регулярного выражения
        Pattern pattern = Pattern.compile("^\\D{1}[0-9]{3}\\D{2}\\D{3}[0-9]{2,3}$");

        while(true) {
            System.out.println("Введите номер, чтобы заввершить программу введите 0");
            //Ввод
            String numberplate = reader.readLine();
            //Удаление всех пробелов в номере
            numberplate = numberplate.replaceAll(" ", "");
            //Создаём мэтчер для проверки регулярки
            Matcher matcher = pattern.matcher(numberplate);

            //Проверка на выход из программы
            if(numberplate.length() == 1 && numberplate.charAt(0) == '0'){
                break;
            }
            //Множественные проверки на ошибки в номере
            if(numberplate.length()<11){
                System.out.println("! Введен несуществующий номер, номер слишком короткий !");
            }
            else if(numberplate.length()>12){
                System.out.println("! Введен несуществующий номер, номер слишком длинный !");
            }
            else if (!letterSet.containsAll(List.of(numberplate.charAt(0), numberplate.charAt(4), numberplate.charAt(5)))) {
                System.out.println("! Введен несуществующий номер, такие буквы не могут быть использованы в номерном знаке РФ !");
            }
            else if(!numberplate.substring(6, 9).equals("RUS")){
                System.out.println("! Введен несуществующий номер, отсутствует код \"RUS\" !");
            }
            else if(!matcher.find()){
                System.out.println("! Введен несуществующий номер, не верный формат номерного знака !");
            }

            //Проверка на Московский регион
            Pattern patternRegion = Pattern.compile("(50|90|150|190){1}$");
            Matcher matcherRegion = patternRegion.matcher(numberplate);
            if(matcherRegion.find()){
                System.out.println("\tРегион: Московская область\n\tФедеральный округ: Центральный");
            }
            //Проверка на Новосибирский регион
            patternRegion = Pattern.compile("(54|154){1}$");
            matcherRegion = patternRegion.matcher(numberplate);
            if(matcherRegion.find()){
                System.out.println("\tРегион: Новосибирская область\n\tФедеральный округ: Сибирский");
            }
        }
    }
}