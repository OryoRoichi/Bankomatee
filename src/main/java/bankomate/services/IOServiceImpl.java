package bankomate.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {

    private BufferedReader reader;

    public IOServiceImpl() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String read() throws IOException {
        return reader.readLine();
    }

    public void write(String message) {
        System.out.println(message);
    }

    public void writeUnknownError() {
        write("Неизвестная ошибка. Попробуйте еще раз");
    }
    public int readInt() {
        try {
            return Integer.parseInt(read());
        } catch (IOException e) {
            writeUnknownError();
            return readInt();
        }
    }
    public Long readLong() {
        try {
            return Long.parseLong(read());
        } catch (IOException e) {
            writeUnknownError();
            return readLong();
        }
    }
}
