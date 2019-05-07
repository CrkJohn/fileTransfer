package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author John David Ibanez
 * 
 */
public class EnviarPanel extends javax.swing.JPanel {

    JFileChooser chooser;
    String choosertitle;

    private TranferenciaDeArchivosGUI frame;
    private String urlCarpeta,urlArchivo;

    public EnviarPanel(TranferenciaDeArchivosGUI frame) {
        this.frame = frame;
        initComponents();
        prepararActiones();
        prepareElementos();
        urlArchivo="";
        urlCarpeta="";
        this.frame.setSize(800, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        escogerCarpeta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Enviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio.jpg"))); // NOI18N

        escogerCarpeta.setText("Escoger Carpeta");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEci.gif"))); // NOI18N

        Enviar.setText("Enviar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Envio de archivos");

        regresar.setText("Regresar");

        jLabel2.setText("El archivo que desea mandar o los archivos que desea mandar deben estar ");

        jLabel3.setText("contenidos en una carpeta, esta será la carpeta que enviaremos a los computadores ");

        jLabel6.setText("escogidos por el salón de su eleccion. ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Ingeniería de sistemas - Laboratorio de sistemas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(escogerCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Enviar)))
                                .addGap(24, 24, 24)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(jLabel4)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(167, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escogerCarpeta))
                .addGap(18, 18, 18)
                .addComponent(Enviar)
                .addGap(62, 62, 62)
                .addComponent(regresar)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JButton escogerCarpeta;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    private void prepararActiones() {
     
        ActionListener escogerCarpetaAccion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                escogerCarpetaAccionMe();
            }
        };
        escogerCarpeta.addActionListener(escogerCarpetaAccion);        
        ActionListener EnviarAccion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    EnviarAccionMe();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Enviar.addActionListener(EnviarAccion);
        ActionListener volver = new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                   regresarMetodo();
            }
        };
        regresar.addActionListener(volver);        
    }
    
    private void regresarMetodo() {
        try {
            frame.irPanel("Principal");
        } catch (TransferenciaDeArhivosException ex) {
            Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    public void escogerCarpetaAccionMe(){
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);        
        chooser.setAcceptAllFileFilterUsed(false);
        urlCarpeta = "";
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            urlCarpeta = chooser.getSelectedFile().toString();
            urlArchivo="";           
        } else {
            JOptionPane.showMessageDialog(null,"No escogio ninguna carpeta","Advertencia",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void prepareElementos() {
        try {
            ArrayList<Salon> laboratorios = frame.ideasServices.getSalones();            
            for(Iterator<Salon> iterator = laboratorios.iterator(); iterator.hasNext();) {
                Salon next = iterator.next();
                jComboBox2.addItem(next.getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void EnviarAccionMe() throws FileNotFoundException, UnsupportedEncodingException, SQLException {
            if(urlArchivo.equals("") && urlCarpeta.equals("") ){          
             JOptionPane.showMessageDialog(null,"No a escogido ni archivo ni carpeta a enviar","ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
  
            }else if(urlArchivo.equals("")){
//                System.out.println("Entreamos");
                String salon = jComboBox2.getSelectedItem().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                Date now = new Date();
                String strDate = sdf.format(now);                
//                System.out.println(strDate);
                strDate = strDate.replaceAll("-","");              
                strDate = strDate.replaceAll(".","");  
                strDate = strDate.replaceAll(" ","");              
                strDate = strDate.replaceAll(":","");
//                System.out.println(strDate);
                String url = "src\\main\\java\\edu\\eci\\laboratorio\\TranferenciaDeArchivos\\images\\"+strDate+".bat";
                PrintWriter writer = new PrintWriter(url, "UTF-8"); 
		writer.println("@echo off");
                Salon salones = frame.ideasServices.getSalonNombre(salon);		
                String []chars = urlCarpeta.split("\\\\");             
                String nombreCarpeta = chars[chars.length-1].replace(" ","");
                System.out.println(nombreCarpeta);
                for(Computador c : salones.getPcs()){
                        String tmp;
                        if(c.getId()<10){
                            tmp = String.format("echo D|xcopy /s /b "+'"'+"%s"+'"'+" \\\\Sistemas0%d\\Sistemas\\Temp\\%s /Y",urlCarpeta,c.getId(),nombreCarpeta);                          
                        }else{
                            tmp = String.format("echo D|xcopy  /s /b "+'"'+"%s"+'"'+" \\\\%s\\Sistemas\\Temp\\%s /Y ",urlCarpeta,c.getNombre(),nombreCarpeta);                           
                        }
                        writer.println(tmp);	
                }
                writer.println("exit 0");
                writer.close();
                try {
                   Runtime.getRuntime().exec("cmd /c start "+url+ " ");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null,"problemas al transferir el archivo","ERROR",JOptionPane.ERROR_MESSAGE);   
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
//                System.out.println("Entre");
            }
      }
  
}
