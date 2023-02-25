
/* 
  @author "Jahnreil J. Amarillento"
  CS128-8L : FOPI01
  Activity name:
  Date:
*/

package MyApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SpaceX_Starlink_Project extends JFrame {
    JLabel satIDLbl, satNameLbl, longLbl, latLbl, elevLbl, hStatLbl;
    JTextField satIDTF, satNameTF, longTF, latTF, elevTF;
    JPanel mainPanel, topPortion, centerButtons, botPortion, spacer;
    JTextArea textArea;
    JButton findSat, save, update, del, clrAll;
    JComboBox hStatComBox;

    public SpaceX_Starlink_Project() {
        super("SpaceX Starlink Project");
                       
        // Label Constructors ------------------
        satIDLbl    = new JLabel("Satellite ID", JLabel.LEFT);
        satNameLbl  = new JLabel("Satellite Name", JLabel.LEFT);
        longLbl     = new JLabel("Longitude", JLabel.LEFT);    
        latLbl      = new JLabel("Latitude", JLabel.CENTER);
        hStatLbl    = new JLabel("Health Status", JLabel.CENTER);
        elevLbl     = new JLabel("Elevation", JLabel.LEFT);
        
        // Font Colors ------------------
        satIDLbl.setForeground(new Color(117,159,237));
        satNameLbl.setForeground(new Color(117,159,237));
        longLbl.setForeground(new Color(117,159,237));
        latLbl.setForeground(new Color(117,159,237));
        hStatLbl.setForeground(new Color(117,159,237));
        elevLbl.setForeground(new Color(117,159,237));
        
        // Label Sizes ------------------
        satIDLbl.setPreferredSize(new Dimension (90,10));
        satNameLbl.setPreferredSize(new Dimension (90,10));
        longLbl.setPreferredSize(new Dimension(90, 15));
        latLbl.setPreferredSize(new Dimension (85, 10));
        elevLbl.setPreferredSize(new Dimension(90, 10));
        hStatLbl.setPreferredSize(new Dimension (85, 10));
        
        // Button constructors ------------------
        findSat     = new JButton("Find Satellite");
        save        = new JButton("Save");
        update      = new JButton("Update");
        del         = new JButton("Delete");
        clrAll      = new JButton("ClearAll");
        
        // Button Sizes ------------------
        findSat.setPreferredSize(new Dimension(215, 18));
        save.setPreferredSize(new Dimension(159, 18));
        update.setPreferredSize(new Dimension(159, 18));
        del.setPreferredSize(new Dimension(159, 18));
        clrAll.setPreferredSize(new Dimension(159, 18));
       
        // Button Background Colors ------------------
        findSat.setBackground(new Color(210,210,210));
        save.setBackground(new Color(210,210,210));
        update.setBackground(new Color(210,210,210));
        del.setBackground(new Color(210,210,210));
        clrAll.setBackground(new Color(210,210,210));
        
        // TextFied Constructors ------------------
        satIDTF     = new JTextField(15);
        satNameTF   = new JTextField(35);
        longTF      = new JTextField(15);
        latTF       = new JTextField(11);
        elevTF      = new JTextField(15);
        
        // ComboBox Constructor ------------------
        hStatComBox = new JComboBox();
        hStatComBox.setPreferredSize(new Dimension (125, 20));
        hStatComBox.setBackground(new Color(212,212,212));
        
        // TextArea Constructor ------------------
        textArea    = new JTextArea(10,44);
        textArea.setBackground(Color.GRAY);
        textArea.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        
        // Panels ------------------
        mainPanel   = new JPanel();;
        mainPanel.setBackground(new Color(215,215,215));
        spacer      = new JPanel();
        spacer.setBackground(new Color(215,215,215));
        spacer.setPreferredSize(new Dimension(500, 4));
        
        topPortion = new JPanel();
        topPortion.setPreferredSize(new Dimension(500, 112));
        topPortion.setBackground(new Color(215,215,215));
        topPortion.add(satIDLbl);   topPortion.add(satIDTF);   topPortion.add(findSat);
        topPortion.add(satNameLbl); topPortion.add(satNameTF);
        topPortion.add(longLbl); topPortion.add(longTF); topPortion.add(latLbl);   topPortion.add(latTF);
        topPortion.add(elevLbl); topPortion.add(elevTF); topPortion.add(hStatLbl); topPortion.add(hStatComBox);
        
        centerButtons = new JPanel(new GridLayout(1,3, 4, 4));
        centerButtons.setBackground(new Color(215,215,215));
        centerButtons.add(save); centerButtons.add(update); centerButtons.add(del);
        
        botPortion = new JPanel();
        botPortion.setBackground(new Color(215,215,215));
        botPortion.setPreferredSize(new Dimension(500, 100));
        botPortion.add(clrAll, BorderLayout.CENTER);
        
        mainPanel.setBorder(BorderFactory.createLineBorder(new Color(117,159,237)));
        mainPanel.add(topPortion);
        mainPanel.add(centerButtons, BorderLayout.CENTER);
        mainPanel.add(spacer);
        mainPanel.add(textArea);
        mainPanel.add(botPortion, BorderLayout.CENTER);
        
        add(mainPanel);
       
        
        setSize(520,400);
        setVisible(true);   
        setResizable(false);
    }
        
    
    public static void main(String[] args) {
        new SpaceX_Starlink_Project();
        System.out.println("Frame successfully created");
    }
}
