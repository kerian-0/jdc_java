class DimensionArrayDemo{
	static int[][] arrays={{1,2},{3,4,5},{6,7},{8,9,1,6}};
	public static void main(String[] args) {
		showArrays();

	}
	static void showArrays(){
		
         for(int x=0;x<arrays.length;x++){
         	for(int y=0;y<arrays[x].length;y++){
         		System.out.print( arrays[x][y] );

         	}
         }
	}
}