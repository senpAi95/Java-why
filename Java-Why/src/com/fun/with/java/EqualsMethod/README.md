# Equals

Two kinds of object equality...

Often in Java programs you need to compare two objects to determine if they are equal or not.  It turns out there are 
two different kinds of equality one can determine about objects in Java, reference equality or logical equality.  To 
explore the differences between these two kinds of equality examine the [Equals](Java-Why/src/com/fun/with/java/EqualsMethod/Equals.java)

The equality operator (==) compares the references (addresses in memory) of the two Strings as two different numbers 
- this is known as reference equality. 

Logical equality compares the data of the objects instead of the value of the references.
 The String class overrides the equals method it inherited from the Object class and implemented logic to compare the 
 two String objects character by character.
 

 The equals method inherited from Object performs reference equality!  Here is what the implementation of the equals method in Object looks like:
 
 `public boolean equals(Object other)
 {
    return this == other;
 }`
 
 If we have are overriding equals method, we have to override hashcode()
 
 You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the
 general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with 
 all hash-based collections, including HashMap, HashSet, and Hashtable.
 
 By default Java uses Objects.hash which internally uses Arrays.hashCode() which uses Object... This has 2 main consequences:
  Primitive values used in the hash code calculation have to be boxed, e.g. this.id is converted from long to Long.
  1. An Object[] has to be created to invoke the method.
  2. The cost of creating of these "unnecessary" objects may add up if hashCode is called frequently.