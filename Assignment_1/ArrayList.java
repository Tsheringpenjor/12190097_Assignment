public class ArrayList{
    int max;
    static int size;
    int t;
    int [] array;
    //Constructor
    public ArrayList(){
        max = 4;
        size = 0;
        t = -1;
        array = new int[max];
    }
    // adding element in array.
    public void add(int ele){
        if (size==0){
                array[0]=ele;
                t = 0;
        }
        else{
            array[t+1]=ele;
            t = t + 1;
        }
        size = size+1;
        System.out.println(" "+ele);
         System.out.println(" ");
    }
    //removing element in array
    public void pop(){
        if (size==0){
            System.out.println( "Array is already empty!");
        }
        else{
            t = t-1;
            size = size-1;
        }
    }
    //Size of array
    public int size(){
        return size;
    }
    //Resizing array that is if the array is 1/4 it is made into half and if array is 3/4 or full array size is doubled.
    //Array remain same if the array element is 2/4.    
    public void resize(){
        if (size()==3 || size()==4) {
            int temp[] = new int[max*2];
            for(int i = 0; i < array.length; i ++){
                temp[i] = array[i];
            }
            max = max*2;
            size = max;
            array = temp;
            for(int j : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else if (size()==1){
            int temp[] = new int[max/2];
            for(int i = 0; i < array.length/2; i ++){
                temp[i] = array[i];
            }
            size = max/2;
            array = temp;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else{
            size = max;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
       
    }

    //main method
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        System.out.println("The Size of array is before adding: "+obj.size());
        obj.add(3);
        //obj.add(7);
        //obj.add(6);
        //obj.add(5);
        //obj.pop();
        
        obj.resize();
        System.out.println("The Size of Array is now: "+obj.size());   
    }
}
   