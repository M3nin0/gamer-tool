package operations;

import javax.swing.JOptionPane;

public class Network {
	public static void reiniciaRede() {
		try {
			
			Process j = Runtime.getRuntime().exec("netsh int ip reset");
			j.waitFor();

			
			Process p = Runtime.getRuntime().exec("ipconfig /renew /release");
			p.waitFor();
			
			
			JOptionPane.showMessageDialog(null, "A rede foi reiniciada");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
