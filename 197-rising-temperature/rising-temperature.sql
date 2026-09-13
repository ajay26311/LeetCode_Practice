# Write your MySQL query statement below
SELECT  w1.id FROM Weather AS w1
JOIN Weather AS w2
ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;

#DATEDIFF(w1.recordDate, w2.recordDate) = 1
#w1.recordDate is exactly 1 day after w2.recordDate.
