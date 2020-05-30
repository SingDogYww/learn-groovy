package chapter_01.L06_interface

import javax.swing.*
import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.ComponentListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener
import java.awt.event.WindowListener


frame = new JFrame(size: [300, 300],
        layout: new FlowLayout(),
        defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE)
button = new JButton("点我")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add(button)
frame.contentPane.add(positionLabel)
frame.contentPane.add(msgLabel)

button.addActionListener(
        { JOptionPane.showMessageDialog(frame, "你点了一下") } as ActionListener
)

displayMouseLocation = { positionLabel.setText("$it.x, $it.y") }
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

handleFocus = [
        focusGained: { msgLabel.setText("nice to meet you") },
        focusLost   : { msgLabel.setText("nice ot meet you, too") }
]

button.addFocusListener(handleFocus as FocusListener)
events = ['WindowListener', 'ComponentListener']

handler = {msgLabel.setText("$it")}

for (event in events){
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}"(handlerImpl)
}

frame.setVisible(true)





