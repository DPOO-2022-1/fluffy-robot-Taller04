package uniandes.dpoo.taller4.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;




public class Aplicacion extends JFrame {
	
	
	
	public Aplicacion() {
		
	setTitle( "Lamparitas" );
	setSize( 600, 700 );
	setResizable( false );
	
	
	setLayout( new BorderLayout( ) );
	
	// PANEL NORTE
	JPanel panel_norte = new JPanel();
	JLabel label_tamano = new JLabel("Tamano:");
	JLabel label_difi = new JLabel("Dificultad:");
	String[] opciones =  {"1X1","2X2","3X3","4X4","5X5"};
	JComboBox<String> combo1 = new JComboBox<>(opciones);
	JRadioButton rFacil = new JRadioButton("Facil");
	JRadioButton rMedio = new JRadioButton("Medio");
	JRadioButton rDifi = new JRadioButton("Dificil");
    ButtonGroup bg = new ButtonGroup();
    

    combo1.setBounds(10,10,80,20);
    rFacil.setBounds(10,10,80,20);
    rMedio.setBounds(10,10,80,20);
    rDifi.setBounds(10,10,80,20);
    bg.add(rDifi);bg.add(rMedio);bg.add(rFacil);
    
    
	add(panel_norte, BorderLayout.NORTH);
	panel_norte.add(label_tamano);
	panel_norte.add(combo1);
	panel_norte.add(label_difi);
	panel_norte.add(rFacil);
	panel_norte.add(rMedio);
	panel_norte.add(rDifi);
	setDefaultCloseOperation( EXIT_ON_CLOSE );
	setVisible(true);
	
	
	
	// PANEL SUR
	JPanel panel_sur = new JPanel();
	add(panel_sur, BorderLayout.SOUTH);
	JLabel label_jugadas = new JLabel("Jugadas:");
	JLabel label_njugadas = new JLabel("0");
	JLabel label_name = new JLabel("Nombre:");
	JLabel label_nametxt = new JLabel("UWU");
	panel_sur.add(label_jugadas);
	panel_sur.add(label_njugadas);
	panel_sur.add(label_name);
	panel_sur.add(label_nametxt);
	
	
	
	
	
	// PANEL DERECHO
	JPanel panel_der = new JPanel();
	
	panel_der.setLayout(new GridLayout(4,1));
	
	add(panel_der, BorderLayout.EAST);
	JButton boton_1 = new JButton("NUEVO");
	JButton boton_2 = new JButton("REINICIAR");
	JButton boton_3 = new JButton("TOP-10");
	JButton boton_4 = new JButton("CAMBIAR JUGADOR");
	panel_der.add(boton_1);
	panel_der.add(boton_2);
	panel_der.add(boton_3);
	panel_der.add(boton_4);
	
	
	
	
	// PANEL CENTRAL
		JPanel panel_center = new JPanel();
		
		panel_center.setLayout(new GridLayout(5,5));
		
		add(panel_center, BorderLayout.CENTER);
		
		
	
		
		for( int i = 1; i <= 25; i++) {
			ImageIcon icon = new ImageIcon("luz.jpg");
			JButton boton_luz = new JButton();
			boton_luz.setIcon(icon);
			
			
			
				
			boton_luz.setBackground(Color.YELLOW);
			
			
			panel_center.add(boton_luz);
		}
	
	
	
	
	
	}
	
	public static void main(String[] args) {
		
		Aplicacion app = new Aplicacion();
		
	} 	 

	

}
