-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)

SELECT Distinct person_name
FROM person
JOIN movie
ON movie.director_id = person.person_id
join collection 
ON movie.collection_id = collection.collection_id
WHERE collection_name = 'Harry Potter Collection'
Order by person_name;