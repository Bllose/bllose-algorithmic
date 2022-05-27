# bllose-algorithmic
各种算法

# 两数之和绝对值最小 | 时间限制：1秒 | 内存限制：32768K | 语言限制： 不限
【两数之和绝对值最小】给定一个从小到大的有序整数序列（存在正整数和负整数）数组 nums ，请你在该数组中找出两个数，其和的绝对值(|nums[x]+nums[y]|)
为最小值，并返回这个绝对值。  
每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。  
输入描述：  
> 一个通过空格分割的有序整数序列字符串，最多1000个整数，且整数数值范围是 -65535~65535。  

输出描述：  
> 两数之和绝对值最小值  

示例1：
输入： -3 -1 5 7 11 15
输出： 2   


# 数组拼接 | 时间限制：1秒 | 内存限制：32768K | 语言限制： 不限
【数组拼接】  
现在有多组整数数组，需要将它们合并成一个新的数组。合并规则，从每个数组里按顺序取出固定长度的内容合并到新的数组中，取完的内容会删除掉，如果该行不
足固定长度或者已经为空，则直接取出剩余部分的内容放到新的数组中，继续下一行。  
输入描述：
> 第一行是每次读取的固定长度，0<长度<10  
> 第二行是整数数组的数目，0<数目<1000  
> 第3-n行是需要合并的数组，不同的数组用回车换行分隔，数组内部用逗号分隔，最大不超过100个元素。

输出描述：
> 输出一个新的数组，用逗号分隔。

示例1：  
输入： 
3  
2  
2,5,6,7,9,5,7  
1,7,4,3,4  
输出: 2,5,6,1,7,4,7,9,5,3,4,7  



## 二叉查找树，平衡树
- Leetcode 1382 将二叉搜索树变平衡  
- - java/bllose/binaryTree/BinaryTrees
![balanceBTS](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/java/bllose/binaryTree/resourses/balanceBTS.png)

## 分治  
- Leetcode 875 爱吃香蕉的珂珂 
- - java/bllose/sortrelated/KakaEatingBanans.java
- - python/bllose/sortrelated/KakaEatingBananas.py  
- Leetcode 23 合并K个升序链表  
- - java/bllose/sortrelated/MergeLists.java


## 搜索算法
- **深度优先** 
- - Leetcode 98 验证二叉搜索树 Validate Binary Search Tree
- - - java/bllose/binaryTree/BinaryTrees.java
![binaryTree](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/java/bllose/binaryTree/resourses/validBTS.png)  

- **广度优先** Level Order
- - Leetcode 102 二叉树的层序遍历 Binary Tree Level Order Traversal  
- - - java/bllose/binaryTree/BinaryTrees.java
![levelOrderTraversal](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/java/bllose/binaryTree/resourses/LevelOrderTraversal.png)

## 回溯 
- Leetcode 5 最长回文子串
- - java/bllose/backtracking/LongestPalindrome.java

## 动态规划
- Leetcode 5 最长回文子串
- - java/bllose/backtracking/LongestPalindrome.java


# 递归思想  
# 分治策略  
# 单调栈  
# 并查集 （DSU）
# 滑动窗口  
# 前缀和\[&哈希表优化\]
# 差分  
# 拓扑排序（专业级）
# 字符串  
# 二分查找
# BFS广搜
# DFS深搜&回溯  
# 动态规划  
# 贪心算法  
# 字典树  
