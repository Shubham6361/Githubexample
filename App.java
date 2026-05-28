import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class App{
public static void main(String [] args) throws Exception{
JFrame frame = new JFrame();
frame. setSize(500,500);
frame. setVisible(true);

GridBagLayout gridBagLayout= new GridBagLayout();
frame.setLayout (gridBagLayout);
JLabel namLabel = new JLabel("Name");
JTextField nameTextField= new JTextField(20);
JLabel rollLabel = new JLabel("Roll no");
JTextField rollTextField= new JTextField(20);



GridBagConstraints gridBagConstraints = new GridBagConstraints();
gridBagConstraints . gridx =0;
gridBagConstraints. gridy=0;

frame.add (namLabel,gridBagConstraints);

gridBagConstraints . gridx =1;
gridBagConstraints. gridy=0;
frame.add (nameTextField,gridBagConstraints);

gridBagConstraints . gridx =0;
gridBagConstraints. gridy=1;
frame.add (rollLabel,gridBagConstraints);

gridBagConstraints . gridx =1;
gridBagConstraints. gridy=1;
frame.add (rollTextField,gridBagConstraints);



}


    
}
