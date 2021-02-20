class HourGlass {
    
    public static void main(String[] args) {

	int[][] a = { {0,-4,-6,0,-7, -6},
		      {-1,-2,-6,-8,-3,-1},
		      {-8, -4, -2, -8, -8, -6},
		      {-3, -1, -2, -5, -7, -4},
		      {-3, -5, -3, -6, -6, -6},
		      {-3, -6, 0 ,-8, -6 ,-7}
	};

      	int[][] z = { {1, 1, 1, 0, 0, 0},
		      {0, 1, 0, 0, 0, 0},
		      {1, 1, 1, 0, 0, 0},
		      {0, 0, 0, 0, 0, 0},
		      {0, 0, 0, 0, 0, 0},
		      {0, 0, 0, 0, 0, 0}
	};
	int[] b = new int[(a.length *3) -2 ];
	// hourglass(a);

	int sum = 0;
	int count = 0;
        for(int i = 0; i < a.length-2; i++) {
	    for(int j = 0; j < a[0].length -2; j++) {
		sum += a[i][j] + a[i][j+1] + a[i][j+2];
		sum += a[i+1][j+1];
		sum += a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
		
		b[count] = sum;
		count++;
		System.out.print(sum + " sum\n");
		sum = 0;
	     }
	}

        int max = b[0];
	
	for(int i = 0; i < b.length; i++) {
	    if(max < b[i]) {
		max = b[i];
	    }
	}

	System.out.println("\n" + max);
    }    
}
