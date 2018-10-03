
# Specifications:

Class WordLinkedList has at least the following instance fields:

1) an integer to store the size of the list, i.e., the number of words;

2) a reference to the beginning of the linked list (a reference variable of type Node).

All instance fields are private.

Class WordLinkedList contains at least the following constructors:

• public WordLinkedList() - constructs an empty WordLinkedList (”empty” means
with zero words).

• public WordLinkedList(String[] arrayOfWords) - constructs a WordLinkedList
object and stores the words from arrayOfWords in the list. Pay attention to the
fact that the array passed to the constructor may contain duplicate words and
the words might not be sorted. On the other hand, the list is not allowed tocontain duplicates and the words have to be sorted in alphabetical order.

• public int getSize() - returns the size of this list (the number of words).

• public String getWordAt(int i) throws IndexOutOfBoundsException- returns
a new String object representing the word at position i in the list. Valid positions
are between 0 and n-1, inclusive, where n denotes the size of the list. If the input
index does not correspond to a valid position, an exception should be thrown.

• public void insert(String newword) - inserts newword in this WordLinkedList
if newword is not in the list. It does nothing if newword is already in this
WordLinkedList. Notice that, after an insertion is performed, the value of the
field storing the size of the list has to be updated. You may assume that the string
newword which is passed to method insert() consists only of lower case letters,
and no other characters.

• public int find(String word) - returns the position of word is in this WordLinkedList
or -1 if word is not in this WordLinkedList. Example: If this WordLinkedList
is {answer, bee, game, tea}, then after invoking find("game") the value 2 is
returned, while after invoking find("task") the value -1 is returned.

• public String remove(int i) throws IndexOutOfBoundsException - removes
the word at position i from this WordLinkedList and returns a new String object
representing the removed word if i is a valid position in the list; Otherwise,
an exception is thrown with an appropriate message. Not

• public void mergeTo(WordLinkedList that) - removes all the words from that
WordLinkedList and inserts them in this WordLinkedList. 

• public String toString() - returns a string representing the list, with the words
listed in alphabetical order, each word on a separate line.

# Note:
This repo also contains a simpler java program that sorts a list of words using arrays instead of linked lists.
