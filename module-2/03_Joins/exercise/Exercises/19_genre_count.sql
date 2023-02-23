-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'.
-- Order the results from the highest movie count to the lowest.
-- (19 rows, the highest expected count is around 400).
Select genre_name, count (title) as num_of_movies
FROM genre
Join movie_genre
ON genre.genre_id = movie_genre.genre_id
join movie
on movie_genre.movie_id = movie.movie_id
GROUP by genre_name
ORDER by num_of_movies Desc;
