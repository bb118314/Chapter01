package DebuggingCh01;

import javax.swing.JOptionPane;

public class FixDebugOne4
{
  public static void main(String[] args)
  {
     JOptionPane.showMessageDialog(null, "First GUI program");
     // JOptionPane was spelt with a zero, and was not imported at all.
  }
}