class Main
{   public static String reverseTheOrderOfWords(String sentence) {
 
    StringBuilder output = new StringBuilder();
    String[] words = sentence.split(" ");
 
    for (int i = words.length - 1; i >= 0; i--) {
        output.append(words[i]);
        output.append(" ");
    }
    return output.toString().trim();
}
    public static int countWords(String str,String str2) {
    String[] words = str.split(" ");
    int count=0;
     for (int i = 0; i < words.length-1; i++) {
        if(str2.equals(words[i])){
            count++;
        }
    }
    return count;
}
	public static void main(String[] args) {
		String str = "Hello Hello World Bitches";
		String str2 ="Hello";
		System.out.println("Reverse Sentence: "+reverseTheOrderOfWords(str));
		System.out.println("Count: "+countWords(str,str2));
	}
}
