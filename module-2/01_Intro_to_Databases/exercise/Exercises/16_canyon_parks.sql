-- 16. The name, date established, and area of parks that contain the string "Canyon" anywhere in the name (5 rows)
SELECT park_name, date_established, area
from Park
WHERE park_name like '%Canyon%';
