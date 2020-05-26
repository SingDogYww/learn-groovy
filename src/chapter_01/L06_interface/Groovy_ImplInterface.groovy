package chapter_01.L06_interface

import javax.swing.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

JFrame frame = new JFrame()
frame.setSize(500, 600)
JButton jButton = new JButton()
jButton.addActionListener(
        { JOptionPane.showMessageDialog(frame, "你点了一下") } as ActionListener
)
jButton.setSize(20, 40)
jButton.setLocation(250, 300)
frame.add(jButton)
frame.setVisible(true)

