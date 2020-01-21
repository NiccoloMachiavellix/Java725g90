public class ValidityCheck {

public static boolean isLengthValid(String personNumber) {
	
int length = 10;	
if(personNumber.length() == length) 
	return true; 
else
	return false;
}
  
public static int calculate(String personNumber) {
    int tre = 0;
    int temp2 = 0;
    int temp = 0;
    int trezx = 0;
	
	 
    for( int i = 0; i < personNumber.length() ; i++)
		
	{
    	 	
	char charAtPosition = personNumber.charAt(i);
	int varde = Integer.parseInt("" + charAtPosition);
if ((i % 2 != 0)) 
{
	varde = varde * 1;
temp = varde + temp;
       }

tre = temp;
   			}

for (int i = 0; i < personNumber.length();i++){
char charAtPosition = personNumber.charAt(i);
int v2 = Integer.parseInt("" + charAtPosition);
	if ((i % 2 == 0)) {
	v2 = v2 * 2;
	if (v2 >= 10 ) {
		String number = String.valueOf(v2);
		for (int ix = 0; ix <= 1; ix++) {
	   v2 = Character.digit(number.charAt(ix), 10);
	     temp2= v2 + temp2;

		}
	}
	else {
		temp2 = v2 + temp2;
		}
    }
	trezx = tre+temp2;
	System.out.println(trezx);
}

return trezx;	
}
public static boolean isValidSSNR(String personNumber, int trezx) {
	if ((trezx % 10 == 0) && (isLengthValid(personNumber)))	
	return true;
	else
		return false;
}

    public static void main(String[] args) {
        String personNumber = "9103259876";
        int sum = 0;
    	        
   
	
    if (isLengthValid(personNumber)) {
        System.out.println("Giltig längd på personnumret.");
} 
else
{
    System.out.println("Ej en gilitg längd.");
    }
  
    
    
    

sum = calculate(personNumber);  
    /////////////////////////////////////////////////////////////////	

System.out.println(personNumber);   
if (isValidSSNR(personNumber, sum)) {
        System.out.println("Giltigt nummer.");
    } 
else {
        System.out.println("Ej ett giltigt nummer.");
    }
}  
}