# mysql
###索引类型
1. 主键索引：数据列不允许重复，不允许为null，一个表只能有一个主键；
2. 唯一索引：数据列不允许重复，允许为null值，一个表允许多个列创建唯一索引；<br>
   ALTER TABLE table_name ADD UNIQUE (column1,column2)
3. 普通索引：基本的索引类型，没有唯一性的限制，允许为null；<br>
   ALTER TABLE table_name ADD INDEX index_name (column1,column2)
4. 全文索引：是目前搜索引擎使用的一种关键技术；<br>
   ALTER TABLE table_name ADD FULLTEXT(column)。

###索引创建原则
1. 最左前缀原则：组合索引非常重要的原则，mysql会一直向右匹配直到遇到范围查询（>,<,between,like）就停止匹配，
比如a=1 and b=2 and c>3 and d=4如果建立(a,b,c,d)顺序的索引，d列是用不到索引的，如果建立(a,b,d,c)的索引则都可以用到；
2. 非空字段：在mysql中，含有空值的列很难进行查询优化，因为它们使的索引、索引的统计信息以及比较运算更加复杂。尽量用0、
   一个特殊的值或者一个空串代替空值；
3. 取离散值大的列作为索引：查询过滤数据力度的列放到联合索引的前列；
4. 索引字段越小越好：数据库的数据存储以页为单位，一页存储的数据越多一次IO操作获取的数据越多效率也越高；



    

