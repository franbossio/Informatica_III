public class Parcial2021_2 {

    public static void main(String[] args) {
        char [] a = {'a', 'e', 'h','j','o'};
        System.out.println(vocales(a, 0));
    }

    static int vocales(char [] a, int index){
        if(index==a.length){
            return 0;
        }else{
            if(a[index]=='a'||a[index]=='e'||a[index]=='i'||a[index]=='o'||a[index]=='u'){
                return 1+vocales(a, index + 1);
            }else{
                return vocales(a, index + 1);
            }
        }
    }
}