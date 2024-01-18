/** 
 *  Game of Life.
 *  Usage: "java GameOfLife fileName"
 *  The file represents the initial board.
 *  The file format is described in the homework document.
 */

public class test {

	public static void main(String[] args) {
		String fileName = args[0];
		In in = new In(fileName); // Constructs an In object for reading the input file
		int rows = Integer.parseInt(in.readLine());
		int cols = Integer.parseInt(in.readLine());
		int boardRows = rows + 2;
		int boardCols = cols + 2;
		int[][] board = new int[boardRows][boardCols];
	
		for (int i = 1; i < boardRows - 1; i++) {
			if (in.hasNextLine()){
				String moti = in.readLine();
				for (int j = 1; j < boardCols - 1 && j <= moti.length(); j++) {
                    if (moti.charAt(j - 1) == 'x') {
                        board[i][j] = 1;
                    }
                }
			
				
			}
		}
		for (int i = 0; i < boardRows; i++) {
			for (int j = 0; j < boardCols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}	
	}		
			
			
}	
	
	