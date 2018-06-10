package savanna;

import java.io.*;
import java.util.List;
import java.util.Map;

public class SavannaAnimalWriter {

    public void writeToFile(final List<SavannaAnimal> savannaAnimalsList) throws IOException {
        File file = new File("houseDevicesList.csv");
        if (!file.exists()){
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream); ){



            for (SavannaAnimal houseDevice:savannaAnimalsList) {
                writer.println(houseDevice.getHeaders());
                writer.println(houseDevice.toCSV());
                writer.println("");
            }
            writer.close();
        }
        catch (IOException e) {
            throw e;
        }

    }
}