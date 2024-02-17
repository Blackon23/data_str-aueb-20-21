import java.util.Comparator;
public class PQ implements PriorityQueueInterface {
	private City[] heap;
	private int size;
	private Comparator comparator; 
	
	public HeapPriorityQueue(Comparator comparator) {
        this.heap = new City[k];
        this.size = 0;
		this.comparator = comparator;
	}
	public void insert(City item) {
		if (size >= heap.length()*75%){
			resize();
		}
		heap[++size] = item;
        swim(size);
    }
	
	public City max() {
        if (isEmpty()){
            return null;
		}
        return heap[1];
    }
	
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int size(){
		return size;
	}
	
	public City getMax() {
        if (isEmpty){
            return null;
		}
        City root = heap[1];
        heap[1] = heap[size];
        size--;
        sink(1);
        return root;
    }
	
	private void resize() {
		City[] newHeap = new City[heap.length*2];
        for (int i = 0; i <= size; i++) {
           newHeap[i] = heap[i];
        }
        heap = newHeap;
    }
	
	private void swap(int i, int j) {
    	City tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
	
	private void swim(int i) {
		if (i == 1){
            return;
		}
        int parent = i / 2;
        while (i != 1 && comparator.compare(heap[i], heap[parent]) > 0) {
            swap(i, parent);
            i = parent;
            parent = i / 2;
        }
    }
	
	private void sink(int i) {
        int left = 2 * i;
        int right = left + 1;
        if (left > size){
            return;
		}
        while (left <= size) {
            int max = left;
            if (right <= size) {
                if (comparator.compare(heap[left], heap[right]) < 0){
                    max = right;
				}
            }
            if (comparator.compare(heap[i], heap[max]) >= 0){
                return;
			}
            else {
                swap(i, max);
                i = max;
                left = i * 2;
                right = left + 1;
            }
        }
    }
	
	public City remove(int id){
		if (isEmpty){
            return null;
		}
		int temp = 0;
		while (heap[temp].getID != id){
			temp++;
		}
        City root = heap[temp];
        heap[temp] = heap[size];
        size--;
        sink(temp);
        return root;
	}
	
	public void readall(){
		for (i=0; i<=size; i++){
			System.out.println(heap[i]);
		}
	}
}
