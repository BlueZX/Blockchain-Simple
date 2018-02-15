public class FirmaDigital{
  /**
    codigo para ver como se comporta el hash
  */
  
	public static void main(String[] args){
		String[] list1 = {"a","b","c"};
		String[] list2 = {"aa","b","c"}; //si esta lista de Strings  fuera igual a la anterior su hash (Firma digital) seria igual a la de la lista 1, una sola modificación cambia el hash  por completo

		System.out.println("firma digital de la lista 1: " + Arrays.hashCode(list1));
		System.out.println("firma digital de la lista 2: " + Arrays.hashCode(list2));
  }
}
