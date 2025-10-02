package parcial.programacion;

import java.util.Random;
import java.util.Scanner;

public class ParcialProgramacion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.print("Cantidad de números a validar: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(99900) + 100; 
        }
        
        
        System.out.print("Números generados: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        
        for (int num : numeros) {
            int suma = sumaDigitos(num);
            int invertido = invertirNumero(num);
            
            boolean condicion1 = (suma % 2 == 0);
            boolean condicion2 = (invertido % 3 == 0);
            
            if (condicion1 && condicion2) {
                System.out.println(num + " -> Sí (suma=" + suma + ", invertido=" + invertido + ")");
            } else {
                System.out.println(num + " -> No (suma=" + suma + ", invertido=" + invertido + ")");
            }
        }
    }
    
    
    public static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
    
    
    public static int invertirNumero(int num) {
        int invertido = 0;
        while (num > 0) {
            invertido = invertido * 10 + (num % 10);
            num /= 10;
        }
        return invertido;
    }
}

