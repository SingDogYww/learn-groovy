package chapter_01.L06_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author yangww
 * @date 2020/5/27
 *
 */
public class Java_ImplInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("点我");
        JLabel positionLabel = new JLabel("");
        JLabel msgLabel = new JLabel("");

        frame.getContentPane().add(button);
        frame.getContentPane().add(positionLabel);
        frame.getContentPane().add(msgLabel);

        button.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(frame, "你点了一下");
        });

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }
        });

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                positionLabel.setText(mouseEvent.getX() + ", " + mouseEvent.getY());
            }
        });

        button.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                msgLabel.setText("独自");
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                msgLabel.setText("滚犊子");
            }
        });


        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {
//                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
//                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {
                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {
                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {
                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {
//                msgLabel.setText(windowEvent.toString());
            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {
                msgLabel.setText(windowEvent.toString());
            }
        });

        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
//                msgLabel.setText(componentEvent.toString());
            }

            @Override
            public void componentMoved(ComponentEvent componentEvent) {
//                msgLabel.setText(componentEvent.toString());
            }

            @Override
            public void componentShown(ComponentEvent componentEvent) {
//                msgLabel.setText(componentEvent.toString());
            }

            @Override
            public void componentHidden(ComponentEvent componentEvent) {
//                msgLabel.setText(componentEvent.toString());
            }
        });

        frame.setVisible(true);
    }
}
