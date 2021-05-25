/* Drop Tables */
DROP TABLE IF EXISTS save_data;
DROP TABLE IF EXISTS job;

/* Create Tables */
CREATE TABLE job
(
    id INTEGER PRIMARY KEY,
    name VARCHAR(128)
);

CREATE TABLE save_data
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128),
    last_login_date DATE,
    player_level INTEGER,
    money INTEGER,
    job_id INTEGER,
    CONSTRAINT fk_job_id FOREIGN KEY (job_id) REFERENCES job(id)
)