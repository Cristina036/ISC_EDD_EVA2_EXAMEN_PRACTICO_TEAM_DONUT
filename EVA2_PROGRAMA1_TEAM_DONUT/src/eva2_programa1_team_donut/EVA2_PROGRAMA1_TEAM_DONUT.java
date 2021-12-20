package eva2_programa1_team_donut;

import java.util.Scanner;

/**
 *
 * @author TEAM DONUT
 */
public class EVA2_PROGRAMA1_TEAM_DONUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArbolBinario arbolB = new ArbolBinario();

        System.out.println("¿Cuantas palabras va a ingresar?");
        int NVal = teclado.nextInt();
        int i;
        String[] Palabras = new String[NVal];
        for (i = 0; i < Palabras.length; i++) { //Agregamos Nodos a la lista
            System.out.println("Introduzca la palabra " + (i + 1) + " : ");
            arbolB.add(teclado.next());
        }

//Imprimirmos nuestro árbol con los distintos métodos
        System.out.println("Impresión In-Order:");
        arbolB.printInOrder();

        System.out.println("\nImpresión Post-Order:");
        arbolB.printPostOrder();

        System.out.println("\nImpresión Pre-Order:");
        arbolB.printPreOrder();

        //Exportamos de árbol a linked list 
        System.out.println("\nÁrbol In Order a Lista");
        arbolB.printListInOrder();
        arbolB.miLista.printList(); //Imprimimos nuestra lista
    }

}
