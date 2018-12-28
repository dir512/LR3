import java.io.*;

public class FileWork {
    public void copy(String src, String dst) throws IOException {//проверка на существование файла
    InputStream is=null;//входящий поток
    OutputStream os=null;//выходящий поток

    final int size4Mb = 4*1024*1024;//читаемые буфером первые 4 байта
    try{
        is=new FileInputStream(src);
        os=new FileOutputStream(dst);
        byte[] buffer = new byte[size4Mb];//размер буфера
        int length;//длина буфера,читаемого другим файлом
        while((length=is.read(buffer))>0){
            os.write(buffer, 0, length);//запись в буфер
        }
    } finally {
        is.close();//закрыть потоки
        os.close();
    }
}}
