package com.example.logics1;

public class Example1 {

	// print square
	static void print_square(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
	
	//print rectangle
	static void print_rectangle(int n, int m) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				if (i == 1 || i == n || j == 1 || j == m)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
	
	//print square dimension
	static void print_squaredi(int n) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= n; j++) 
            { 
                if (i == 1 || i == n || j == 1 ||  
                j == n || i == j || j == (n - i + 1))             
                    System.out.print("* ");             
                else           
                    System.out.print("  ");             
            } 
            System.out.println(); 
        } 
       
    } 
	
	//Print square inside the name
	static String print_letter_insideSqure(int n) {
		
		int i, j;
		
		String str = "Mathu";

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
					
					str= str +"* ";
				else
					str= str +"  ";
			}
			
			str= str +"\n";
		}
		return str;

	}
	
	static void print_sq_dimension() {
		
	}

	public static void main(String[] args) {

		int rows = 8;
		print_square(rows);

		int rows1 = 6, columns = 20;
		print_rectangle(rows1, columns);
		
		int rows2 = 15;
		print_squaredi(rows2);
		
		System.out.print(print_letter_insideSqure(8));
	}

}
