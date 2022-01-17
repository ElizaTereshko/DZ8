import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        method(a);
        System.out.println(a.charAt(a.length() - 1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replace('a', 'o'));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(a.indexOf("Java"), 11));

        String c = "кок димона едет на шалаш аквалангист";
        String[] massive = c.split(" ");
        for (int i = 0; i < massive.length; i++) {
            String[] arr = massive[i].split("");
            String res = "";
            for (int j  = arr.length -1; j >=0; j--) {
                res = res + arr[j];
            }
                if (massive[i].equals(res)) {
                    System.out.println(res);
            }
        }

        for (int i = 0; i < massive.length; i++) {
            if (massive[i].length() >= 3 && massive[i].length() <= 5) {
                System.out.println(massive[i]);
            }
        }

        String min="";
        String max="";
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i+1].length() <= massive[i].length()) {
                min = massive[i+1];
            }
        }
        System.out.println(min);

        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i+1].length() >= massive[i].length()) {
                max = massive[i+1];
            }
        }
        System.out.println(max);

        StringBuilder str = new StringBuilder("3 + 56 = ");
        System.out.println(str.append("59"));
        str.setLength(9);
        System.out.println(str.replace(2, 3, "-").append("-53"));
        str.setLength(9);
        System.out.println(str.replace(2, 3, "*").append("168"));

        String firstWord = "крем";
        String secondWord = "тумбочка";
        System.out.println(firstWord.substring(0, firstWord.length()/2) + secondWord.substring(secondWord.length()/2));

        String haha = "Сова семь ухо ели";
        String [] arr = haha.split(" ");
        arr[0] = arr[0].substring(0, arr[0].length() - 1);
        arr[1] = arr[1].substring(0, arr[1].length() - 1);
        char [] array = arr[2].toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        arr[2] = result;
        System.out.println(arr[0] + arr[1] + " " + arr[2] + arr[3]);
        }

    static void method (String b){
    }
}
