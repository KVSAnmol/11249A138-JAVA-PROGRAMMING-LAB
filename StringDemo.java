public class StringDemo {
    public static void main(String[] args){
        String str="java programming";
        System.out.println("Original String:" +str);
        System.out.println("length:" +str.length());
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("Substring:"+str.substring(5,16));
        System.out.println("contains 'java :" +str.contains("java"));
    }
    
}
