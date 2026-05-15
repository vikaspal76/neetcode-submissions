class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int i=0;
        int j=0;

        while(i<word.length() && j<abbr.length()){

            char ch_abr=abbr.charAt(j);
            char ch_word=word.charAt(i);
            if(Character.isDigit(ch_abr)){
                if(ch_abr=='0') return false;
                int num=0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                        num=num*10+(abbr.charAt(j)-'0');
                        j=j+1;
                }
                i=i+num;
            }
            else if(ch_abr!=ch_word) return false;
            else{
                i++;
                j++;
            }
        }

        return i==word.length() && j==abbr.length();
    }
}