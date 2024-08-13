class testarray{
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        //traversing array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //calculating average of the arraay elements
        float avg;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("average= "+avg);
    }
}