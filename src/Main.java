class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2 || numRows>=s.length()){
            return s;
        }
        char[] c = s.toCharArray();

        int start = 0;
        char[][] table = new char[c.length][numRows];

       for(int i=0;i<table.length;i++){
           for(int j=0;j<table[0].length;j++){
               table[i][j] = ' ';
           }
       }
        int i = 0;
        int pos1 = 0;
        int pos2 = numRows -2; 
        while (start != c.length){
            if (i % (numRows-1) == 0){
                table[i][pos1] = c[start];
                start++;
                pos1++;
                if(pos1==numRows){
                    pos1=0;
                    i++;
                }
            }else{
                table[i][pos2] = c[start];
                pos2--;
                start++;
                if(pos2==0){
                    pos2 = numRows-2;
                }
                i++;
            }
        }

        String r ="";
        for (int j = 0 ; j< numRows ; j ++){
            for (int i2 = 0; i2 < table.length ; i2++){
                if( table[i2][j] != ' '){
                    r = r + table[i2][j];
                }
            }
        }
        return r;
    }

}








