# Write your MySQL query statement below
select P.FIRSTNAME,
P.LASTNAME,
A.CITY,
A.STATE 
from Person AS P 
LEFT JOIN Address AS a on p.personid=a.personid;