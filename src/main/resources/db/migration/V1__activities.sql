CREATE TABLE activities (id BIGINT AUTO_INCREMENT, start_time TIMESTAMP, activity_desc VARCHAR(255), activity_type VARCHAR(255), PRIMARY KEY (id));

INSERT INTO activities (start_time, activity_desc, activity_type) values ('2021-03-02 10:30:00', 'Basketball in park', 'BASKETBALL');
INSERT INTO activities (start_time, activity_desc, activity_type) values ('2021-03-01 11:40:00', 'Biking in Pest', 'BIKING');
INSERT INTO activities (start_time, activity_desc, activity_type) values ('2021-03-03 13:50:00', 'Hiking at Zoo', 'HKING');