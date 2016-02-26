
## Simple Test #

 Simple achilles test should generate
 
```
 CREATE TABLE IF NOT EXISTS default_keyspace_name.useraccount(
 		userid uuid,
 		name text,
        datecreated timestamp,
        datemodified timestamp,
 		PRIMARY KEY(userid));
```


Rather the following is generated, the entity being extended is ignored (AbstractEntity), even though it is not abstract..
```
CREATE TABLE IF NOT EXISTS default_keyspace_name.useraccount(
		userid uuid,
		name text,
		PRIMARY KEY(userid));
		
```