/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPER;

import MODEL.NGUOIDUNG;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
/**
 *
 * @author PC
 */
public class XImage {
        public static Image getAppIcon(){
    URL url = XImage.class.getResource("/HINH/2.png");
    return new ImageIcon(url).getImage();
    }
    public static void save (File src) {
        File dst = new File("logos", src.getName()); // dst = destination
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }

        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    
    static public ImageIcon readAndResize(JComponent container, String fileName) throws IOException {
        BufferedImage image = ImageIO.read(new File("logos", fileName));
        return new ImageIcon(image.getScaledInstance(container.getWidth(),
                container.getHeight(), BufferedImage.SCALE_SMOOTH));
    }

    public static ImageIcon resize(JComponent container, String path) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        return new ImageIcon(image.getScaledInstance(container.getWidth(),
                container.getHeight(), BufferedImage.SCALE_SMOOTH));
    }

    public static void setDefaultImage(JLabel container) throws IOException {
        container.setIcon(XImage.readAndResize(container, ""));
    }
    
    public static String getFileName(JLabel label) {
        String labelToolTipText = label.getToolTipText();
        return labelToolTipText.substring(labelToolTipText.lastIndexOf("/") + 1);
    }
    
    public static NGUOIDUNG USER = null;
    public static void logoff() {
        XImage.USER = null;
    }
}
