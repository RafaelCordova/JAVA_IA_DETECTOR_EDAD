import java.io.File;
import net.sourceforge.tess4j.*;

public class ImageCracker {

    public static String crackImage(String filePath) {

        File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();

        try {
            System.out.println("====DESENCRIPTANDO PIXELES DE LA FOTO====");
            System.out.println("\nMOSTRANDO EDAD EN VENTANA");
            String result = instance.doOCR(imageFile);

            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}