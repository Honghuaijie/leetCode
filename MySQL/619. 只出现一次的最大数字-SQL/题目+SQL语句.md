# 题目：[619. 只出现一次的最大数字]

MyNumbers` 表：

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| num         | int  |
+-------------+------+
该表可能包含重复项（换句话说，在SQL中，该表没有主键）。
这张表的每一行都含有一个整数。
```

 

**单一数字** 是在 `MyNumbers` 表中只出现一次的数字。

找出最大的 **单一数字** 。如果不存在 **单一数字** ，则返回 `null` 。

查询结果如下例所示。

**示例 1：**

```
输入：
MyNumbers 表：
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
| 6   |
+-----+
输出：
+-----+
| num |
+-----+
| 6   |
+-----+
解释：单一数字有 1、4、5 和 6 。
6 是最大的单一数字，返回 6 。
```

**示例 2：**

```
输入：
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 7   |
| 7   |
| 3   |
| 3   |
| 3   |
+-----+
输出：
+------+
| num  |
+------+
| null |
+------+
解释：输入的表中不存在单一数字，所以返回 null 。
```

 

# 答案

```mysql
/*

SELECT MAX(num) 
FROM my
GROUP BY num
HAVING  COUNT(*) =1;
这里为什么不直接这样写
因为是以num分组的，max只能找出各个num组中的最大值

*/

#方式1：分组后作为表，返回最大值
# select MAX(num) num
# from (
#     select num
#     from MyNumbers
#     group by num
#     having count(*) = 1
#     ) single_num;

#方式2：分组后进行降序排序，只取第一个
select (
    select num
    from MyNumbers
    group by num
    having count(*) = 1
    order by num desc
    limit 1
) as num;
```

