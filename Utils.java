import java.util.Queue;

import javax.swing.JOptionPane;

public class Utils {
    public Queue<ObjPc> LlenarPcs(Queue<ObjPc> cola) {
        boolean bandera = true;
        JOptionPane.showMessageDialog(null, "Digite el/los nuevos equipos", "Inicio de ingresos",
                JOptionPane.PLAIN_MESSAGE);
        while (bandera) {
            try {
                ObjPc o = new ObjPc();
                o.setSerial(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el serial")));
                o.setMarca(JOptionPane.showInputDialog("Ingrese la marca del dispositivo"));
                o.setRam(Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de ram del equipo")));
                o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del dispositivo")));
                o.setNombreEstudiante("nadie");
                o.setDiscoDuro(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento")));
                o.setDisponible(true);
                cola.add(o);
                int dec = JOptionPane.showConfirmDialog(null, "desea agregar otro dispositivo", "continue",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (dec == JOptionPane.YES_OPTION) {
                    bandera = true;
                } else if (dec == JOptionPane.NO_OPTION || dec == JOptionPane.CLOSED_OPTION) {
                    bandera = false;
                }
            }

            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para los campos requeridos.",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        return cola;
    }

    public void prestarPCs(Queue<ObjPc> cola) {
        try {
            String SearchMarca = JOptionPane.showInputDialog("ingrese la marca que desee");
            int SearchDiscoDuro = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento que desee"));
            int SearchRam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ram que desee"));
            boolean Encontrado = false;

            for (ObjPc o : cola) {
                if (o.getMarca().equalsIgnoreCase(SearchMarca) && o.getDiscoDuro() == SearchDiscoDuro
                        && o.getRam() == SearchRam && o.isDisponible()) {
                    o.setNombreEstudiante(
                            JOptionPane.showInputDialog("Ingrese el nombre del estudiante al que se va a prestar"));
                    o.setCarnet(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carnet del estudiante")));
                    o.setDisponible(false);
                    JOptionPane.showMessageDialog(null, "Pc prestada con exito", "Exito",
                            JOptionPane.INFORMATION_MESSAGE);
                    Encontrado = true;
                    break;
                }
            }
            if (!Encontrado) {
                JOptionPane.showMessageDialog(null, "No hay existencias con esas especificaciones", "error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para almacenamiento o RAM.",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void devolverPCs(Queue<ObjPc> cola) {
        try {
            String searchNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            int searchCarnet = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carnet del estudiante"));
            boolean encontrado = false;

            for (ObjPc o : cola) {
                if (o.getNombreEstudiante().equalsIgnoreCase(searchNombre) && o.getCarnet() == searchCarnet) {
                    o.setCarnet(0);
                    o.setNombreEstudiante("");
                    o.setDisponible(true);
                    JOptionPane.showMessageDialog(null, "Se devolvio el pc", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "PC no encontrado con los datos del estudiante", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico para el carnet", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public Queue<ObjTablet> LlenarTablets(Queue<ObjTablet> cola) {
        boolean bandera = true;
        JOptionPane.showMessageDialog(null, "Digite el/los nuevos equipos", "Inicio de ingresos",
                JOptionPane.PLAIN_MESSAGE);

        while (bandera) {
            try {
                ObjTablet o = new ObjTablet();
                o.setSerial(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el serial")));
                o.setMarca(JOptionPane.showInputDialog("Ingrese la marca del dispositivo"));
                o.setTamaño(Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del dispositivo")));
                o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del dispositivo")));
                o.setNombreEstudiante("nadie");
                o.setDisponible(true);
                cola.add(o);
                int dec = JOptionPane.showConfirmDialog(null, "desea agregar otro dispositivo", "continue",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (dec == JOptionPane.YES_OPTION) {
                    bandera = true;
                } else if (dec == JOptionPane.NO_OPTION || dec == JOptionPane.CLOSED_OPTION) {
                    bandera = false;
                }
            }

            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para los campos requeridos.",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        return cola;
    }

    public void prestarTablets(Queue<ObjTablet> cola) {
        try {
            String searchMarca = JOptionPane.showInputDialog("ingrese la marca que desee");
            int searchTamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño que desea buscar"));
            boolean Encontrado = false;

            for (ObjTablet o : cola) {
                if (o.getMarca().equalsIgnoreCase(searchMarca) && o.getTamaño() == searchTamaño) {
                    o.setNombreEstudiante(
                            JOptionPane.showInputDialog("Ingrese el nombre del estudiante al que se va a prestar"));
                    o.setCarnet(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carnet del estudiante")));
                    o.setDisponible(false);
                    JOptionPane.showMessageDialog(null, "Pc prestada con exito", "Exito",
                            JOptionPane.INFORMATION_MESSAGE);
                    Encontrado = true;
                    break;
                }
            }
            if (!Encontrado) {
                JOptionPane.showMessageDialog(null, "No hay existencias con esas especificaciones", "error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el tamaño.",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void devolverTablets(Queue<ObjTablet> cola) {
        try {
            String searchNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            int searchCarnet = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carnet del estudiante"));
            boolean encontrado = false;

            for (ObjTablet o : cola) {
                if (o.getNombreEstudiante().equalsIgnoreCase(searchNombre) && o.getCarnet() == searchCarnet) {
                    o.setCarnet(0);
                    o.setNombreEstudiante("");
                    o.setDisponible(true);
                    JOptionPane.showMessageDialog(null, "Se devolvio la tablet", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Tablet no encontrado con los datos del estudiante", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico para el carnet", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostarExistencias (Queue<ObjPc> pcs, Queue<ObjTablet> tablets){
        System.out.println("pcs");
        for (ObjPc o : pcs) {
            System.out.println("SERIAL: " + o.getSerial());
            System.out.println("MARCA: " + o.getMarca());
            System.out.println("RAM: " + o.getRam());
            System.out.println("DISCO DURO" + o.getDiscoDuro() + "GB");
            System.out.println("PRECIO: " + o.getPrecio());
            System.out.println("NOMBRE ESTUDIANTE: " + o.getNombreEstudiante());
            System.out.println("CARNET: " + o.getCarnet());
            if(!o.isDisponible()){
                System.out.println("No disponible");
            }
            else{
                System.out.println("Disponible");
            }
            System.out.println();
        }
        System.out.println("//---------------------------------------------------");
        System.out.println("Tablets");
        for (ObjTablet o : tablets) {
            System.out.println("SERIAL: " + o.getSerial());
            System.out.println("MARCA: " + o.getMarca());
            System.out.println("TAMAÑO: " + o.getTamaño());
            System.out.println("PRECIO: " + o.getPrecio());
            System.out.println("NOMBRE ESTUDIANTE: " + o.getNombreEstudiante());
            System.out.println("CARNET: " + o.getCarnet());
            if(!o.isDisponible()){
                System.out.println("No disponible");
            }
            else{
                System.out.println("Disponible");
            }
            System.out.println();
        }
    }
}
