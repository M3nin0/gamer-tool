package operations;

import javax.swing.JOptionPane;

public class Firewall {
	public static void desativaFirewall() {
		// netsh advfirewall set allprofiles state off
		
		try {
			Process p = Runtime.getRuntime().exec("netsh advfirewall set allprofiles state off");
			p.waitFor();

			JOptionPane.showMessageDialog(null, "Firewall desativado com sucesso!");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void ativaFirewall() {
		// netsh advfirewall set allprofiles state on

		try {
			Process p = Runtime.getRuntime().exec("netsh advfirewall set allprofiles state on");
			p.waitFor();

			JOptionPane.showMessageDialog(null, "Firewall ativo com sucesso!");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
