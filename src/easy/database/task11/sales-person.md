### Task

___

Write an SQL query to report the names of all the salespersons who did not have any orders related to the company with the name "RED".

### SQL query

___

#### My

```sql
SELECT DISTINCT sp.name
FROM SalesPerson sp
LEFT JOIN orders o ON sp.sales_id = o.sales_id
WHERE o.order_id IS NULL OR sp.sales_id NOT IN (
    SELECT o.sales_id
    FROM orders o
    INNER JOIN company c ON o.com_id = c.com_id AND c.name = 'RED'
)
```

#### LeetCode

```sql
SELECT s.name
FROM salesperson s
WHERE s.sales_id NOT IN (
	SELECT o.sales_id
	FROM orders o
	LEFT JOIN company c ON o.com_id = c.com_id
	WHERE c.name = 'RED');
```


