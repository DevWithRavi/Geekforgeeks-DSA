class Solution {
    public static int countDigits(int n) {
        // Code here
                    int cnt=0;
                    while(n!=0){
                        n=n/10;
                        cnt++;
                    }
                    return cnt++;
                }
                public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Entyer the size of array");
                    int n=sc.nextInt();
                    int ans=countDigits(n);
                    System.out.println(ans);
                }
}

