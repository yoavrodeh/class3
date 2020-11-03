---
### Question (from a test)

`Node` is used in a linked list of priced items: 
@code[java code-max code-noblend](src/Node.java)
@[1-11](How would you write a `getTotalCost` method?)
@[13-16](Note that we call `getCost` and do not recalculate.)


---

Write a subclass of `Node` called `Node2`, where each item also has an integer quantity. Make sure that `getCost` and `getTotalCost` work well.

---
@code[java code-max code-noblend](src/Node2.java)
What about `getTotalCost`? 
@css[fragment](*no need to change it from what we inherit!*)
