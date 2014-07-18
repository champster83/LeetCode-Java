  //Given two binary strings, return their sum (also a binary string).
  //For example,
  //a = "11"
  //b = "1"
  //Return "100". 

  //Solution: Starting from the nth character of both strings a & b, add each bit & carry forward any carry
  
  public String addBinary(String a, String b) 
  {
       if(a == null || b == null || a.trim() == "" || b.trim() == "")
          return null;
      StringBuilder sum = new StringBuilder();
      int i = a.length()-1, j = b.length()-1, carry =0; 
      while(i >= 0 || j >= 0 || carry > 0 )
      {
          int aBit = i >= 0 ? a.charAt(i) - '0' : 0;
          int bBit = j >= 0 ? b.charAt(j) - '0' : 0;
          int s = (aBit + bBit + carry);
          sum.insert(0,s%2);
          carry = s / 2;
          i--;
          j--;
      }
      return sum.toString();
  }
