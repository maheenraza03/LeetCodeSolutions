# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus AS bonus
FROM Employee
LEFT JOIN Bonus on Bonus.empId = Employee.empId
WHERE bonus < 1000 OR bonus IS NULL;