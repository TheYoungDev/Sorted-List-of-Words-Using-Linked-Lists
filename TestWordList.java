
package testwordlist;

/**
 *
 * @author TYD
 */
public class TestWordList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // inputs start )
        
        
        String[] set1={"apple", "bat", "cat", "dumb"}; //correct order
	String[] set2={"sat", "the", "at","form", "zoo"}; //middle to front
        String[] set3={"another","boat","sails","far"};//back to middle
        String[] set4={"fight", "four","joke","hat", "helloworld", "marc", "might", "too","yup",  "an"};//back to front

	String c1="Test";
         
        System.out.println("*************************************************************");
        WordList List1= new WordList(8);
         System.out.println("Test 1 WordList(8) "+ List1.toString());
         System.out.println("capacity="+List1.getCapacity());
         System.out.println("size="+List1.getSize());
        
        System.out.println("*************************************************************");
          WordList List2= new WordList(set1);
         System.out.println("Test 2 correct order "+ List2.toString());
         System.out.println("capacity="+List2.getCapacity());
         System.out.println("size="+List2.getSize());
         
        System.out.println("*************************************************************");
         WordList List3= new WordList(set2);
         System.out.println("Test 3 middle to front multiple errors"+ List3.toString());
         System.out.println("capacity="+List3.getCapacity());
         System.out.println("size="+List3.getSize());
         
        System.out.println("*************************************************************");
         WordList List4= new WordList(set3);
         System.out.println("Test 4 back to middle "+ List4.toString());
         System.out.println("capacity="+List4.getCapacity());
         System.out.println("size="+List4.getSize());
         
        System.out.println("*************************************************************");
         WordList List5= new WordList(set4);
         System.out.println("Test 5 back to front"+ List5.toString());
         System.out.println("capacity="+List5.getCapacity());
         System.out.println("size="+List5.getSize());
        
           
        System.out.println("*************************************************************");
         System.out.println("Test 6 find error"+ List3.find("helloworld"));
         System.out.println("Test 7 remove error");
         List1.remove("helloworld");
          
        System.out.println("*************************************************************");  
         List1.insert("heyworld");
         System.out.println("Test 8 insert empty list"+ List1.toString());
         System.out.println("capacity="+List5.getCapacity());
         System.out.println("size="+List5.getSize());
         
        System.out.println("*************************************************************");
        System.out.println("Test 9 insert more than cap");
        WordList List10= new WordList(2);
        
        for(int i=0;i<4;i++){
            List10.insert(c1);
            c1=c1+"a";
        }
        System.out.println(List10.toString());
        
        System.out.println("*************************************************************");
          //listObj2=new WordList(words2);
        try{
            System.out.println("Test 10 valid index");
            System.out.println(List2.getWordAt(0));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

        System.out.println("*************************************************************");
        try{
            System.out.println("Test 11 invalid index");
            System.out.println(List1.getWordAt(25));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

        System.out.println("*************************************************************");
         try{
            System.out.println("Test 12 invalid index < 0");
            System.out.println(List1.getWordAt(-5));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
         
        System.out.println("*************************************************************");
         System.out.println("Test 13 find index "+ List3.find("form"));
         
         List3.remove("the");
        
        System.out.println("*************************************************************");
         System.out.println("Test 14 remove the"+ List3.toString());
         System.out.println("capacity="+List3.getCapacity());
         System.out.println("size="+List3.getSize());
         
         
        System.out.println("*************************************************************");
         System.out.println("Test 15 remove error\n"+ List3.toString());
         List3.remove("the");
         System.out.println("capacity="+List3.getCapacity());
         System.out.println("size="+List3.getSize());
        
        System.out.println("*************************************************************");
        System.out.println("Test 16 sublist accross init and fin");
        WordList List6= new WordList(set4);
        WordList List7=List6.sublist('g','s');
        System.out.println("sublist: \n"+List7.toString());
        System.out.println("capacity="+List7.getCapacity());
        System.out.println("size="+List7.getSize());
        
        System.out.println("*************************************************************");
        List1.remove("heyworld");   
        System.out.println("Test 17 sublist empty test ");
        WordList List8=List1.sublist('g','k');
        System.out.println("sublist: \n"+List8.toString());
        System.out.println("capacity="+List8.getCapacity());
        System.out.println("size="+List8.getSize());
        
        System.out.println("*************************************************************");
        System.out.println("Test 18 sublist contains init not fin ");
        List8=List6.sublist('f','g');
        System.out.println("sublist: \n"+List8.toString());
        System.out.println("capacity="+List8.getCapacity());
        System.out.println("size="+List8.getSize());
              
        System.out.println("*************************************************************");  
        System.out.println("Test 19 sublist contains fin not init  ");
        List8=List6.sublist('g','h');
        System.out.println("sublist: \n"+List8.toString());
        System.out.println("capacity="+List8.getCapacity());
        System.out.println("size="+List8.getSize());
         
        System.out.println("*************************************************************");       
        System.out.println("Test 20 sublist contains fin and init ");
        List8=List6.sublist('f','j');
        System.out.println("sublist: \n"+List8.toString());
        System.out.println("capacity="+List8.getCapacity());
        System.out.println("size="+List8.getSize());
     
    }//end main
}//end class
