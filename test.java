package Project;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Dictionary;

public class test {
    private File directory = new File("");
    public static void main(String[] args) {
        File directory = new File("");
//        JFrame frame = new JFrame();
//        frame.setSize(1000,1000);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        JButton botton = new JButton();
//        frame.add(botton);
//        botton.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JOptionPane.showMessageDialog(null, "错误信息提示", "标题", JOptionPane.INFORMATION_MESSAGE);

        String path = "";
        try {
            path = directory.getCanonicalPath();
            path = path.replaceAll("\\\\","\\\\\\\\");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println(path);

    }
}
