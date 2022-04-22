package week07;

public class deneme {
    public static void main(String[] args) {

        String word="hwguhv";
        String result="";
        int count=0;

        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char ch2=word.charAt(j);
                if(ch==ch2){count++;}
                result += count;
            }

            if(result.contains(""+ch)){
                continue;
            }

        }

        System.out.println(""+result);

    }
}
/*
 String word="hwguhv";
        String result="";
        int count=0;

        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char ch2=word.charAt(j);
                if(ch==ch2){count++;}
                result=ch+count+"";
            }

            if(result.contains(ch+"")){
                continue;
            }

        }

        System.out.println(result+"");
 */