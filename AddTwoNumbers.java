  //You are given two linked lists representing two non-negative numbers. 
  //The digits are stored in reverse order and each of their nodes contain a single digit. 
  //Add the two numbers and return it as a linked list.

  //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  //Output: 7 -> 0 -> 8
  
  //Solution: Add each node starting from the left. 
  //Resultant list is either equal to the lengths of the lists or 1 node longer than the longer list.
  //When the lists are of unequal length add the carry to the longer list.
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
  {
      if (l1 == null || l2 == null)
          return null;
      ListNode curr1 = l1, curr2 = l2,result = l1, prev1 = null;
      int carry = 0;
      while (curr1 != null || curr2 != null || carry > 0)
      {
          int c1 = curr1 != null ? curr1.val : 0;
          int c2 = curr2 != null ? curr2.val : 0;
          int sum = c1 + c2 + carry;
          if (curr1 != null)
              curr1.val = sum % 10;
          else
          {
              curr1 = new ListNode(sum % 10);
              if (prev1 != null)
                  prev1.next = curr1;
          }
          carry = sum / 10;
          prev1 = curr1;
          if(curr1 != null)
              curr1 = curr1.next;
          if(curr2 != null)
              curr2 = curr2.next;
      }
      return result;
  }
  
