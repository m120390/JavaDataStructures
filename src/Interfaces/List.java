package Interfaces;


public interface List<E>  {

        /**
         * Appends the specified element to the end of this List
         * @param element - element to be inserted
         */
        //void add(E element);

        /**
         * Inserts the specified element at the specified position in this List
         * @param element - element to be inserted
         * @param index - index at which the specified element is to be inserted
         * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
         */
        //void add(E element, int index);

        /**
         * Returns true if this List contains the object
         * @param o - the object to be searched for in the List
         * @return true if the List contains the object
         */
        //boolean contains(Object o);

        /**
         * Returns the element at the specified index
         * @param index - index of the element to return
         * @return the element at the specified index in the List
         * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
         */
        //E get(int index);

        /**
         * Returns true if the List contains no elements
         * @return true if the List contains no elements
         */
        //boolean isEmpty();

        /**
         *
         * @param index - index of the element to be removed from the List
         * @return element at the index that was removed
         * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
         */
        //E remove(int index);

        /**
         * Replaces the element at the specified position in this List with specified element
         * @param element - element to be placed in specified position
         * @param index - index at which specified element is to be placed
         * @return the element that previously existed in the specified position
         * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
         */
        //E set(E element, int index);

        /**
         * Returns the number of elements in this List
         * @return the number of elements in this List
         */
        //int size();

}