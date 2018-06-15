/* Implement strStr()
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack*/

public class strStr {
	public static int strStr(String haystack, String needle){
		if(needle==null || haystack==null || needle.length()==0) {
			return 0;
		}
		return haystack.indexOf(needle);
	}
	
	public static void main(String[] args) {
		String haystack = "Hello World";
		String needle = "llo";
		String needleNothing = "";
		String needleNone = "abc";
		System.out.println(strStr(haystack, needle));
		System.out.println(strStr(haystack, needleNothing));
		System.out.println(strStr(haystack, needleNone));
	}
}
