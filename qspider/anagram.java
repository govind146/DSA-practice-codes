package qspider;

public class anagram {

    public static void main(String[] args) {
        String string_1="cars",string_2="scar";
        int array[]=new int[129];

        if(string_1.length()!=string_2.length()){
            System.out.println("not an Anagram");
        }
        else{
        for(int i=0;i<string_1.length();i++){
            int lq=string_1.charAt(i);
            array[lq]++;
            int lw=string_2.charAt(i);
            array[lw]--;

        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                System.out.println("Not an Anagram");
                break;
            }   
        }
            System.out.println("Is an Anagram");
    }

    }
}
