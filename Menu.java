import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Menu {
    public void menu() {
        Utils u = new Utils();
        Queue<ObjPc> pcs = new LinkedList<>();
        Queue<ObjTablet> tablets = new LinkedList<>();
        boolean bandera = true;

        while (bandera) {

            int opt = Integer.parseInt(JOptionPane.showInputDialog("1. Pcs \n 2. Tablets \n 3. Mostrar existencias"));

            switch (opt) {
                case 1:
                    if (pcs.isEmpty()) {
                        pcs = u.LlenarPcs(pcs);
                    }
                    boolean bandera2 = true;
                    while (bandera2) {

                        String opt2 = JOptionPane.showInputDialog("Agregar,Prestar, devolver o salir");

                        if (opt2.equalsIgnoreCase("agregar")) {
                            pcs = u.LlenarPcs(pcs);
                        }
                        if (opt2.equalsIgnoreCase("Prestar")) {
                            u.prestarPCs(pcs);
                        }

                        if (opt2.equalsIgnoreCase("devolver")) {
                            u.devolverPCs(pcs);
                        }
                        if (opt2.equalsIgnoreCase("salir")) {
                            bandera2 = false;
                        }
                    }
                    break;

                case 2:
                    if (tablets.isEmpty()) {
                        tablets = u.LlenarTablets(tablets);
                    }
                    boolean bandera3 = true;
                    while (bandera3) {

                        String opt2 = JOptionPane.showInputDialog("Agregar,Prestar, devolver o salir");

                        if (opt2.equalsIgnoreCase("agregar")) {
                            tablets = u.LlenarTablets(tablets);
                        }
                        if (opt2.equalsIgnoreCase("Prestar")) {
                            u.prestarTablets(tablets);
                        }

                        if (opt2.equalsIgnoreCase("devolver")) {
                            u.devolverTablets(tablets);
                        }
                        if (opt2.equalsIgnoreCase("salir")) {
                            bandera3 = false;
                        }
                    }
                    break;

                case 3:
                    u.MostarExistencias(pcs,tablets);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Salio del programa", "salio", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }
}
