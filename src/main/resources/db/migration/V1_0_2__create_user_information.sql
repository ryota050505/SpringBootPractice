DROP TABLE IF EXISTS user_information;
CREATE TABLE user_information (
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT UNIQUE NOT NULL,
    email VARCHAR(255) NOT NULL,
    sex ENUM('man', 'women') NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    CONSTRAINT fk_user_information_user_id FOREIGN KEY (user_id) REFERENCES user (id)
);

INSERT INTO user_information (`user_id`, `email`, `sex`) VALUES
(1, 'test1@gmail.com', 'man'),
(2, 'test2@gmail.com', 'man'),
(3, 'test3@gmail.com', 'women');