-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)

SELECT Distinct person_name
from person
join movie_actor
ON person.person_id = movie_actor.actor_id
join movie 
on movie_actor.movie_id = movie.movie_id
join collection 
ON movie.collection_id = collection.collection_id
WHERE collection_name = 'Back to the Future Collection'
Order by person_name;
