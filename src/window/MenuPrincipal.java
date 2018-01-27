package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import operations.Firewall;
import operations.Network;

public class MenuPrincipal {

	public JFrame frame = new JFrame();
	public JButton btnDesabilitarFirewall = new JButton("Desabilitar Firewall");
	public JButton btnHabilitarFirewall = new JButton("Habilitar Firewall");
	public JButton btnReiniciarRede = new JButton("Reiniciar rede");

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// MenuPrincipal window = new MenuPrincipal();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setBounds(100, 100, 248, 276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnDesabilitarFirewall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firewall.desativaFirewall();
			}
		});

		btnDesabilitarFirewall.setBounds(36, 90, 160, 44);
		frame.getContentPane().add(btnDesabilitarFirewall);

		btnHabilitarFirewall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Firewall.ativaFirewall();
			}
		});

		btnHabilitarFirewall.setBounds(36, 35, 160, 44);
		frame.getContentPane().add(btnHabilitarFirewall);

		btnReiniciarRede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Network.reiniciaRede();
			}
		});

		btnReiniciarRede.setBounds(36, 146, 160, 44);
		frame.getContentPane().add(btnReiniciarRede);
	}
}
