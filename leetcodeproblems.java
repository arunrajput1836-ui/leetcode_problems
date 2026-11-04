# leetcode_problems

//PROBLEM NO 242 (Valid Analog)
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
        
    }

}


// 387. First Unique Character in a String
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
        
    }
}

//125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String reqstr = new String();
        for (int i = 0;i< s.length();i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                reqstr = reqstr + ch;
            
              }

        }
        StringBuilder sb = new StringBuilder(reqstr);
        sb.reverse();
        String revstr = sb.toString();
        return reqstr.equals(revstr);
        
    }
}

141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

876. Middle of the Linked List

  class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

202. Happy Number
  class Solution {
    public boolean isHappy(int n) {
            HashSet<Integer>h=new HashSet<>();
            h.add(n);
            while(true){
                int sum = 0;
                while(n!=0)
                {
                    int d=n%10;
                    sum = sum+d*d;
                    n=n/10;

                }
                if(sum==1)
                return true;
                if(h.contains(sum))
                return false;
                h.add(sum);
                n= sum;
            }
        }
        
    }

  







