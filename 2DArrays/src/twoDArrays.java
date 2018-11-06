
public class twoDArrays {
	public static void main(String[] args){
		int [][] grid = new int[3][4];
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[0].length; col++){
				grid [row][col] = row + col;
			}//end columns
		}//end rows
		
		for (int[] row : grid){
			for (int num : row){
				System.out.print(num + " ");
			}//end columns
		System.out.print("\n");
		}//end rows
	}//end main method

}//end class
