INSERT into torre_comando (nome, senha)
values ('torre_comando', 'torreteste');

INSERT into vant
(nome)
values ('vant_001'),
       ('vant_002'),
       ('vant_003'),
       ('vant_004'),
       ('vant_005'),
       ('vant_006'),
       ('vant_007'),
       ('vant_008'),
       ('vant_009'),
       ('vant_010');

insert into categoria
(nome)
values ('climb'),
       ('route'),
       ('descend'),
       ('comms'),
       ('speed'),
       ('report'),
       ('emerg'),
       ('crossing');

INSERT into mensagem
(id_categoria, mensagem)
values (1, 'CLIMB TO FL'),
       (1, 'MAINTAIN FL'),
       (1, 'CLIMB TO AND MAINTAIN FL');