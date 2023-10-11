package Step1;

import java.util.*;

//최소최대
public class Main {

    public HashMap<String, Object> solution(int[] arr){
        HashMap<String,Object>  result = new HashMap<>();


        int index = 0;
        int min = 0;
        int max = 0;

        for(int e : arr){

            if(index == 0){
                min = e;
                max = e;
            }

            if(e <= min){
                min = e;
            }

            if(e > max){
                max = e;
            }

            index++;
        }


        result.put("min",min);
        result.put("max",max);
        return result;
    }




    public static void main(String[] args) {

        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int[] arr = new int[str];

        for(int i=0;i<str;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<String,Object> result = m.solution(arr);
        System.out.println(result.get("min") + " " + result.get("max"));

    }


}