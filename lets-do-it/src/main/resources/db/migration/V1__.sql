CREATE TABLE categories
(
    id         INT AUTO_INCREMENT NOT NULL,
    user_id    INT NULL,
    name       VARCHAR(255) NULL,
    created_at datetime NULL,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE tasks
(
    id          INT AUTO_INCREMENT NOT NULL,
    user_id     INT NULL,
    title       VARCHAR(255) NULL,
    completed   BIT(1)  NOT NULL,
    duplicate   BIT(1)  NOT NULL,
    priority    TINYINT NOT NULL,
    due_date    datetime NULL,
    category_id INT NULL,
    CONSTRAINT pk_tasks PRIMARY KEY (id)
);

CREATE TABLE users
(
    id         INT AUTO_INCREMENT NOT NULL,
    username   VARCHAR(255) NULL,
    email      VARCHAR(255) NULL,
    created_at datetime NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE categories
    ADD CONSTRAINT FK_CATEGORIES_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE tasks
    ADD CONSTRAINT FK_TASKS_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES categories (id);

ALTER TABLE tasks
    ADD CONSTRAINT FK_TASKS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);