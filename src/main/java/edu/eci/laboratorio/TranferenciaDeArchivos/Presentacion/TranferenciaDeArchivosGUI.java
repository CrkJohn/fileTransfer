package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion.*;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.ServicesIdeas;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.ServicesIdeasFactory;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;

public class TranferenciaDeArchivosGUI extends JFrame{
	public static final Dimension sreenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension sreenMinimo = new Dimension(744, 400);
	private CardLayout layout;
	private JPanel menu;
	private JPanel principal;
	private InicialPanel  panelInicial;
        private EnviarPanel enviarPanel;
		private RecibirPanel recibirPanel;
		private BorrarPanel borrarPanel;
	private InicialPanel panelTranferencia;
        private final ServicesIdeasFactory servicesFactory = ServicesIdeasFactory.getInstance();
        public ServicesIdeas ideasServices;
	
	
	private TranferenciaDeArchivosGUI() throws TransferenciaDeArhivosException, SQLException {                
                ideasServices = servicesFactory.getIdeasServices();
                prepareElementos();
		prepareAcciones();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                setVisible(true);
	}
	
	
	private void prepareElementos() throws TransferenciaDeArhivosException, SQLException {
		setTitle("Tranferencia de archivos");
		layout = new CardLayout();
		this.getContentPane().setLayout(new CardLayout());		
		principal = new JPanel(layout);               
		setLocationRelativeTo(null);
		add(principal);
		panelTranferencia =  new InicialPanel(this);	
               recibirPanel = new RecibirPanel(this);
				enviarPanel = new EnviarPanel(this);
				borrarPanel = new BorrarPanel(this);                
		principal.add(panelTranferencia,"Principal");	                
		principal.add(enviarPanel,"Enviar");	
		principal.add(recibirPanel,"Recibir");	
		principal.add(borrarPanel,"Borrar");
		centro();
		setResizable(false);
		IniciarTA();
		setFocusable(false);
                setIconImage(new ImageIcon("\\Imagenes\\icon.png").getImage());	
	}
	
	private void centro() {
		int xEsquina = 1000, yEsquina = 500;
		setSize(xEsquina, yEsquina);
		setLocationRelativeTo(null);
	}
	
	private void IniciarTA() throws TransferenciaDeArhivosException {
		irPanel("Principal");
	}

	public void irPanel(String src) throws TransferenciaDeArhivosException {
		layout.show(principal,src);
	}

	private void prepareAcciones() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				salir();
			}
		});
	}

	public void salir() {
		if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Salir",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			setVisible(false);
			System.exit(0);
 
		}
	}
 	
	public static void main(String[] args) throws TransferenciaDeArhivosException, IOException, SQLException {
                TranferenciaDeArchivosGUI tfGUI = new TranferenciaDeArchivosGUI();		
	}
 
}
