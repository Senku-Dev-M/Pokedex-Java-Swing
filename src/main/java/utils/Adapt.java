package utils;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Class where there are methods to modify elements of the User interface.
 */
public class Adapt extends javax.swing.JFrame {

  /**
   * Add and rescale the image to the size of the label.
   */
  public void setImageLabel(JLabel labelName, String root) {
    ImageIcon image = new ImageIcon(root);
    Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),
            Image.SCALE_AREA_AVERAGING)
    );
    labelName.setIcon(icon);
    this.repaint();
  }

  /**
   * Add and rescale the image to 60x60 size by centering it.
   */
  public void setImageLabelSideBar(JLabel labelName, String root, boolean background) {
    ImageIcon image = new ImageIcon(root);
    Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(60, 60,
            Image.SCALE_AREA_AVERAGING)
    );
    labelName.setIcon(icon);
    labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    if (background) {
      labelName.setForeground(new java.awt.Color(255, 255, 255, 255));
      labelName.setBackground(new java.awt.Color(255, 255, 255, 255));
      labelName.setOpaque(true);
    }
    this.repaint();
  }

  /**
   * Add placeholder.
   */
  public void addPlaceholderStyle(JTextField textField) {
    Font font = textField.getFont();
    font = font.deriveFont(Font.ITALIC);
    textField.setFont(font);
    textField.setForeground(Color.gray);
  }

  /**
   * Remove placeholder.
   */
  public void removePlaceholderStyle(JTextField textField) {
    Font font = textField.getFont();
    font = font.deriveFont(Font.PLAIN);
    textField.setFont(font);
    textField.setForeground(Color.BLACK);
  }

  /**
   * Add the event locus gained.
   */
  public void focusGained(JTextField textField, String text, boolean passwordType) {
    if (passwordType) {
      JPasswordField textPassword = (JPasswordField) textField;
      if (textField.getText().equals(text)) {
        textPassword.setText("");
        textPassword.requestFocus();
        textPassword.setEchoChar('*');
        this.removePlaceholderStyle(textPassword);
      }
    } else {
      if (textField.getText().equals(text)) {
        textField.setText(null);
        textField.requestFocus();
        this.removePlaceholderStyle(textField);
      }
    }
  }

  /**
   * Add the event locus lost.
   */
  public void focusLost(JTextField textField, String text, boolean passwordType) {
    if (passwordType) {
      JPasswordField textPassword = (JPasswordField) textField;
      if (textField.getText().length() == 0) {
        this.addPlaceholderStyle(textPassword);
        textPassword.setEchoChar('\u0000');
        textPassword.setText(text);
      }
    } else {
      if (textField.getText().length() == 0) {
        this.addPlaceholderStyle(textField);
        textField.setText(text);
      }
    }
  }
}