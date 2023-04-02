import javax.swing.*;

public class Driver {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String edad = ImageCracker.crackImage("image.png");
        System.out.println("TEXTO IMAGEN :"+edad);
        JOptionPane.showMessageDialog(null, "SE DETECTA :"+edad);

                                        }
                }