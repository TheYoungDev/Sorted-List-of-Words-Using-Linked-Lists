

package testwordlist;
import java.lang.String;

/**
 *
 * @author TYD
 */
public class WordList {
    private int listSize;
    private int caps;
    private String[] listArray;
    
    public WordList(int capacity){
     listArray = new String[capacity];
      caps = capacity;
    }
    public WordList(String[] arrayOfWords){
    caps=arrayOfWords.length*2;    
    listArray= new String[caps];
    listSize=0;
  
   
    for(int i=0;i<arrayOfWords.length;i++){
         if(arrayOfWords[i]==null){
             break;
         }
        insert(arrayOfWords[i]);
      ;
    }

          
    }
     public int getSize(){
         return listSize;
     }
     public int getCapacity(){
       return caps;  
     }
    public String getWordAt(int i){
        if(i<0||i>listSize-1){
            throw new ArrayIndexOutOfBoundsException();
          
        }
        else{
           return listArray[i];  
        }
         
    }
    
    public void insert(String newword) {
        listSize++;

         if(newword==null){
             return;
         }
        if(listSize>caps){
        
          
        String[] temp1=new String[caps*2];
        for(int f=0;f<listSize-1;f++){
            temp1[f]=listArray[f];
           
        }
        listArray=new String[caps*2];
        for(int f=0;f<listSize-1;f++){
            listArray[f]=temp1[f];
            
        }
        caps*=2;
        }
     
        String[] temp2=new String[listSize+1];
        for(int h=0;h<listSize-1;h++){
            temp2[h]=listArray[h];
           
        }
             int myplace=100,i,j,k=0,h=0;
            
             for(i =0;i< listSize;i++){
               
             
                 if(listArray[i]==null){
                     listArray[i]=newword;
                     return;
                 }
                 else if(newword.compareTo(listArray[i])==0){//same word
                   
                     listSize--;
                     return;
                 }
              
                  else if((newword.compareTo(listArray[i])<0 )){
              
                   myplace =i;  
            
                   break;
                 }

             }
                   k=0;
                 for(j =0;j< listSize-1;j++){
                     if(j==myplace){   
                      k++;
                     }

                   listArray[k]=temp2[j];
                     k++;
                 }
                
                 listArray[myplace]=newword;
            
    }
    public int find(String word){
    int low = 0;
    int high = listSize;
    int mid=-1;
    while (low <= high) {
        mid = (low + high) / 2;
        if ((word.compareTo(listArray[mid])<0 )){ 
            high = mid - 1;
        } else if((word.compareTo(listArray[mid])>0 )){
            low = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
         
    
    public void remove(String word){
        
        if(listArray[0]==null){
            return;
        }
       int i= find(word);
    
       if(i>=0){
           while(listArray[i+1]!=null){
         
           listArray[i]=listArray[i+1];
         
                    i++;
                   }
           listSize--;
           
       }
    }

    public String toString() {
        String longString = "";
	if(listSize==0)
	    longString = "The list is empty";
	else
	    longString = listArray[0];
        for (int i = 1; i < listSize; i++) {
            longString =longString + "\n" + listArray[i];
        }
        return longString;
    }
    public WordList sublist(char init, char fin){
        String[] temp;
        int size=0;
        for(int i=0;i<listSize;i++){
           if((listArray[i].charAt(0))>=init && listArray[i].charAt(0)<=fin){
                size++;
                 }
           
            }
        temp=new String[size];
       size=0;
         for(int i=0;i<listSize;i++){
           if((listArray[i].charAt(0))>=init && listArray[i].charAt(0)<=fin){
                temp[size]=(listArray[i]);
                size++;
                
                 }
         }
          

            
    
       return new WordList(temp);
    }
    
}
