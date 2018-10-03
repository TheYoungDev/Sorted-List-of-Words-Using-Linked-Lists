

package testwordlist;
//import java.lang.String;

/**
 *
 * @author TYD
 */
public class WordLinkedList {
    private Node head;  
    private int listSize;

public int getSize(){
    return listSize;
}
public WordLinkedList(){
    head = new Node(null);
    listSize =0;
}
public WordLinkedList(String[] arrayOfWords){
    int i;
    head = new Node(null);
    for(i=0;i<arrayOfWords.length;i++){
      insert(arrayOfWords[i]); 
    }
}

public String getWordAt(int i){
 
        Node link = head.getNext();
        for (int k = 0; k < i; k++) {
            if (link.getNext() == null)
                return "java.lang.IndexOutOfBoundsException: This index is not valid!";
 
            link = link.getNext();
        }
        return link.getString();

}

public void insert(String newword) {
    
    
    int index=-1;

        Node link = head.getNext();
        for (int i = 0; i < listSize+1; i++) {

                 if(listSize==i){
                     index=i;
                     break;
                 }
                 if(newword.compareTo(link.word)==0){//same word
                   
                     return;
                 }
                  if((newword.compareTo(link.word)<0 )){
                      index =i;
                      break;
                  }
           link = link.getNext();
        }

    
    // Add to index
        if(index!=-1){
        Node Temp = new Node(newword);
        Node link2 = head;

        for (int i = 0; i < index && link2.getNext() != null; i++) {
            link2 = link2.getNext();
        }

        Temp.setNext(link2.getNext());
       
        link2.setNext(Temp);
        listSize++;
        }
}

public int find(String word){
        

        Node link = head.getNext();
        for (int i = 0; i < listSize+1; i++) {

                if(listSize==i){
                    
                    return -1;
                 }
                if(word.compareTo(link.word)==0){//same word
                     return i;
                 }

                  link = link.getNext();

        }
 return -1;
}
public String remove(int i)throws ArrayIndexOutOfBoundsException{
    String temp;
        if (i < 0|| i > listSize){
                 throw new ArrayIndexOutOfBoundsException();

        }
 
        Node link = head;
        for (int k = 0; k < i; k++) {

            link = link.getNext();
        }
        temp =link.getNext().word;
        link.setNext(link.getNext().getNext());
        listSize--; 
        return temp;
        
}
public void mergeTo(WordLinkedList that){

    int index=-1;
    int lastadded=0;
    int size;
    String newword;
    if(this.getSize()==0){
        for(int j=0;j<that.getSize();j++){
         Node link = this.head.getNext();
         newword=that.getWordAt(j);

        Node Temp = new Node(newword);
        Node link2 = this.head;

        for (int i = 0; i < j && link2.getNext() != null; i++) {
            link2 = link2.getNext();
        }
        Temp.setNext(link2.getNext());

        link2.setNext(Temp);
        listSize++;
        
      }
    }
    if(that.getSize()<=this.getSize()){
        
              
      for(int j=0;j<that.getSize();j++){
            Node link = this.head.getNext();
           newword=that.getWordAt(j);
        for (int i = lastadded; i < this.getSize()+lastadded; i++) {

                 if(newword.compareTo(this.getWordAt(i))==0){//same word
                
                      lastadded=i;
                      index=-1;
                     break;
                 }
                  if((newword.compareTo(this.getWordAt(i))<0 )){
                      index =i;
                      lastadded=i;

                      break;
                    
                  }
                  if(this.getSize()==i){
                     index=i;
                     lastadded=i;
                     break;
                 }
                  if((newword.compareTo(link.word)>0 )){
   
                  }
                  else{
                   
                  }
           link = link.getNext();
        }

        if(index!=-1){

        Node Temp = new Node(newword);
        Node link2 = head;

        for (int i = 0; i < index && link2.getNext() != null; i++) {
            link2 = link2.getNext();
        }

        Temp.setNext(link2.getNext());

        link2.setNext(Temp);
        listSize++;
        }
      }
    }
    if(that.getSize()>this.getSize()){
 for(int j=0;j<this.getSize();j++){
            Node link = that.head.getNext();
           newword=this.getWordAt(j);
        for (int i = lastadded; i < that.getSize()+lastadded; i++) {
           


                 if(newword.compareTo(that.getWordAt(i))==0){//same word
                   lastadded=i;
                   index=-1;
                     break;
                 }
                  if((newword.compareTo(that.getWordAt(i))<0 )){
                      index =i;
                      lastadded=i;

                      break;
                    
                  }
                  if(this.getSize()==i){
                     index=i;
                     lastadded=i;
                     
                     break;
                 }
                  if((newword.compareTo(link.word)>0 )){
             
                      
                  }
                  else{
                   
                  }
           link = link.getNext();
        }

        if(index!=-1){

        Node Temp = new Node(newword);
        Node link2 = that.head;

        for (int i = 0; i < index && link2.getNext() != null; i++) {
            link2 = link2.getNext();
        }

        Temp.setNext(link2.getNext());
      
        link2.setNext(Temp);
        listSize++;
        }
      }
    
    } 
    System.out.println("test1");
    //delete that
    for(int k=0;k<that.getSize();k++){
        that.remove(k);
    }
    if(that.getSize()>0){
    that.remove(0);}
}
public String toString() {
        String longString = "";
	if(listSize==0)
	    longString = "The list is empty";
        else{
            Node p=head.next;
	    longString = new String("");
            for (; p.next!= null ; p=p.next) {
                longString =longString +  p.word + "\n";          
            }//end for
            longString =longString +  p.word; 
        }
        return longString;
    }

}
class Node<E> {
    //String element ;
    Node<String> next ;
    String word;
    public Node (String e){
        word=e;
        next=null ;
    }
    public Node (String e , Node<String> n){
        word=e;
        next=n ;
    }
 

        public String getString() {
            return word;
        }
 
        public void setData(String d) {
            word = d;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextValue) {
            next = nextValue;
        }

}