package arrays;

public class MisArrays {

    public MisArrays() {
    	super();
    	// TODO Auto-generated constructor stub
    }
  /* Este m�todo recibe dos vectores y devuelve un vector que en cada posici�n tiene la suma 
  de la misma posici�n de los dos vectores recibidos como par�metros */ 
    
    public int[] sumar(int[] a1,int[] a2) {
    	if(a1.length!=a2.length)
    		return null;
    	int[] salida = new int[a1.length];
    	for (int i = 0; i < a1.length; i++) {             
    		salida[i]=a1[i]+a2[i];         
    	} 
    	return salida; 
    }
    
  /* Recibe un vector de enteros y un n�mero y le resta a cada posici�n del vector la cantidad 
   * indicada en el par�metro num */
    public void decrementar(int[] arra,int num) {
    	for (int i = 0; i < arra.length; i++) {
    		arra[i]=arra[i]-num;         
    		}     
    	} 
}
