package chapter_01.L06_interface

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JOptionPane
import java.awt.event.ActionEvent
import java.awt.event.ActionListener


public class ImplInterface{

    public static void main(String[] args) {
        JFrame frame = new JFrame()
        frame.setSize(500, 600)
        JButton jButton = new JButton()
        jButton.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame, "你点击了一下")
            }
        })
        jButton.setSize(20, 40)
        jButton.setLocation(250, 300)
        frame.add(jButton)
        frame.setVisible(true)
    }
}

