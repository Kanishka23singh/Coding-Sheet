class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;

        // Initialize the freq array for the first word
        int freq[] = new int[26];
        fillFreqArray(words[0], freq);

        // Iterate through the rest of the words and update the freq array
        for(int i = 1; i < n; i++){
            int temp[] = new int[26];
            fillFreqArray(words[i], temp);

            for(int k = 0; k < 26; k++){
                freq[k] = Math.min(freq[k], temp[k]);
            }
        }

        // Collect the common characters based on the count array
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                for(int j = 0; j < freq[i]; j++){
                    result.add(Character.toString((char) (i + 'a'))); 
                    /* Convert a character to a string in Java
                    1. Using Character.toString()
                    2. Using String.valueOf()
                    3. Using String Concatenation
                    */
                }
            }
        }
        return result;
    }
    public static void fillFreqArray(String word, int freq[]){
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
    }
}
