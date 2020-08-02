import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	boolean estado=true;//si es true se puede escribir
	String siguienteJuego = "O";
	String turno = "X";
	JLabel lbs[] = new JLabel[9]; //para acceder mas facil a las variables
	int victoria[][] = {{1,2,3},
					    {4,5,6},
					    {7,8,9},
					    {1,4,7},
					    {2,5,8},
					    {3,6,9},
					    {1,5,9},
					    {3,5,7}
	};
	
	JLabel lbTurno = new JLabel("Turno de: "+turno);//creo label de a quien le toca
	JLabel lbPuntajeX = new JLabel("0");
	JLabel lbPuntajeO = new JLabel("0");

	public static void main(String[] args) {//Corre la aplicacion
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public vista() {//Se crea el Frame
		setTitle("TaTeTi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(44, 72, 176, 177);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				presionar(1);
			}
		});
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel1.setOpaque(true);
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setBounds(0, 0, 52, 52);
		panel_1.add(jLabel1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(2);
			}
		});
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel2.setOpaque(true);
		jLabel2.setBackground(Color.WHITE);
		jLabel2.setBounds(62, 0, 52, 52);
		panel_1.add(jLabel2);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(3);
			}
		});
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel3.setOpaque(true);
		jLabel3.setBackground(Color.WHITE);
		jLabel3.setBounds(124, 0, 52, 52);
		panel_1.add(jLabel3);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(4);
			}
		});
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel4.setOpaque(true);
		jLabel4.setBackground(Color.WHITE);
		jLabel4.setBounds(0, 63, 52, 52);
		panel_1.add(jLabel4);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(5);
			}
		});
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel5.setOpaque(true);
		jLabel5.setBackground(Color.WHITE);
		jLabel5.setBounds(62, 63, 52, 52);
		panel_1.add(jLabel5);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(6);
			}
		});
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel6.setOpaque(true);
		jLabel6.setBackground(Color.WHITE);
		jLabel6.setBounds(124, 63, 52, 52);
		panel_1.add(jLabel6);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(7);
			}
		});
		jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel7.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel7.setOpaque(true);
		jLabel7.setBackground(Color.WHITE);
		jLabel7.setBounds(0, 126, 52, 52);
		panel_1.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(8);
			}
		});
		jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel8.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel8.setOpaque(true);
		jLabel8.setBackground(Color.WHITE);
		jLabel8.setBounds(62, 126, 52, 52);
		panel_1.add(jLabel8);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(9);
			}
		});
		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel9.setFont(new Font("Tahoma", Font.BOLD, 36));
		jLabel9.setOpaque(true);
		jLabel9.setBackground(Color.WHITE);
		jLabel9.setBounds(124, 126, 52, 52);
		panel_1.add(jLabel9);
		setLocationRelativeTo(null);
		lbs[0]=jLabel1;
		lbs[1]=jLabel2;
		lbs[2]=jLabel3;
		lbs[3]=jLabel4;
		lbs[4]=jLabel5;
		lbs[5]=jLabel6;
		lbs[6]=jLabel7;
		lbs[7]=jLabel8;
		lbs[8]=jLabel9;
		
		lbTurno.setBounds(22, 25, 96, 14); //seteo ubicacion del label turno
		panel.add(lbTurno);// agrego el label turno al panel
		
		
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<lbs.length; i++) {
					lbs[i].setText("");
					lbs[i].setBackground(Color.WHITE);
				}
				
				turno=siguienteJuego;
				if(siguienteJuego.equals("O")) {
					siguienteJuego="X";
				}
				else {
					siguienteJuego= "O";
				}
				lbTurno.setText("Turno de: "+turno); 
				estado=true;
			}
		});
			
		btnReiniciar.setBounds(159, 21, 89, 23);
		panel.add(btnReiniciar);
		
		JLabel lblX = new JLabel("X=");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblX.setBounds(29, 272, 46, 14);
		panel.add(lblX);
		
		lbPuntajeX.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbPuntajeX.setBounds(72, 272, 46, 14);
		panel.add(lbPuntajeX);
		
		JLabel lblO = new JLabel("O=");
		lblO.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblO.setBounds(173, 272, 46, 14);
		panel.add(lblO);
		
		lbPuntajeO.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbPuntajeO.setBounds(214, 272, 46, 14);
		panel.add(lbPuntajeO);
			
	}
	public void presionar (int casilla) {
		if(lbs[casilla-1].getText().equals("") && estado) {
			lbs[casilla-1].setText(turno);
			cambiarTurno();
			comprobarGanador();
		}
		
	}
	
	public void cambiarTurno() {
		if(turno.equals("X")) {
			turno="O";
		}
		else {
			turno="X";
		}
		
		lbTurno.setText("Turno de "+turno);// cada vez que se cambie de turno tambien cambia el label y muestra a quien le toca
	}
	public void comprobarGanador() {
		for(int i=0; i<victoria.length; i++) {
			if(lbs[victoria[i][0]-1].getText().equals("X") &&
					lbs[victoria[i][1]-1].getText().equals("X") && 
							lbs[victoria[i][2]-1].getText().equals("X")){
								lbs[victoria[i][0]-1].setBackground(Color.GREEN);
								lbs[victoria[i][1]-1].setBackground(Color.GREEN);
								lbs[victoria[i][2]-1].setBackground(Color.GREEN);
								
								lbTurno.setText("Ha ganado X");
								lbPuntajeX.setText(Integer.toString(Integer.parseInt(lbPuntajeX.getText())+1));
								estado=false;
							}
			if(lbs[victoria[i][0]-1].getText().equals("O") &&
					lbs[victoria[i][1]-1].getText().equals("O") && 
						lbs[victoria[i][2]-1].getText().equals("O")){
								lbs[victoria[i][0]-1].setBackground(Color.GREEN);
								lbs[victoria[i][1]-1].setBackground(Color.GREEN);
								lbs[victoria[i][2]-1].setBackground(Color.GREEN);
								
								lbTurno.setText("Ha ganado O");
								lbPuntajeO.setText(Integer.toString(Integer.parseInt(lbPuntajeO.getText())+1));
								estado=false;
							}				
		}
	}
}
