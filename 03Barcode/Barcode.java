public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
    private static String BC;
    public static void main(String[] args){
	Barcode testcase = new Barcode("12345");
	//Barcode testcase5 = new Barcode("23456");
	//System.out.println("FAIL: has a letter 'a'");
	//Barcode testcase2 = new Barcode("12a34");
	//System.out.println("FAIL: too many letters");
	//Barcode testcase3 = new Barcode("123456");
	//System.out.println("FAIL: too little letters");
	//Barcode testcase4 = new Barcode("123");
	System.out.println(toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
	System.out.println("This should fail!");
	System.out.println(toZip("|||:::|::|::|::|:|:|::::||"));
    }

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {

      try {
	  int temp =  Integer.parseInt(zip);
	  if (zip.length() != 5){
	      throw new IllegalArgumentException();
	  }
      }catch(NumberFormatException e){
	  throw new IllegalArgumentException();
      }
      _zip = zip;
      _checkDigit = checkSum();
      
      
  }

// postcondition: Creates a copy of a barcode.
  public Barcode clone(Barcode x){
      Barcode temp = new Barcode(_zip);
      return temp;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int ans = 0;
      for (int i = 0; i < _zip.length(); i++){
	  ans = ans + Integer.parseInt( _zip.charAt(i)+"");
      }
      _checkDigit = ans%10;
      return ans%10; 
  }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return (_checkDigit + _zip + " " + "|" + toCode(_zip) + "|");
  }

  private static String toCode(String zip){
      if(zip.length() != 5){
	  throw new IllegalArgumentException("your zipcode should be 5 characters");
      }
      try{
	  int temp = 0;
	  temp = Integer.parseInt(zip);
      }catch(IllegalArgumentException e){
	  throw new IllegalArgumentException("your zip has invalid characters!");
      }
      String ans = "";
      for( int i = 0; i < zip.length(); i++){
	  switch ( Integer.parseInt(zip.charAt(i)+"") ){
	  case 1: ans = ans + ":::||";
	      break;
	  case 2: ans = ans + "::|:|";
	       break;
	  case 3: ans = ans + "::||:";
	       break;
	  case 4: ans = ans + ":|::|";
	       break;
	  case 5: ans = ans + ":|:|:";
	       break;
	  case 6: ans = ans + ":||::";
	       break;
	  case 7: ans = ans + "|:::|";
	       break;
	  case 8: ans = ans + "|::|:";
	       break;
	  case 9: ans = ans + "|:|::";
	       break;
	  case 0: ans = ans + "||:::";
	       break;
	  }
      }
      BC = ans;
      return BC;
  }
	  


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      if (Integer.parseInt(_zip) > Integer.parseInt(other._zip)){
	  return 1;
      }else{
	  if (Integer.parseInt(_zip) < Integer.parseInt(other._zip)){
	      return -1;
	  }else{
	      return 0;
	  }
      }
    
}
    public static String toZip(String code){
      String ans = "";
      for(int i = 0; i < code.length()-1; i++){
	  if(!code.substring(i, i+1).equals("|") &&
	     !code.substring(i, i+1).equals(":")){
	      throw new IllegalArgumentException("your barcode has an invalid character");
	  }
      }
      if(code.length() != 32){
	  throw new IllegalArgumentException("your barcode doesn't have enough characters.");
      }
      if(!code.substring(0, 1).equals("|")){
	  throw new IllegalArgumentException("your barcode should start with a '|'");
      }
      if(!code.substring(31).equals("|")){
	  throw new IllegalArgumentException("your barcode should end with a '|'");
      }
      for( int i = 0; i < 6; i++){
	  switch ( code.substring(i*5 + 1, i*5 + 6) ){
	  case ":::||": ans = ans + "1";
	      break;
	  case "::|:|": ans = ans + "2";
	       break;
	  case "::||:": ans = ans + "3";
	       break;
	  case ":|::|": ans = ans + "4";
	       break;
	  case ":|:|:": ans = ans + "5";
	       break;
	  case ":||::": ans = ans + "6";
	       break;
	  case "|:::|": ans = ans + "7";
	       break;
	  case "|::|:": ans = ans + "8";
	       break;
	  case "|:|::": ans = ans + "9";
	       break;
	  case "||:::": ans = ans + "0";
	       break;
	  default: throw new IllegalArgumentException("your barcode doesn't match up with the numbers");
	  }
      }
      int CS = 0;
      for (int i = 0; i < ans.length()-1; i++){
	  CS = CS + Integer.parseInt( ans.charAt(i)+"");
      }
      if ( CS%10 != Integer.parseInt(ans.substring(5))){
	  throw new IllegalArgumentException("the checksums do not match");
      }
      return ans.substring(0, 5);
  }
}

