#### Generics 2

Implement the `findNumberClasses` method to take a list of any subtypes of `java.lang.Number`, including
lists which include different subtypes.

The method must return a `List` of classes, containing (in order) the declared type of 
the numbers in the input array.

**Imports:** 
* `java.util.ArrayList`
* `java.util.Collections`
* `java.util.List`

##### Example

Types are in brackets: `(Integer)`

Inputs:  
`List<>((Double) 1.5, (Integer) 4)`  

Ouput:
`List<>((Class) java.lang.Double, (Class) java.lang.Integer)`
