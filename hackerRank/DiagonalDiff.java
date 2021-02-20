import java.util.*;

class DiagonalDiff {

    public static void main(String[] args) {

	List<List<Integer>> ar = Arrays.asList(
					       Arrays.asList(1,2,3),
					       Arrays.asList(4,5,6),	
					       Arrays.asList(7,8,9)
					       );
	System.out.println(ar.get(0).size());
	System.out.println(ar.size());

	for(int i = 0; i < ar.size(); i++) {
	    for(int j = 0; j < ar.get(0).size(); j++) {
		if(i == j) System.out.print(ar.get(i).get(j) + " ");
		if(i + j == (ar.size() -1) )  System.out.print(i + j); 

	    }
	    System.out.println();
	}
    }

}
