public interface arraystructure {
    int insertatbeginning(int[] arr,int data,int count);
    int insertatlast(int[] arr,int data,int count);
    int deleteatbeginning(int [] arr,int count);
    int deleateatlast(int[] arr,int count);
    int []insertatposition(int[] arr,int position, int data);
    int []deleteatposition(int[] arr,int position,int data);
    boolean isempty(int [] arr,int count);
    boolean isfull(int [] arr,int count);
    void displayarray(int[] arr,int count);
}

