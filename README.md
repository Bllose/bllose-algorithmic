# bllose-algorithmic
各种算法

# LeetCode  
7. 整数反转 [IntegerInversion.java](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/java/bllose/leetcode/IntegerInversion.java) 有待改进
8. 字符串转换证数(atoi) [Atoi.java](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/java/bllose/leetcode/Atoi.java)  运行速度有进步空间。 **不要用正则!**      [Atoi.py](https://github.com/Bllose/bllose-algorithmic/blob/main/src/main/python/bllose/leetcode/Atoi.py) python本身并不存在这种需求，因为其松类型控制。[Python是否存在类似于Java的Integer.MAX_VALUE的方法?](https://stackoverflow.com/questions/7604966/maximum-and-minimum-values-for-ints)
9. 


# 两数之和绝对值最小 | 时间限制：1秒 | 内存限制：32768K | 语言限制： 不限  
> 1.ACM编程题 语言限制 \[ 编程题 | 平均分61.41分 | 49人正确/523人做题 | 提交: 3 次 得分： 95.0 / 100.0  \]


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
> 2.ACM编程题 语言限制 \[ 编程题 | 平均分44.39分 | 61人正确/506人做题 | 提交: 5 次 得分： 95.0 / 100.0  \]  
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


# 字符匹配 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限   
> 3.ACM编程题 语言限制 \[ 编程题 | 平均分45.42分 | 26人正确/382人做题 | 提交: 28 次 得分： 180.0 / 200.0\]    
> 
【字符匹配】
给你一个字符串数组（每个字符串均由小写字母组成）和一个字符规律（由小写字母和.和*组成），识别数组中哪些字符串可以匹配到字符规律上。  
'.' 匹配任意单个字符，'*' 匹配零个或多个任意字符；判断字符串是否匹配，是要涵盖整个字符串的，而不是部分字符串。  
输入描述：  
> 第一行为空格分割的多个字符串，1<单个字符串长度<100，1<字符串个数<100  
> 第二行为字符规律，1<=字符规律长度<=50  
> 不需要考虑异常场景  

输出描述：  
> 匹配的字符串在数组中的下标（从0开始），多个匹配时下标升序并用,分割，若均不匹配输出-1  

示例1：  
输入： 
ab aab abacd  
.*  
输出：  
0,1,2  


# 敏感字段加密 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限    
> 1.ACM编程题 语言限制 \[ 编程题 | 平均分32.54分 | 52人正确/527人做题 | 提交: 6 次 得分： 100.0 / 100.0\]  
1、字符串长度小于等于127字节，只包含大小写字母，数字，下划线和偶数个双引号；  
2、命令字之间以一个或多个下划线_进行分割；  
3、可以通过两个双引号""来标识包含下划线_的命令字或空命令字（仅包含两个双引号的命令字），双引号不会在命令字内部出现；  
请对指定索引的敏感字段进行加密，替换为******（6个*），并删除命令字前后多余的下划线_。如果无法找到指定索引的命令字，输出字符串ERROR。    

输入描述:  
> 输入为两行，第一行为命令字索引K（从0开始），第二行为命令字符串S。  

输出描述:  
> 输出处理后的命令字符串，如果无法找到指定索引的命令字，输出字符串ERROR  

示例1：  
输入  
> 1  
> password__a12345678_timeout_100  

输出：  
> password_******_timeout_100  


# 乱序整数序列两数之和绝对值最小 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限  
> 2. ACM编程题 语言限制 \[ 编程题 | 平均分59.67分 | 183人正确/533人做题 | 提交: 1 次 得分： 100.0 / 100.0\]    
【乱序整数序列两数之和绝对值最小】给定一个随机的整数（可能存在正整数和负整数）数组 nums ，请你在该数组中找出两个数，其和的绝对值  
(|nums[x]+nums[y]|)为最小值，并返回这个两个数（按从小到大返回）以及绝对值。  
每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。  
输入描述：  
> 一个通过空格分割的有序整数序列字符串，最多1000个整数，且整数数值范围是 \[-65535, 65535]。  

输出描述：  
> 两数之和绝对值最小值  

示例1：
输入：  
> -1 -3 7 5 11 15  

输出:  
> -3 5 2



# 服务失效判断 | 时间限制：1秒 | 内存限制：32768K | 语言限制： 不限  
> ACM编程题 语言限制 \[ 编程题 | 平均分39.75分 | 28人正确/401人做题 | 提交: 0 次 得分： 0.0 / 200.0\]  
某系统中有众多服务，每个服务用字符串（只包含字母和数字，长度<=10）唯一标识，服务间可能有依赖关系，如A依赖B，则当B故障时导致A也故障。  
依赖具有传递性，如A依赖B，B依赖C，当C故障时导致B故障，也导致A故障。  
给出所有依赖关系，以及当前已知故障服务，要求输出所有正常服务。  
依赖关系：服务1-服务2 表示“服务1”依赖“服务2”  
不必考虑输入异常，用例保证：依赖关系列表、故障列表非空，且依赖关系数，故障服务数都不会超过3000，服务标识格式正常。  
输入描述：
> 半角逗号分隔的依赖关系列表（换行）  
> 半角逗号分隔的故障服务列表

输出描述：  
> 依赖关系列表中提及的所有服务中可以正常工作的服务列表，用半角逗号分隔，按依赖关系列表中出现的次序排序。  
> 特别的，没有正常节点输出单独一个半角逗号。  

示例1：  
输入  
> a1-a2,a5-a6,a2-a3  
> a5,a2  

输出:  
> a6,a3  



# 考勤信息 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限  
> 2.ACM编程题 语言限制 \[ 编程题 | 平均分31.72分 | 68人正确/507人做题 | 提交: 7 次 得分： 100.0 / 100.0\]  
> 

公司用一个字符串来表示员工的出勤信息：  
absent：缺勤  
late：迟到  
leaveearly：早退  
present：正常上班  
现需根据员工出勤信息，判断本次是否能获得出勤奖，能获得出勤奖的条件如下：  
缺勤不超过一次；没有连续的迟到/早退；任意连续7次考勤，缺勤/迟到/早退不超过3次   

输入描述:  
> 用户的考勤数据字符串，记录条数 >= 1；输入字符串长度<10000；不存在非法输入  
> 如：  
> 2  
> present  
> present absent present present leaveearly present absent

输出描述：  
> 根据考勤数据字符串，如果能得到考勤奖，输出"true"；否则输出"false"，对于输入示例的结果应为：  
> true false  

示例1：  
输入  
>  2  
>  present   
>  present present  

输出:  
> true true  


# 考古学家 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限   
> ACM编程题 语言限制 \[ 编程题 | 平均分41.89分 | 59人正确/376人做题 | 提交: 0 次 得分： 0.0 / 200.0\]  
> 
【考古学家】有一个考古学家发现一个石碑，但是很可惜，发现时其已经断成多段，原地发现n个断口整齐的石碑碎片。为了破解石碑内容，考古学家希望有程序能  
帮忙计算复原后的石碑文字组合数，你能帮忙吗？  
输入描述：  
> 第一行输入n，n表示石碑碎片的个数。  
> 第二行依次输入石碑碎片上的文字内容s，共有n组。  
输出描述:  
> 输出石碑文字的组合（按照升序排列），行末无多余空格。  

备注:  
> 如果存在石碑碎片内容完全相同，则由于碎片间的顺序变换不影响复原后的碑文内容，即相同碎片间的位置变换不影响组合。  

示例1：  
输入:  
> 3  
> a b c  

输出：  
> abc  
> acb  
> bac  
> bca  
> cab   
> cba  


# 按单词下标区间翻转文章内容 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限  
> 1.ACM编程题 语言限制 \[ 编程题 | 平均分64.48分 | 220人正确/464人做题 | 提交: 2 次 得分： 100.0 / 100.0\]  
【按单词下标区间翻转文章内容】给定一段英文文章片段，由若干单词组成，单词间以空格间隔，单词下标从0开始。
请翻转片段中指定区间的单词顺序并返回翻转后的内容。  
例如给定的英文文章片段为"I am a developer"，翻转区间为\[0,3\]，则输出"developer a am I"。  
String reverseWords(String s, int start, int end)  

输入描述：  
> 使用换行隔开三个参数，第一个参数为英文文章内容即英文字符串，第二个参数为待翻转内容起始单词下标，第三个参数为待翻转内容最后一个单词下标。  

输出描述:  
> 翻转后的英文文章片段所有单词之间以一个半角空格分隔进行输出  

备注:  
> 英文文章内容首尾无空格  

示例1：  
输入  
> I am a developer  
> 1  
> 2  

输出:  
> I a am developer  



# 日志排序 | 时间限制：1秒 | 内存限制：262144K | 语言限制：   
\[C, C++, Pascal, Java, Python, Php, C#, Object C, Python 3, Javascript, Javascript_V8,
Sqlite, R, Go, Ruby, Swift, Matlab, Bash, Pypy2, Pypy3, Rust, Scala, Kotlin, Groovy, Typescript, Mysql\]   
> ACM编程题 语言限制 \[ 编程题 | 平均分28.7分 | 67人正确/481人做题 | 提交: 10 次 得分： 95.0 / 100.0\]  

【日志排序】运维工程师采集到某产品现网运行一天产生的日志N条，现需根据日志时间按时间先后顺序对日志进行排序。  
日志时间格式为：  
H:M:S.N  
H表示小时(0-23)，M表示分钟(0-59)，S表示秒(0-59)，N表示毫秒(0-999)  
时间可能并没有补齐，也就是说: 01:01:01.001，也可能表示为1:1:1.1  
输入描述：  
> 第一行输入一个整数N，表示日志条数，1<=N<=100000  
> 接下来N行输入N个时间  

输出描述:  
> 按时间升序排序之后的时间  
> 如果有两个时间表示的时间相同，则保持输入顺序  

示例1：  
输入：  
2  
01:41:8.9  
1:1:09.211    

输出   
1:1:09.211   
01:41:8.9  



# 德州扑克 | 时间限制：1秒 | 内存限制：262144K | 语言限制： 不限  
> ACM编程题 语言限制 \[ 编程题 | 平均分59.2分 | 35人正确/324人做题 | 提交: 0 次 得分： 0.0 / 200.0\]  
【德州扑克】五张牌，每张牌由牌大小和花色组成，牌大小2\~10、J、Q、K、A，牌花色为红桃、黑桃、梅花、方块四种花色之一。 判断牌型:  
牌型1，同花顺：同一花色的顺子，如红桃2红桃3红桃4红桃5红桃6。  
牌型2，四条：四张相同数字 + 单张，如红桃A黑桃A梅花A方块A + 黑桃K。  
牌型3，葫芦：三张相同数字 + 一对，如红桃5黑桃5梅花5 + 方块9梅花9。  
牌型4，同花：同一花色，如方块3方块7方块10方块J方块Q。  
牌型5，顺子：花色不一样的顺子，如红桃2黑桃3红桃4红桃5方块6。  
牌型6，三条：三张相同 + 两张单。  
牌型7，其他。  
说明：  
1）五张牌里不会出现牌大小和花色完全相同的牌。  
2）编号小的牌型较大，如同花顺比四条大，依次类推。  
3）包含A的合法的顺子只有10 J Q K A和A 2 3 4 5，类似K A 2 3 4的序列不认为是顺子。  
输入描述：  
> 输入由5行组成，每行为一张牌大小和花色，牌大小为2~10、J、Q、K、A，花色分别用字符H、S、C、D表示红桃、黑桃、梅花、方块。  

输出描述:  
> 输出牌型序号，5张牌符合多种牌型时，取最大的牌型序号输出。  

示例1：  
输入  
4 H  
5 S  
6 C  
7 D  
8 D    

输出  
5











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
