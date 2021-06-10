# Lists

Structure | Add | Remove | Get | Contains | Data Structure
--- | --- | --- | --- | --- | ---
ArrayList | O(1) | O(n) | O(1) | O(n) | Array
LinkedList | O(1) | O(1) | O(n) | O(n) | Linked List
CopyonWriteArrayList | O(n) | O(n) | O(1) | O(n) | Array

# Sets

Structure | Add | Contains | Next | Data Structure
--- | --- | --- | --- | ---
HashSet | O(1) | O(1) | O(h/n) | Hash Table
LinkedHashSet | O(1) | O(1) | O(1) | Hash Table + Linked List
EnumSet | O(1) | O(1) | O(1) | Bit Vector
TreeSet | O(log n) | O(log n) | O(log n) | Red-Black Tree
CopyonWriteArraySet | O(n) | O(n) | O(1) | Array
ConcurrentSkipList | O(log n) | O(log n) | O(1) | Skip List

# Queues

Structure | Offer | Peak | Poll | Size | Data Structure
--- | --- | --- | --- | --- | ---
PriorityQueue | O(log n) | O(1) | O(log n) | O(1) | Priority Heap
LinkedList | O(1) | O(1) | O(1) | O(1) | Array
ArrayDequeue | O(1) | O(1) | O(1) | O(1) | Linked List
ConcurrentLinkedQueue | O(1) | O(1) | O(1) | O(n) | Linked List
ArrayBlockingQueue | O(1) | O(1) | O(1) | O(1) | Array
PriorityBlockingQueue | O(log n) | O(1) | O(log n) | O(1) | Priority Heap
SynchronousQueue | O(1) | O(1) | O(1) | O(1) | None
DelayQueue | O(log n) | O(1) | O(log n) | O(1) | Priority Heap
LinkedBlockingQueue | O(1) | O(1) | O(1) | O(1) | Linked List

# Map

Structure | Add | Contains | Next | Data Structure
--- | --- | --- | --- | ---
HashMap | O(1) | O(1) | O(h/n) | Hash Table
LinkedHashMap | O(1) | O(1) | O(1) | Hash Table + Linked List
IdentityHashMap | O(1) | O(1) | O(h/n) | Array
WeakHashMap | O(1) | O(1) | O(h/n) | Hash Table
EnumMap | O(1) | O(1) | O(1) | Array
TreeMap | O(log n) | O(log n) | O(log n) | Red-Black Tree
ConcurrentHashMap | O(1) | O(1) | O(h/n) | Hash Tables
ConcurrentSkipListMap | O(log n) | O(log n) | O(1) | Skip List
