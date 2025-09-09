# Logical Query Processing Order in MySQL (EVALUATION PROCESS)

Even though we **write SQL queries** in the order:

```sql
SELECT ... FROM ... WHERE ... GROUP BY ... HAVING ... ORDER BY ... LIMIT ...
```

MySQL **evaluates them in a different order**:

1. **FROM** – Identify tables and join them if needed.
2. **WHERE** – Filter rows that don’t meet conditions.
3. **GROUP BY** – Group rows based on column(s).
4. **HAVING** – Filter groups (like WHERE but works on aggregated results).
5. **SELECT** – Pick the columns or expressions to display.
6. **DISTINCT** – Remove duplicate rows (applied after SELECT).
7. **ORDER BY** – Sort the result set.
8. **LIMIT** – Restrict the number of rows returned.

---

# Example Walkthrough

Query:

```sql
SELECT DISTINCT department, AVG(salary) 
FROM employees 
WHERE salary > 30000 
GROUP BY department 
HAVING AVG(salary) > 50000 
ORDER BY AVG(salary) DESC 
LIMIT 3;
```

### Execution Order:

1. **FROM employees** → pick the table.
2. **WHERE salary > 30000** → filter rows.
3. **GROUP BY department** → group by department.
4. **HAVING AVG(salary) > 50000** → filter groups.
5. **SELECT DISTINCT department, AVG(salary)** → choose final columns.
6. **DISTINCT** → remove duplicates (if any).
7. **ORDER BY AVG(salary) DESC** → sort by average salary.
8. **LIMIT 3** → return only top 3 rows.

---

# Quick Table

| Step | Clause       | Purpose                  |
| ---- | ------------ | ------------------------ |
| 1    | **FROM**     | Choose tables, joins     |
| 2    | **WHERE**    | Filter rows              |
| 3    | **GROUP BY** | Group rows               |
| 4    | **HAVING**   | Filter groups            |
| 5    | **SELECT**   | Pick columns/expressions |
| 6    | **DISTINCT** | Remove duplicates        |
| 7    | **ORDER BY** | Sort rows                |
| 8    | **LIMIT**    | Restrict output          |
