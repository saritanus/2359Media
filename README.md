# 2359Media

A.1. Can you implement the sing() method for the bird? a. How did you unit test it?  b. How did you optimize the code for maintainability? (Ask yourself the same question for all following exercises)

<i>Assumption: </i>
    All birds can sing. This is a default characteristic of all birds.
    
A.2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound? a. A duck says: “Quack, quack” b. A duck can swim c. A chicken says: “Cluck, cluck” d. A chicken cannot fly (assumption: its wings are clipped but ignore that)

<i>Assumption:</i> Chicken can't fly.

A.3.  Now how would you model a rooster? a. A rooster says: “Cock-a-doodle-doo” b. How is the rooster related to the chicken? c. Can you think of other ways to model a rooster without using inheritance?

<i>Assumption: </i>Rooster is a bird and its type of chicken which makes a different noise.</i>

A.4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.  a. A parrot living with dogs says: “Woof, woof” b. A parrot living with cats says: “Meow” c. A parrot living near the rooster says: “Cock-a-doodle-doo” d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently

<b>I have used a bridge pattern here, so we jut need to implement two class ParrotWithPhone or ParrotWithDuck to support both the sounds.</b>

B.1. In addition to the birds, can you model a fish?
 a. Fishes don’t sing 
 b. Fishes don’t walk 
 c. Fishes can swim 
 