insert into fabricante_veiculos_model (nome) values
('Fiat'),('Chevrolet'),('Hyundai'),
('Subaru'),('Mitsubishi');

insert into carro_model
(modelo, data_fabricacao, ano_fabricacao,
potencia_motor, fabricante_veiculos_model_id_fabricante)
values
('Uno 2010', '2010-02-21', 2015, 2, 1),
('Lancer', '2011-12-15', 2018, 5, 5),
('Impala 67', '1967-06-30', 1970, 3, 2),
('Camaro', '2010-02-21', 2015, 2, 2);
