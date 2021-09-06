// Brooke Davis

package toBeSorted;

public class ArrayDemo {

	public static void main(String[] args) {
		  String str[][] = new String[3][2]; //3 rows, 2 columns
		  str[0][0] = "User1";
		  str[1][0] = "User2";
		  str[2][0] = "User3";
		  str[0][1] = "Password1";
		  str[1][1] = "Password2";
		  str[2][1] = "Password3";
		  
		  //This for loop will be total executed 3 times.
		  for(int i=0; i<str.length; i++){
			  //This for loop will be executed for 2 time on every iteration.
			  for(int j=0; j<str[i].length; j++){
				  System.out.println(str[i][j]);
			  }
		  }
	}
}