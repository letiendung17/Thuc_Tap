public class dowhileChangller {
    public static void main(String[] args) {
int i = 5;
int demC = 0;
int deml = 0;
while(i < 26){
    if(demC == 5)
        break;
  if(isEvenNumber(i)){
      System.out.println(i);
      demC ++;
  }
  deml ++;
  i++;
}

System.out.println("Tong so chan và s le trong chuoi "+demC+" "+deml);

    }
    public static boolean isEvenNumber(int number){
        if(number %2==0 || number == 0){
            return true;
        }else
            return false;
    }

}
