package MaximuTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class GenericsMaximum <T extends Comparable<T>> {
	T firstValue;
	T secondValue;
	T thirdValue;

	public GenericsMaximum(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	} 
	
	
	
	// Generic Method
	public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third, T... value) {
		T maximumValue = first; 
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second; 
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; 
		if (value.length != 0) {
			maximumValue = maximumOfObjectOptional(maximumValue, value);
		}
		return maximumValue;
	}
	
	// maximum method for more variables
	public static <T extends Comparable<T>> T maximumOfObjectOptional(T maximum, T... values) {
		for (T value : values) {
			
			if (value.compareTo(maximum) > 0)
				maximum = value;
		}
		System.out.println("maximum is :" + maximum );
		return maximum;
	}
	// printing maximum values
	public static <T> void printMaximumValue(T firstValue, T secondValue, T thirdValue, T maximumValue) {
		System.out.println("The maximum of " + firstValue + "," + secondValue + "," + thirdValue + " is " + maximumValue);
	
	}
	public T testMax() {
		printMaximumValue(firstValue, secondValue, thirdValue, maximumOfObject(firstValue, secondValue, thirdValue));
		return GenericsMaximum.maximumOfObject(firstValue, secondValue, thirdValue);
	}
	
}