public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
    private String BC; 

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public BarCode(String zip) {

      try {
	  temp =  Integer.parseInt(zip);
	  if (zip.length() != 5){
	      throw new IllegalArgumentException e;
	  }
      }catch(NumberFormatException e){
	  throw new IllegalArgumentException e;
      }
      _zip = zip;
      _checkDigit = _zip.checkSum() % 10;
      
      
  }

// postcondition: Creates a copy of a barcode.
  public Barcode clone(BarCode x){
      Barcode temp = new Barcode(_zip);
      return temp;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int ans = 0;
      for (int i = 0; i < _zip.length; i++){
	  ans = ans + Integer.parseInt( _zip.charAt(i));
      }
      return ans;
  }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return (_checkDigit + _zip + " " + "||" + BC + "||");
  }
  private String createBC(){
      String ans = "";
      for( int i = 0; i < _zip.length(); i++){
	  switch ( Integer.parseInt(_zip.charAt(i)) ){
	  case 1: ans = ans + ":::||";
	  case 2: ans = ans + "::|:|";
	  case 3: ans = ans + "::||:";
	  case 4: ans = ans + ":|::|";
	  case 5: ans = ans + ":|:|:";
	  case 6: ans = ans + ":||::";
	  case 7: ans = ans + "|:::|";
	  case 8: ans = ans + "|::|:";
	  case 9: ans = ans + "|:|::";
	  case 0: ans = ans + "||:::";
	      break;
	  default: break;
	  }
      }
      BC = ans;
      return BC;
  }
	  


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){

      switch(other._zip.equals(_zip) && other._checkDigit == _checkDigit){
      case false: false;
      case true: true;
    
}
