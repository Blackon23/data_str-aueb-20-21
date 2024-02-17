public interface Comparable<City> {
	public static void quickSort(int[] array, int low, int high, ArrayList<City> list) {
		int middle = low + (high - low) / 2;
		int pivot = array[middle];
		int i = low, j = high;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i > j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
				String temp1 = (list.get(i)).getName();
				(list.get(i)).getName() = (list.get(j)).getName();
				(list.get(j)).getName() = temp1;		
			}
			else if (i == j){
				if (list.get(i).getName().compareTo(list.get(j).getName()) > 0){
					String temp1 = list.get(i).getName();
					list.get(i).getName() = list.get(j).getName();
					list.get(j).getName() = temp1;
				} else if (list.get(i).getName().compareTo(list.get(j).getName()) = 0){
					if (list.get(i).getID() > list.get(j).getID()){
						String temp1 = list.get(i).getName();
						list.get(i).getName() = list.get(j).getName();
						list.get(j).getName() = temp1;
					}
				}
			}
		}
		if (low < j){
			quickSort(array, low, j, list);
		}
		if (high > i){
			quickSort(array, i, high, list);
		}
	}
}