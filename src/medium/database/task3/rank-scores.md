### Task

___

Write an SQL query to rank the scores.

### Example

___

> <img src="example.PNG" width="142" height="457">

### SQL query

___

#### My

```sql
SELECT score, DENSE_RANK() OVER(ORDER BY score DESC) 'rank'
FROM scores;
```
