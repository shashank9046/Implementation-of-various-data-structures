import java.util.Scanner;

public class arraydatastructure implements arraystructure {
    private int end;
    public int getend() {
        return end;
    }
    public void setend(int end) {
        this.end = end;
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        arraydatastructure obj = new arraydatastructure();
        int task =10;
        System.out.println("*****************************************");
        System.out.println("enter 1 to insert at beginning");
        System.out.println("enter 2 to insert at last");
        System.out.println("enter 3 to delete from beginning");
        System.out.println("enter 4 to delete from last");
        System.out.println("enter 5 to insert at some specific position");
        System.out.println("enter 6 to delete at some specific position");
        System.out.println("*****************************************");
        while(task>0) {
            System.out.println("enter your choice");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter data to insert at beginning");
                    int data= sc.nextInt();
                    if(obj.isempty(array, obj.getend())) {
                        int m=obj.insertatbeginning(array, data, obj.getend());
                        obj.displayarray(array, m);
                        obj.setend(m);
                    }
                    break;
                case 2:
                    System.out.println("enter data to insert at last");
                    int data2=sc.nextInt();
                    if(obj.isempty(array, obj.getend())) {
                        int h=obj.insertatlast(array, data2,obj.getend());
                        obj.displayarray(array,h);
                        obj.setend(h);
                    }
                    break;
                case 3:

                    int y=obj.deleteatbeginning(array,obj.getend());
                    System.out.println("deleted from beginning");
                    obj.displayarray(array, y);
                    obj.setend(y);
                    break;
                case 4:
                    int g=obj.deleateatlast(array,obj.getend());
                    System.out.println("deleted from last");
                    obj.displayarray(array,g);
                    obj.setend(g);
                    break;
                case 5:
                    System.out.println("enter data to insert at some specific position");
                    int data3 = sc.nextInt();
                    System.out.println("enter position to insert ");
                    int position2 = sc.nextInt();
                    obj.insertatposition(array, position2, data3);
                    obj.displayarray(array, obj.getend());
                    break;
                case 6:
                    System.out.println("enter data to delete at some specific position");
                    int data4 = sc.nextInt();
                    System.out.println("enter position to delete ");
                    int position4 = sc.nextInt();
                    obj.deleteatposition(array, position4, data4);
                    obj.displayarray(array, obj.getend());
                    break;
                case 7:
                    System.out.println("here is your current array");
                    obj.displayarray(array,obj.getend());
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
            task--;
        }
        sc.close();
    }



    @Override
    public int insertatbeginning(int[] arr, int data, int count) {
        // TODO Auto-generated method stub
        for(int i=count;i>0;i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=data;
        count++;
        System.out.println(count);
        return count;
    }

    @Override
    public int insertatlast(int[] arr, int data, int count) {
        // TODO Auto-generated method stub
        arr[count]=data;
        count++;
        return count;
    }

    @Override
    public int deleteatbeginning(int[] arr, int count) {
        // TODO Auto-generated method stub
        for(int i=0;i<count;i++) {
            arr[i]=arr[i+1];
        }
        count--;
        return count;
    }

    @Override
    public int deleateatlast(int[] arr, int count) {
        // TODO Auto-generated method stub
        arr[count-1]=0;
        count--;
        return count;
    }

    @Override
    public boolean isempty(int[] arr,int count) {
        // TODO Auto-generated method stub
        if (count<arr.length) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isfull(int[] arr,int count) {
        // TODO Auto-generated method stub
        if (count>=arr.length) {
            return true;
        }
        return false;

    }



    @Override
    public int[] insertatposition(int[] arr, int position, int data) {
        // TODO Auto-generated method stub
        for(int i=arr.length-1;i>=position;i--) {
            arr[i]=arr[i-1];
        }
        arr[position-1]=data;
        return arr;
    }



    @Override
    public int[] deleteatposition(int[] arr, int position, int data) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==data) {
                flag=true;
            }
        }
        if(flag) {
            for(int i=position;i<arr.length;i++) {
                arr[i-1]=arr[i];
            }
        }
        else {
            System.out.println("not present");
        }
        return null;
    }



    @Override
    public void displayarray(int[] arr,int count) {
        // TODO Auto-generated method stub
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("total no of elements is " + count);
    }
}
