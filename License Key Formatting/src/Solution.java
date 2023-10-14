
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String result="";
        s=s.replace("-","").toUpperCase();
        int numParts=s.length()/k;
        int firstPart=k;
        if(s.length()%k!=0){
            numParts=s.length()/k+1;
            firstPart=s.length()%k;
        }
        if(!s.isEmpty()){
            result = s.substring(0,firstPart);
            int index=firstPart;
            for(int i=2;i<=numParts;i++){
                result+= "-" + s.substring(index,index+k);
                index=index+k;
            }
        }
        return result;
    }
}