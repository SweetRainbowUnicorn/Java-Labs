package savanna;

import java.io.*;
import java.util.List;

public class SavannaAnimalWriter {

    public final void writeToFile(final List<SavannaAnimal> savannaAnimalsList) throws IOException {
        File file = new File("savannaAnimalsList.csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream)) {


            for (SavannaAnimal savannaAnimal : savannaAnimalsList) {
                writer.println(savannaAnimal.getHeaders());
                writer.println(savannaAnimal.toCSV());
                writer.println("");
            }
            writer.close();
        } catch (IOException e) {
            throw e;
        }

    }
}