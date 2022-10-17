### Task

___

Write an SQL query to find the employees who earn more than their managers.

Return the result table in any order.

### Example

___

> <img src="example.PNG" width="599" height="351">

### SQL query

___

#### My

```sql
SELECT e.name Employee
FROM employee e
JOIN employee m ON e.managerId = m.id
WHERE e.salary > m.salary;
```

#### LeetCode

```sql
SELECT e.name Employee
FROM employee e
JOIN employee m ON e.managerId = m.id AND e.salary > m.salary;
```
