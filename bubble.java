public class bubble {
    static void bubbleSort(int array[]){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int array[]={6,0,3,5,7,6};
        bubbleSort(array);
        for(int i :array){
        System.out.println(i+"");
        }
    }
    
}
