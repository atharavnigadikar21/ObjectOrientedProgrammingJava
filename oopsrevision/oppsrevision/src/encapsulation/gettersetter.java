package encapsulation;

class Demo {
    public static void main(String[] args) {
    
        int arr[] = {2,5,1,7,10};
        int maxlength = 0;
        int k = 14;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <arr.length ; j++) {
                sum = sum + arr[j];
                if(sum<=k){
                    maxlength = Math.max(maxlength,j-i+1);
            }
        }
        }
        System.out.println(maxlength);
   
    }

}