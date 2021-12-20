package com.codesignal.arcade;


public class BoxBlur {
	
	public static void main(String[] args) {
		
		int[][] image = {   {36,0,18,9},
				      		{27,54,9,0},
				      		{81,63,72,45},
				      		
		
		};
		
		final int subMat = 3;
		int[][] newImage = new int[image.length - subMat + 1][image[0].length - subMat + 1];

		for (int i = 0; i < image.length - subMat + 1; i++) {
			
			for (int j = 0; j < image[i].length - subMat + 1; j++) {
				
				int sum = 0;
				
				for (int p = i; p < subMat + i; p++) {
					for (int q = j; q < subMat +j; q++) {
						sum += image[p][q];
					}
				}
				newImage[i][j] = sum / 9;
				System.out.print(newImage[i][j]  + " ");
				System.out.println(sum / 9 );
				System.out.println();
				
			}
		}	
	}
}
			
	
		


