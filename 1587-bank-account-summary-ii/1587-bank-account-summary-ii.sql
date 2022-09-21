SELECT U.name, SUM(T.amount) as balance 
FROM USERS U
INNER JOIN TRANSACTIONS T
ON U.account=T.account
GROUP BY T.account HAVING balance>10000;