public class Exam6 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==1&&j==2&&j==3&&j==4&&j==5&&j==6&&j==7&&j==8&&j==9){
                    System.out.println(" "+i*j+" ");
                }else {
                    System.out.print(i*j+" ");
                }
        
            }
            System.out.println();
        }
    }
}
