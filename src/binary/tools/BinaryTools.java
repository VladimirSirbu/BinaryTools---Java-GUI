
package binary.tools;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BinaryTools {
    public static void main(String[] args) {
        LoadForm loadForm = new LoadForm(); 
        dashboard dashForm = new dashboard();
        loadForm.setVisible(true);
        loadForm.setOpacity((float)0.8);
        dashForm.setOpacity((float)0.9);
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(75);
                loadForm.jLabel_num.setText(Integer.toString(i) + "%");
                loadForm.jProgressBar.setValue(i);
                
                switch(i){
                    case 10: Thread.sleep(1000); break;
                    case 42: Thread.sleep(1000); break;
                    case 99: Thread.sleep(2000); break;
                    case 100: Thread.sleep(2000); 
                              loadForm.setVisible(false);
                              dashForm.setVisible(true);
                    break;
                }        
            }
        }catch(Exception e){
            JPanel errorPanel = new JPanel();
            JOptionPane.showMessageDialog(errorPanel,"Something went wrong. Keep trying!\n" + "\nType error is: " + e,"Error",JOptionPane.ERROR_MESSAGE);
        } 
    }   
}
