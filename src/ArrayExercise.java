public class ArrayExercise {
    public static void main(String [] args) {
	new ArrayExercise().runApp();
    }

    void runApp() {
	 Q01();
	 Q02();
	 Q03();
	 Q04();
	 Q05();
	 Q06();
    }


    //============================================================
    // Q01
    // Change "*** Your code ***" so that it would print the following:
    //----------
    // Q01...
    // All elements: 12 31 56 1 18 7
    // That's all, folks!
    //----------
    void Q01() {
	int array[] = { 12, 31, 56, 1, 18, 7 };

	System.out.println("Q01...");
		System.out.print("All elements: ");
	for (int i = 0; i< array.length ; i++) {
	    System.out.print(array[i]+" ");
	}
		System.out.println();
	 System.out.println("That's all, folks!");
    }


    //============================================================
    // Q02
    // Change "*** Your code ***" so that it would print the following:
    //----------
    // Q02...
    // Even elements: 12 56 18
    // That's all, folks!
    //----------
    void Q02() {
	int array[] = { 12, 31, 56, 1, 18, 7 };

	System.out.println("Q02...");
		System.out.print("All elements: ");
		for (int i = 0; i< array.length ; i+=2) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	System.out.println("That's all, folks!");
    }


    //============================================================
    // Q03
    // Change "*** Your code ***" so that it would print the following:
    //----------
    // Q03...
    // There are 4 even numbers.
    // There are 5 odd numbers.
    // That's all, folks!
    //----------
    void Q03() {
	int array[] = { 12, 31, 56, 1, 18, 7, 55, 71, 84 };
	int even = 0;
	int odd = 0;
	System.out.println("Q03...");
		for (int i = 0; i< array.length ; i++) {
			if (array[i]%2==0){
				even++;
			}else {
				odd++;
			}
		}
	 System.out.println("There are " + even + " even numbers.");
	 System.out.println("There are " + odd + " odd numbers.");
	System.out.println("That's all, folks!");
    }


    //============================================================
    // Q04
    // Change "*** Your code ***" so that it would print the following:
    //----------
    // Q04...
    // Between 0 and 9: 7
    // Between 10 and 19: 1
    // Between 20 and 29: 1
    // Between 30 and 39: 6
    // Between 40 and 49: 0
    // Between 50 and 59: 1
    // Between 60 and 69: 6
    // Between 70 and 79: 5
    // Between 80 and 89: 1
    // Between 90 and 99: 2
    // That's all, folks!
    //----------
    void Q04() {
	int array[] = { 31,  4, 52, 17, 66, 66, 78,  6,  9, 22,
		30,  4, 63, 30, 35, 72, 31, 63,  0, 75,
		84, 76, 64,  1, 98, 92, 70,  1, 65, 31};
	/* Your code (Hint: need another *array* for the counting.) */
   int count[] = new int [10];
	System.out.println("Q04...");
	for (int i = 0; i< array.length; i++) {
	    if (array[i] < 10) {
		count[0]++;
	    } else if (array[i] < 20) {
		count[1]++;
		/* Your code to handle other ranges */
	    } else if (array[i] < 30) {
			count[2]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 40) {
			count[3]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 50) {
			count[4]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 60) {
			count[5]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 70) {
			count[6]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 80) {
			count[7]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 90) {
			count[8]++;
			/* Your code to handle other ranges */
		}else {
			count[9]++;
	    }
	}
	/* Your code to print out the counts of different ranges */
		System.out.println("Between 0 and 9: "+ count[0]);
		System.out.println("Between 10 and 19: "+ count[1]);
		System.out.println("Between 20 and 29: "+ count[2]);
		System.out.println("Between 30 and 39: "+ count[3]);
		System.out.println("Between 40 and 49: "+ count[4]);
		System.out.println("Between 50 and 59: "+ count[5]);
		System.out.println("Between 60 and 69: "+ count[6]);
		System.out.println("Between 70 and 79: "+ count[7]);
		System.out.println("Between 80 and 89: "+ count[8]);
		System.out.println("Between 90 and 99: "+ count[9]);
	 System.out.println("That's all, folks!");
    }


    //============================================================
    // Q05
    // Change "*** Your code ***" so that it would generate the
    // histogram as illustrated below:
    //----------
    // Q05...
    // 0: *******
    // 1: *
    // 2: *
    // 3: ******
    // 4:
    // 5: *
    // 6: ******
    // 7: *****
    // 8: *
    // 9: **
    // That's all, folks!
    //----------
    void Q05() {
	int array[] = { 31,  4, 52, 17, 66, 66, 78,  6,  9, 22,
		30,  4, 63, 30, 35, 72, 31, 63,  0, 75,
		84, 76, 64,  1, 98, 92, 70,  1, 65, 31};
	/* Your code (Hint: need another *array* for the counting.) */
   int count[] =new int [10];
	System.out.println("Q05...");
	for (int i = 0; i< array.length; i++) {
		if (array[i] < 10) {
			count[0]++;
		} else if (array[i] < 20) {
			count[1]++;
			/* Your code to handle other ranges */
		} else if (array[i] < 30) {
			count[2]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 40) {
			count[3]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 50) {
			count[4]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 60) {
			count[5]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 70) {
			count[6]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 80) {
			count[7]++;
			/* Your code to handle other ranges */
		}else if (array[i] < 90) {
			count[8]++;
			/* Your code to handle other ranges */
		}else {
			count[9]++;
		}
	}
	/* Your code to print out the histogram of different ranges */
		System.out.print("0: ");
		for(int i = 0; i< count[0]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("1: ");
		for(int i = 0; i< count[1]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("2: ");
		for(int i = 0; i< count[2]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3: ");
		for(int i = 0; i< count[3]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4: ");
		for(int i = 0; i< count[4]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("5: ");
		for(int i = 0; i< count[5]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("6: ");
		for(int i = 0; i< count[6]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("7: ");
		for(int i = 0; i< count[7]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("8: ");
		for(int i = 0; i< count[8]; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("9: ");
		for(int i = 0; i< count[9]; i++){
			System.out.print("*");
		}
		System.out.println();
	 System.out.println("That's all, folks!");
    }


    //============================================================
    // Q06
    // Change "*** Your code ***" so that it would generate the
    // histogram as illustrated below:
    //----------
    // Q06...
    // 0: *******
    // 1: *
    // 2: *
    // 3: ******
    // 4:
    // 5: *
    // 6: ******
    // 7: *****
    // 8: *
    // 9: **
    // That's all, folks!
    //----------
    void Q06() {
	int array[] = { 31,  4, 52, 17, 66, 66, 78,  6,  9, 22,
		30,  4, 63, 30, 35, 72, 31, 63,  0, 75,
		84, 76, 64,  1, 98, 92, 70,  1, 65, 31};
	/* Your code (Hint: need another *array* for the counting.) */
		int count[] = new int [10];

	System.out.println("Q06...");
	/* Your code for the counting */
		for (int i = 0; i< array.length; i++) {
			if (array[i] < 10) {
				count[0]++;
			} else if (array[i] < 20) {
				count[1]++;
				/* Your code to handle other ranges */
			} else if (array[i] < 30) {
				count[2]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 40) {
				count[3]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 50) {
				count[4]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 60) {
				count[5]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 70) {
				count[6]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 80) {
				count[7]++;
				/* Your code to handle other ranges */
			}else if (array[i] < 90) {
				count[8]++;
				/* Your code to handle other ranges */
			}else {
				count[9]++;
			}
		}
	/* Your code to print out the histogram of different ranges */
int i = 0;
		for(int Stars : count) {
			System.out.print(i + ": ");
				for (int j = 0; j < Stars; j++) {
					System.out.print("*");
				}
				i++;
			System.out.println();
			}
	 System.out.println("That's all, folks!");
    }
}
