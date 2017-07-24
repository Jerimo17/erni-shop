--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements
insert into Customer (id, name, email, phone, address, createdat) values ('1','Jozko Mrkvicka', 'jozko.mrkvicka@gmail.com', '+421904545454', 'Mileticka Bratislava', '2017-7-23');
insert into Customer (id, name, email, phone, address, createdat) values ('2','Dedo Mraz', 'dedo.mraz@gmail.com', '+4219044345555', 'Severny pol', '2017-7-23');
insert into Customer (id, name, email, phone, address, createdat) values ('3','Janko Hrasko', 'janko.hrasko@gmail.com', '+4219044345555', 'Hraskovo', '2017-7-23');

insert into Shoporder (id, customer_id, article, price, orderdate) values ('1','1', 'Mixer', 54.67 , '2017-7-23');
insert into Shoporder (id, customer_id, article, price, orderdate) values ('2','1', 'Topanky', 33.99 , '2017-7-23');
insert into Shoporder (id, customer_id, article, price, orderdate) values ('3','3', 'Ponozky', 12.45 , '2017-7-23');
insert into Shoporder (id, customer_id, article, price, orderdate) values ('4','2', 'Tricko', 19 , '2017-7-23');
insert into Shoporder (id, customer_id, article, price, orderdate) values ('5','2', 'Antena', 143.6 , '2017-7-23');