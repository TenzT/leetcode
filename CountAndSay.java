/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * @author tandezhi
 *
 */
public class CountAndSay {
	public static String countAndSay(int n) {
		String result = "1";
		for(int i=1;i<n;i++) {
			result = getFromLast(result);
		}
		return result;
	}

	public static String getFromLast(String string) {
		char[] arr = string.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i+1 >= arr.length ||arr[i] != arr[i+1]){
                sb.append(count);
                sb.append(arr[i]);
                count = 1;
            } else {
                count ++;
            }
        }
        return sb.toString();
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(countAndSay(i));
		}
	}
}
