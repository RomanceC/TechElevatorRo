-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT distinct person_name, birthday
from person
join movie_actor
ON person.person_id = movie_actor.actor_id
join movie 
on movie_actor.movie_id = movie.movie_id
WHERE (birthday BETWEEN '1950-01-01' AND '1959-12-31') AND (release_date BETWEEN '1985-01-01' AND '1985-12-31')
ORDER by birthday asc;