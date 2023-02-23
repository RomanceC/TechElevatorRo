-- 17. The titles and taglines of movies that are in the "Family" genre that Samuel L. Jackson has acted in.
-- Order the results alphabetically by movie title.
-- (4 rows)

SELECT title, tagline
From movie
join movie_genre
on movie_genre.movie_id = movie.movie_id
Join movie_actor
on movie.movie_id = movie_actor.movie_id
Join person
on movie_actor.actor_id = person.person_id
join genre
ON movie_genre.genre_id = genre.genre_id
Where genre_name = 'Family' and person_name = 'Samuel L. Jackson'
order by title;
