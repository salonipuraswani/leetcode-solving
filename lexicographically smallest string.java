class HelloWorld {
    public static void main(String[] args) {
        String s1="ABCA";
        String s2="FFFT";
        System.out.println(ans(s1,s2));
    }
    public static String ans(String s1,String s2){
        String s=new String();
        int L1=s1.length();
        int L2=s2.length();
        int size=L1+L2-1;
        char arr[]=new char[size];
        for(int i=0;i<size;i++){
            arr[i]='A';
        }
        int flag=0;
        for(int i=L2-1;i>=0;i--){
            if(s2.charAt(i)=='T'){
                if(i+L1-1<size){
                    flag=1;
                    for(int j=0;j<L1;j++){
                        arr[i+j]=s1.charAt(j);
                    }
                    break;
                }
            }
        }
        if(flag==0){
            return "-1";
        }
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        return s;
    }
}
