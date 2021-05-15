package MaximuTest;
import org.junit.Assert;
import org.junit.Test;
public class GenericsMaximumTest {

	  @Test
	    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
	       Integer  integerGenericsMaximum = new GenericsMaximum<Integer>(10, 5, 2).testMax();
	        Assert.assertEquals((Integer)10,  integerGenericsMaximum);
	        
	    }

	    @Test
	    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
	        Integer integerGenericsMaximum = new GenericsMaximum<Integer>(5, 10, 2).testMax();    
	        Assert.assertEquals((Integer)10, integerGenericsMaximum);
	     
	    }

	    @Test
	    public void  givenInteger_whenThirdIntegerIsMax_ReturnSame() {
	        Integer integerGenericsMaximum = new GenericsMaximum<Integer>(2, 5,10).testMax();    
	        Assert.assertEquals((Integer)10, integerGenericsMaximum);
	       
	    }

	    @Test
	    public void  givenFloat_whenFirstFloatIsMax_ReturnSame() {
	    	Float floatGenericsMaximum = new GenericsMaximum<Float>(10.5f, 5.5f, 2.5f).testMax();
	      
	        Assert.assertEquals((Float)10.5f,floatGenericsMaximum );
	     
	    }

	    @Test
	    public void  givenFloat_whenSecondFloatIsMax_ReturnSame() {
	    	Float floatGenericsMaximum = new GenericsMaximum<Float>(5.5f, 10.5f, 2.5f).testMax();
		      
	        Assert.assertEquals((Float)10.5f,floatGenericsMaximum );
	     
	    }

	    @Test
	    public void  givenFloat_whenThirdFloatIsMax_ReturnSame() {
	    	Float floatGenericsMaximum = new GenericsMaximum<Float>(5.5f, 2.5f, 10.5f).testMax();
		      
	        Assert.assertEquals((Float)10.5f,floatGenericsMaximum );
	      
	    }

	    @Test
	    public void  givenString_whenFirstStringIsMax_ReturnSame() {
	        String stringGenericsMaximum = new GenericsMaximum<String>("Plum", "Apple", "Banana").testMax();
	      Assert.assertEquals("Plum",stringGenericsMaximum);
	     
	    }

	    @Test
	    public void  givenString_whenSecondStringIsMax_ReturnSame() {
	        String stringGenericsMaximum = new GenericsMaximum<String>("Apple", "Plum", "Banana").testMax();
	      Assert.assertEquals("Plum",stringGenericsMaximum);
	       
	    }

	    @Test
	    public void  givenString_whenThirdStringIsMax_ReturnSame() {
	        String stringGenericsMaximum = new GenericsMaximum<String>("Apple", "Banana", "Plum").testMax();
	      Assert.assertEquals("Plum",stringGenericsMaximum);
	       
	    }

	    @Test
		public void Test_Generics_OF_String_for_more_parameters() {
			String maxValueInteger = GenericsMaximum.maximumOfObject("DELL", "HP", "GOOGLE", "MICROSOFT", "LENOVO", "TESLA", "NASA", "TATA");
			Assert.assertEquals((String) "TESLA", maxValueInteger);
		}
}
