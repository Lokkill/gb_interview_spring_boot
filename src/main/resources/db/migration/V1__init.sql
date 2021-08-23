create table students (
    id                 bigserial primary key,
    name               varchar(30) not null,
    age                int not null
);

insert into students (name, age)
values
('Matt', 20),
('Lucio', 21),
('Maria', 23);