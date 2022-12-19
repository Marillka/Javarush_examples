package глубокое_клонирование_через_сериализацию;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{

        // создаем объект objectOriginal, который будем клонировать. Он и все его подобъекты должны поддерживать сериализацию.
        BigObject objectOriginal = new BigObject();

        // создаем ByteArrayOutputStream – массив байт, который будет динамически растягиваться при добавлении к нему новых данных (как ArrayList).
        ByteArrayOutputStream writeBuffer = new ByteArrayOutputStream();
        // создаем ObjectOutputStream, который используется для сериализации.
        ObjectOutputStream outputStream = new ObjectOutputStream(writeBuffer);
        // сериализуем объект objectOriginal в массив байт с помощью outputStream и сохраняем его в массив writeBuffer.
        outputStream.writeObject(objectOriginal);
        outputStream.close();

        //преобразовываем writeBuffer в обычный массив байт. Дальше мы из этого массива будем «читать» наш новый объект.
        byte[] buffer = writeBuffer.toByteArray();
        // оборачиваем buffer в класс ByteArrayInputStream, чтобы из него можно было читать, как из InputStream.
        ByteArrayInputStream readBuffer = new ByteArrayInputStream(buffer);
        // передаем объект readBuffer классу ObjectInputStream, для чтения (десериализации) объекта.
        ObjectInputStream inputStream = new ObjectInputStream(readBuffer);
        // читаем наш объект и преобразуем его к типу BigObject.
        BigObject objectCopy = (BigObject)inputStream.readObject();

    }
}
