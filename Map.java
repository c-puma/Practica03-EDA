package Map;
import java.util.*;

public class Map <T extends Comparable<T>> {

	protected ArrayList<T> map;
	
	public Map() {
        this.map = new ArrayList<>();
    }
	
	public void insert(T element) {
        map.add(element);
    }
	
	 public T remove() {
		 if (isEmpty()) {
			throw new IllegalStateException("Mapa vacio");
	     }
		 
		 T removedElement = map.get(0);
		 int lastIndex = map.size() - 1;
		 map.set(0, map.get(lastIndex));
		 map.remove(lastIndex);
		 filtrarHaciaAbajo(0);
		 
		 return removedElement;
	 }
	 
	 private void filtrarHaciaAbajo(int index) {
		 
		 int indiceHijoIzquierdo = (2 * index) + 1;
		 int indiceHijoDerecho = (2 * index) + 2;
		 int largestIndex = index;
		 
		 if (indiceHijoIzquierdo < map.size() && map.get(indiceHijoIzquierdo).compareTo(map.get(largestIndex)) > 0) {
			 largestIndex = indiceHijoIzquierdo;
		 }else
		 
		 if (indiceHijoDerecho < map.size() && map.get(indiceHijoDerecho).compareTo(map.get(largestIndex)) > 0) {
			 largestIndex = indiceHijoDerecho;
		 }else

		 if (largestIndex != index) {
			 swap(index, largestIndex);
			 filtrarHaciaAbajo(largestIndex);
		 }
	 }
	 
	 public boolean isEmpty() {
	        return map.isEmpty();
	        
	 }
	 
	 public T cima() {
		 if (isEmpty()) {
			 throw new IllegalStateException("Heap is empty");
	     }
		 
		 return map.get(0);
	 }
	 
	 private void swap(int i, int j) {
		 T temp = map.get(i);
		 map.set(i, map.get(j));
		 map.set(j, temp);
	 }
	 
	 public int size() {
		 return this.map.size();
	 }
	 
	 public T get(int i) {
		 return map.get(i);
	 }
	 
	 public void mostrarHeap() {
		 System.out.println("El mapa:");
		 for(int i = 0;i < map.size(); i++) {
			 System.out.print(map.get(i)+"/");
		 }
	 }
}
