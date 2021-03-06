学习笔记

总结：
----------------------------------------------------------------------------


数组

特点：数组插入删除缓慢查询较快。

时间复杂度： 插入删除时间复杂度最好情况为O（1），最坏情况的时间复杂度是O（n)，查询的时间复杂度为O（1）。

空间复杂度：O（N）

链表

特点：链表插入删除快，查询慢

时间复杂度： 查询时间复杂度最好情况为O（1），最坏情况的时间复杂度是O（n)，插入删除的时间复杂度为O（1）

空间复杂度：O（N）

备注：在java中LinkedList是个双向不循环链表

跳表

前提：只能用于元素有序的情况下

说明： 跳表对标的是平衡树和二分查找，但出现比较晚，常用于redis中

特征：插入删除搜索的时间复杂度为O（logN)

插入删除的时间复杂度说明：本来链表插入时间复杂度为O（1）但是他需要维护深度的记载关系。

搜索时间复杂度说明：本来链表的搜索查找的时间复杂度为O（n)但是有了深度的关系的记载所以只需遍历高度就行。

空间复杂度：O（N）

LRU查看文章即可，redis也是

---------------------------------------------------------------------





stack（底层是数组，继承vector)

特征：先进后出

api:

 empty()

 

peek()  

 

pop()  

 

push(E item) 

search(Object o)

Queue(接口）

特征：先进先出

api:

add(e)         offer(e)

remove()     poll()

element()    peek()

Deque（接口）

双端队列是集成stack和queeu的。可以用LinkedList完成

api:

addFirst(e)  offerFirst(e)

removeFirst()  pollFirst()

getFirst()  peekFirst()

addLast(e)  offerLast(e)

removeLast()  pollLast()

getLast()  peekLast()

PriorityQueue（接口）:

特征：

1.插入操作：O（1）

2.取出操作：O（logN) --按照元素的优先级取出

由于优先级所以add进来的元素需要实现Comparator接口

3.底层实现的是heap:如平衡二叉树，treap等

API:

和队列基本一样
-----------------------------------------------
对于priorityQueue的分析：
队列是遵循先进先出（First-In-First-Out）模式的，但有时需要在队列中基于优先级处理对象。

举两个例子：

作业系统中的调度程序，当一个作业完成后，需要在所有等待调度的作业中选择一个优先级最高的作业来执行，并且也可以添加一个新的作业到作业的优先队列中。
每日交易时段生成股票报告的应用程序中，需要处理大量数据并且花费很多处理时间。客户向这个应用程序发送请求时，实际上就进入了队列。我们需要首先处理优先客户再处理普通用户。在这种情况下，Java的PriorityQueue(优先队列)会很有帮助。
PriorityQueue类在Java1.5中引入并作为 Java Collections Framework 的一部分。PriorityQueue是基于优先堆的一个无界队列，这个优先队列中的元素可以默认自然排序或者通过提供的Comparator（比较器）在队列实例化的时排序。

优先队列不允许空值，而且不支持non-comparable（不可比较）的对象，比如用户自定义的类。优先队列要求使用Java Comparable和Comparator接口给对象排序，并且在排序时会按照优先级处理其中的元素。

优先队列的头是基于自然排序或者Comparator排序的最小元素。如果有多个对象拥有同样的排序，那么就可能随机地取其中任意一个。当我们获取队列时，返回队列的头对象。

优先队列的大小是不受限制的，但在创建时可以指定初始大小。当我们向优先队列增加元素的时候，队列大小会自动增加。

PriorityQueue是非线程安全的，所以Java提供了PriorityBlockingQueue（实现BlockingQueue接口）用于Java多线程环境。

我们有一个用户类Customer，它没有提供任何类型的排序。当我们用它建立优先队列时，应该为其提供一个比较器对象


