#Problem
You are to design and implement a Menu class, and associated iterator classes, that maintains a
collection of MenuItem objects. A MenuItem object contains the following information about each
menu item of a particular restaurant.
   Item name (e.g., “prime rib”, “key lime pie”)
   Category (appetizer, main dish, dessert)
   Heart healthy (yes or no)
   Price


The Menu class must provide getter (factory) methods for producing the following types of iterators:
     AllItemsIterator
      Iterates over all of the items on the menu
     ItemIterator
      Iterates over a specified item type
      (appetizer, main dish, or dessert)
     HeartHealthyIterator
      Iterates over the heart healthy items on the menu
     PriceIterator
      Iterates over the main dishes that are under a specified price
