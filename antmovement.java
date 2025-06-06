public class AntMovement {
    public int countReturnsToOrigin(int[] A) {
        int position = 0;
        int count = 0;
        for(int move : A){
            position += move;
            if(position == 0) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[]args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter moves seperated by space(1 or -1):");
        String[] inputs = sc.nextLine().trim().split("\\s+");
        int[] A = new int[inputs.length];
        for(int i = 0; i < inputs.length; i++) {
            A[i] = Integer.parseInt(inputs[i]);
        }
        
        int result = countReturnsToOrigin(A);
        System.out.println("Number of times ant returns to origin: " + result);
    }
}
