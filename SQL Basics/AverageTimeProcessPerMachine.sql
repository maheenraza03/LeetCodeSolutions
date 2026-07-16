-- -- -- # Write your MySQL query statement below
SELECT current_value.machine_id, ROUND(AVG(next_value.timestamp - current_value.timestamp), 3) AS processing_time
FROM Activity AS current_value
INNER JOIN Activity AS next_value
ON current_value.machine_id = next_value.machine_id AND current_value.process_id = next_value.process_id
WHERE current_value.activity_type = 'start' AND next_value.activity_type = 'end'
GROUP BY current_value.machine_id;