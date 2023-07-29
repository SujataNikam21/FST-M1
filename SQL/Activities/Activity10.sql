REM   Script: Activity10
REM   Activity10


SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders WHERE salesman_id in (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='London');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='London');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade<(SELECT AVG(grade) FROM customers WHERE city='London');

SELECT * FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

