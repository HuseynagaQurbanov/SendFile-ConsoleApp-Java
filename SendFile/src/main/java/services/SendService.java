package services;

import com.fileutility.FileUtility;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import lombok.SneakyThrows;

public class SendService {
    
    @SneakyThrows
    public static String send(String localHost, int port, String filePath){
        Socket socket = new Socket(localHost, port);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
        byte[] bytes = FileUtility.readBytesFromFile(filePath);
        
        //SendFile
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        
        return "Your file sent successfuly";
    }
}
