class Solution {
    public String reverseWords(String s) {
        // simplest sol. add each word from end
		s=s.trim();
		String []arr = s.split("\s+");
		StringBuilder ans =new StringBuilder();
		for (int i=arr.length-1;i>=0;i--) {
			ans.append(arr[i]+" ");
					
		}
        return ans.toString().trim();
    }
}