package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) throws IOException {

        Properties config= new Properties();
        Properties OR= new Properties();

        FileInputStream fis =new FileInputStream("D:\\V\\Java\\lessons\\DataDrivenFramework\\src\\test\\resources\\properties\\Config.properties");
        fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");

        OR.load(fis);
        System.out.println(config.getProperty("browser"));
    }
}
