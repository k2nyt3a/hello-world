public class wHatIsThIssEvenDoing{
  
  public static void main(String[] args){
    int[] numbrz = {5, 2, 8, 1, 3};
    sortz(numbrz);
    for(int i=0;i<numbrz.length;++i)
    System.out.println(numbrz[i])
  }

  
  public static void sortz(int[] wat){ 
    for(int i=0;i<wat.length;i++){
      for(int j=0;j<wat.length;j++){
        if(wat[i]<wat[j]){
          int tmp = wat[i];
          wat[i]=wat[j];
          wat[j]= tmp;
        }
      }
    }
  }
}
