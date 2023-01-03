import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
        // Construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // Adicionando carros ao arraylist
        carros.add("GOL");
        carros.add("CELTA");
        carros.add("BMW");
        carros.add("FERRARI");
        carros.add("FUSCA");
        carros.add("MERCEDES");
        // Mostra array
        System.out.println(carros);
        
        // Substituir FUSCA por MITSUBISHI
        carros.set(4,"MITSUBISHI");
        // Mostra array
        System.out.println(carros);
        
        // Remover MERCEDES
        carros.remove("MERCEDES");
        // Mostra array
        System.out.println(carros);
        
        // Adicionando carros ao arraylist com JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // Mostra array
        System.out.println(carros);
        
        // Esvaziando o array
        // carros.clear();
        // Mostra array
        // System.out.println(carros);
        
        
        // Verificar se o array está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }
        
        if (carros.contains("BMW")) {
            // Substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))) {
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        }
        // Mostra array
        System.out.println(carros);
	}
}
