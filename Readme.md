
## Simple Test #

 Simple achilles test should generate
 
```
CREATE TABLE IF NOT EXISTS default_keyspace_name.entity_child(
		id bigint,
		child_value text,
		date1 timestamp,
		date2 timestamp,
		date3 timestamp,
		PRIMARY KEY(id));
```


On some builds, it was not picking up the abstract class
```
CREATE TABLE IF NOT EXISTS default_keyspace_name.entity_child(
        id bigint,
		child_value text,
		PRIMARY KEY(userid));
		
```


Simply fixed it, thanks to DuyHai Doan!
```
mvn clean compile 
```

