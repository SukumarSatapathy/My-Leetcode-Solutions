SELECT
    u.user_id AS buyer_id,
    join_date, 
    IFNULL(COUNT(order_date), 0) AS orders_in_2019 
FROM Users as U
LEFT JOIN
Orders as O
ON U.user_id = O.buyer_id AND YEAR(order_date) = '2019'
GROUP BY U.user_id