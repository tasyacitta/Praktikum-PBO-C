import balok.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
       new GUI();
    }
}

class GUI extends JFrame implements ActionListener{
    JLabel ljudul = new JLabel("KALKULATOR BALOK");  
    
    JLabel lpanjang = new JLabel("Panjang");
    final JTextField fpanjang = new JTextField();
    
    JLabel llebar = new JLabel("Lebar");
    final JTextField flebar = new JTextField();
    
    JLabel ltinggi = new JLabel("Tinggi");
    final JTextField ftinggi = new JTextField();
    
    JLabel lhasil = new JLabel("");  
    
    JLabel lluas = new JLabel("");  
    JLabel fluas = new JLabel("");   
    
    JLabel lkeliling = new JLabel("");  
    JLabel fkeliling = new JLabel("");
    
    JLabel lvolume = new JLabel("");  
    JLabel fvolume = new JLabel("");
    
    JLabel lpermukaan = new JLabel("");  
    JLabel fpermukaan = new JLabel("");

    
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");
    
    ButtonGroup group = new ButtonGroup();
    public GUI() {
        setTitle("Kalkulator Balok");
        setSize(350, 300);
                
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        
        add(lluas);
        add(fluas);
        add(lkeliling);
        add(fkeliling);
        add(lvolume);
        add(fvolume);
        add(lpermukaan);
        add(fpermukaan);
        add(lhasil);
        add(bhitung);
        add(breset);
        
        ljudul.setBounds(130,10,150,20);
        lpanjang.setBounds(50,50,150,20);
        fpanjang.setBounds(150,50,190,20);
        llebar.setBounds(50,70,120,20);
        flebar.setBounds(150,70,190,20);
        ltinggi.setBounds(50,90,120,20);
        ftinggi.setBounds(150,90,190,20);  
        
        lhasil.setBounds(150,120,120,20);
        lluas.setBounds(50,150,120,20);
        fluas.setBounds(200,150,190,20); 
        lkeliling.setBounds(50,170,120,20);
        fkeliling.setBounds(200,170,190,20);
        lvolume.setBounds(50,190,120,20);
        fvolume.setBounds(200,190,190,20);
        lpermukaan.setBounds(50,210,120,20);
        fpermukaan.setBounds(200,210,190,20);
        
        
        bhitung.setBounds(130,300,75,20);
        breset.setBounds(220,300,75,20);
        
        setSize(420,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        fpanjang.addActionListener(this);
        flebar.addActionListener(this);
        ftinggi.addActionListener(this);
        bhitung.addActionListener(this);
        breset.addActionListener(this);
        
    }
    

    
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            if(e.getSource() == bhitung)
            { 
                try{
               
               double panjang = Double.parseDouble(fpanjang.getText().trim());
               double lebar = Double.parseDouble(flebar.getText().trim());
               double tinggi = Double.parseDouble(ftinggi.getText().trim());
               Balok balok= new Balok(panjang,lebar,tinggi);
               lhasil.setText("Hasil:");
               lluas.setText("Luas Persegi        :");
               fluas.setText(""+balok.Luas());
               lkeliling.setText("Keliling Persegi    :");
               fkeliling.setText(""+balok.Keliling());
               lvolume.setText("Volume Balok       :");
               fvolume.setText(""+balok.Volume());
               lpermukaan.setText("Luas Permukaan :");
               fpermukaan.setText(""+balok.Luas(tinggi));
               
            }            
                catch(Exception error){
                    String message = error.getMessage();
                    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            if(e.getSource() == breset)
            {
                fpanjang.setText("");
                flebar.setText("");
                ftinggi.setText("");
                lhasil.setText("");
                lluas.setText("");
                fluas.setText("");
                lkeliling.setText("");
                fkeliling.setText("");
                lvolume.setText("");
                fvolume.setText("");
                lpermukaan.setText("");
                fpermukaan.setText("");
                
            }
       
        }
}

