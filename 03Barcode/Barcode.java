public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
    private String BC;
    public static void main(String[] args){
	Barcode testcase = new Barcode("12345");
	//Barcode testcase5 = new Barcode("23456");
	//System.out.println("FAIL: has a letter 'a'");
	//Barcode testcase2 = new Barcode("12a34");
	//System.out.println("FAIL: too many letters");
	//Barcode testcase3 = new Barcode("123456");
	//System.out.println("FAIL: too little letters");
	//Barcode testcase4 = new Barcode("123");
	System.out.println(testcase.clone(testcase));
	    
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
      _checkDigit = checkSum() % 10;
      
      
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
      return ans;
  }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return (_checkDigit + _zip + " " + "|" + createBC() + "|");
  }
  private String createBC(){
      String ans = "";
      for( int i = 0; i < _zip.length(); i++){
	  switch ( Integer.parseInt(_zip.charAt(i)+"") ){
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
      if (other._zip.equals(_zip) && other._checkDigit == _checkDigit){
	  return 0;
      }else{
	  return -1;
    
}
}
}
