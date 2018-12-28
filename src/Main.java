import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileWork fileWork = null;
        try {
            fileWork = new FileWork();//использование FileWork для работы с файлами
            fileWork.copy( "F:\\2.txt", "F:\\2_copy.txt");//открытие 1 файла для чтения и 2 файла для копирования
        } catch (Exception e) {//проверка исключения
            System.out.println(e.getMessage());
        }
    }
}




