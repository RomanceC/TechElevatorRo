-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in. Name the count column 'num_of_movies'.
-- Include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. 
-- (59 rows

Select person_name, count (title) AS num_of_movies
from person
left join movie_actor
on person.person_id = movie_actor.actor_id
left join movie
on movie_actor.movie_id = movie.movie_id
where person_name like 'George %'
group by person_id
order by person_name;