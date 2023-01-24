package p1;

public class hs {
  

  

        int[] input ={1,0,0,0,1,1,1,1};
        int[] hamput=new int[input.length+5];
        
   

public int[] make_code_word(){
    int[] ham=this.hamput;
    int length1=input.length;
    for (int i = 1; i < ham.length; i++) {
        int x=length1-1;
        if(i%2!=0){
                if((input[0]+input[1]+input[3]+input[4]+input[6])%2==0){
                    hamput[0]=0;
                }
                else{
                    hamput[0]=1;}
               if((input[0]+input[2]+input[3]+input[5]+input[6])%2==0){
                hamput[1]=0;
            }
               else{
                   hamput[1]=1;}
               if((input[1]+input[2]+input[3]+input[7])%2==0){
                    hamput[3]=0;
          }
               else{
                   hamput[3]=1;}
            if((input[4]+input[5]+input[6]+input[7])%2==0){
                hamput[7]=0;
            }

            else{
                hamput[7]=1;}


        }
        else {
            hamput[i-1]=input[length1-x];
            --x;
        }
       System.out.print(hamput[i]+" ");
    }
    return ham;
}}




