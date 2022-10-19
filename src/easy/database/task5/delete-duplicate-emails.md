### Task

___

Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id.

### SQL query

___

#### My

```sql
DELETE p
FROM person p
INNER JOIN person pr
WHERE p.id > pr.id AND p.email = pr.email;
```
