KnapSack-DP
===========
During a robbery, a burglar nds much more loot than he had expected and has to decide what
to take. His bag (or knapsack) will hold a total weight of at most W pounds. There are n
items to pick from, of weight w1; : : : ;wn and dollar value v1; : : : ; vn. What's the most valuable
combination of items he can t into his bag?1
For instance, take W = 10 and
Item    Weight    Value
1         6        $30
2         3        $14
3         4        $16
4         2         $9
There are two versions of this problem. If there are unlimited quantities of each item available,
the optimal choice is to pick item 1 and two of item 4 (total: $48). On the other hand,
if there is one of each item (the burglar has broken into an art gallery, say), then the optimal
knapsack contains items 1 and 3 (total: $46).

Reference: http://www.cs.berkeley.edu/~vazirani/algorithms/chap6.pdf page 181

I have implemented both the versions in the java file. I have also given the table in the comment section for better understanding of how dynamic programming works.
