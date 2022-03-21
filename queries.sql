## Part 1: Test it with SQL
CREATE TABLE job (
  id INT PRIMARY KEY AUTO_INCREMENT,
  employer VARCHAR,
  name VARCHAR,
  skills VARCHAR
);
## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT DISTINCT id, name, skill_description
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id
ORDER BY name;