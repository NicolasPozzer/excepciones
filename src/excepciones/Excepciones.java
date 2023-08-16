
package excepciones;


public class Excepciones {

    public static void main(String[] args) {
        
        //1er Ejemplo
        try{
        int resultado = 3/0;//error de excepcion a proposito dividiendo x 0.
        }catch(Exception e){
            System.out.println("NO SE PUEDE DIVIDIR POR 0!!!");
        }
        
        int edades [] = {15, 12, 23, 30};
        
        try{
        System.out.println("La edad de la posicion 4 es: "+ edades[4]);//error a proposito ya que el vector es de 4 pero arranca__
                                                                        //en 0, y el indice es hasta maximo 3.
        }catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe!!!");
        }
        
    }
    
}
