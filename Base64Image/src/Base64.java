import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Base64 {

    public static String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }

    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

   /* public static void main(String args[]){
        //Decoding:
        String S1 = "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";
        BufferedImage bi = decodeToImage(S1);
        File outputfile = new File("C:\\Users\\M7md\\Desktop\\decodedImage.jpg");
        try {
            ImageIO.write(bi, "png", outputfile);
            System.out.println("Decoding Succeeded, the decoded image was saved on your computer\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Encoding the same decoded image:
        String S2 = encodeToString(bi,"png");
        System.out.println(S2 + "\n\n Encoding Succeeded! The string above is base64 representation of the image");

    }*/
}