create table if not exists tasklist (
id varchar(8) primary key,
task varchar(256) not null,
deadline varchar(10),
done boolean
);