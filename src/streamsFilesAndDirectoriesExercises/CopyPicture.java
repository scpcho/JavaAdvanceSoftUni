package streamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    private static final String PICTURE_PATH = "C:\\Users\\scp\\IdeaProjects\\JavaAdvance\\src\\streamsFilesAndDirectoriesExercises\\Resource\\picture.png";
    private static final String PICTURE_COPY_PATH = "C:\\Users\\scp\\IdeaProjects\\JavaAdvance\\src\\streamsFilesAndDirectoriesExercises\\Resource\\picture-copy.png";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(PICTURE_PATH);
             FileOutputStream fos = new FileOutputStream(PICTURE_COPY_PATH)) {
            int oneByte = fis.read();
            while (oneByte != -1) {
                fos.write(oneByte);
                oneByte = fis.read();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}