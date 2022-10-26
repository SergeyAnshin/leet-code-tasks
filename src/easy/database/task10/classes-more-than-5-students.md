### Task

___

Write an SQL query to report all the classes that have at least five students.

### Example

___

> <img src="example.PNG" width="188" height="368">

### SQL query

___

#### My

```sql
SELECT class
FROM courses
GROUP BY class
HAVING COUNT(student) >= 5;
```
