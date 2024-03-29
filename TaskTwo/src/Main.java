import java.util.Arrays;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		//1.Task one
		int n = 12;
		int sum = 0;
		int maxZero = 0, maxOne = 0, zero = 0, one = 0;
		int evenSum = 0, oddSum = 0;
		int[] array = new int[10];
		int[] name = new int[10];
		for(int i = 0; i < name.length; i++){
			name[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println("Arrays name:" + Arrays.toString(name));
		System.out.println("Arrays array:" + Arrays.toString(array));
		//2. Task two
		for(int i = 0; i < name.length; i++){
			sum = sum + name[i];
		}
		System.out.println("The sum of the array numbers is " + sum);
		//3, 4. Task three and four
		for(int i = 0; i < array.length; i++){
			array[name[i]]++;
		}	
		for(int i = 1; i < 6; i++){
			System.out.println("The number " + i + " was found in the array " + array[i] + " times");
		}
		//5. Task five
		char[] chars = new char[n]; 
        for (int i = 0; i < n; i++)
            chars[i] = (char)('A' + i);
        Random r = new Random();                                   
        for (int i = n - 1; i >= 1; i--) {
            int j = r.nextInt(i + 1);
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            System.out.print(" " + temp);
        }
        //6. Task six
        for (int i = 0; i < array.length; i++){
        	array[i] = (int) (Math.random() * 2) + 0;
        	if(array[i] == 0)
        		zero++;
        	else if(array[i] != 0 && zero > maxZero){
        		maxZero = zero;
        		zero = 0;
        	}	
        	else if(array[i] != 0 && zero <= maxZero)
        			zero = 0;
        	if(array[i] == 1)
        		one++;
        	else if(array[i] != 1 && one > maxOne){
        		maxOne = one;
        		one = 0;
        	}	
        	else if(array[i] != 1 && one <= maxOne)
        			one = 0;
        }
        System.out.println();
        System.out.println("Arays:" + Arrays.toString(array));
        System.out.println("The number 0 was found in the array " +maxZero+ " times in a row");
        System.out.println("The number 1 was found in the array " +maxOne+ " times in a row");
        //7. Task seven
        int[] name1 = new int[10];
        for (int i = 0; i < name1.length; i++){
        	name1[i] = (int) (Math.random() * 9) + 1;
        	if(name1[i] % 2 == 0)
        		evenSum += name1[i];
        	else 
        		oddSum += name1[i];
        }
        System.out.println("Arays:" + Arrays.toString(name1));
        System.out.println("The sum of even numbers is: " + evenSum);
    	System.out.println("The sum of odd numbers is: " + oddSum);  	
	}
}
