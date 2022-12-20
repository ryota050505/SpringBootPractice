DROP TABLE IF EXISTS r_user_role;
CREATE TABLE r_user_role (
    user_id INT NOT NULL,
    role_id INT NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id, role_id),
    CONSTRAINT fk_r_user_role_user_id FOREIGN KEY (user_id) REFERENCES user (id),
    CONSTRAINT fk_r_user_role_role_id FOREIGN KEY (role_id) REFERENCES role (id)
);

INSERT INTO r_user_role (`user_id`, `role_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 2),
(2, 3),
(3, 3);
