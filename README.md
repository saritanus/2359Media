# Media

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

B.2. Can you specialize the fish as a Shark and as a Clownfish? a. Sharks are large and grey b. Clownfish are small and colourful (orange) c. Clownfish make jokes d. Sharks eat other fish

B.3. 3. Dolphins are not exactly fish, yet, they are good swimmers a. Can you model a dolphin that swims without inheriting from a fish class? b. How do you avoid duplicating code or introducing unneeded overhead? 

<i>Duplicate codes are already removed by design.</i>

D.1. Can you model a butterfly? a. A butterfly can fly b. A butterfly does not make a sound

E. Suppose you have an array of animals, e.g.  
    Animal[] animals = new Animal[]{         new Bird(),         new Duck(),         new Chicken(),         new Rooster(),         new Parrot(),         new Fish(),         new Shark(),         new Clownfish(),         new Dolhpin(),         new Frog(),         new Dog(),         new Butterfly(),         new Cat() }; 
    Note: The above instantiation may be different if you chose to set up your object model differently… (hopefully you did) 
    
   1. Can you share the code to count: a. how many of these animals can fly? b. how many of these animals can walk? c. how many of these animals can sing? d. how many of these animals can swim? 
  
  <i>Assumptions</i>
  1. All birds can't fly.
  2. All birds can sing and walk.
  3. All fish can swim and duck.
  4. All butterfly can fly.
  5. Frog can only jump. 
 
