INSERT INTO coffee (id, name, method, size, type) VALUES ('2e16a5c0-9e81-4f3e-9ffc-07e65a9a3fb9', 'Black Coffee', 'Cone', 'M', 'Arabica');
INSERT INTO coffee (id, name, method, size, type) VALUES ('efe2a209-f8c1-49ec-9ec5-feb51027af55', 'Doppio', 'Espresso', 'M', 'Arabica');
INSERT INTO coffee (id, name, method, size, type) VALUES ('51a9348b-b9e6-4b0f-b346-b28f62e80134', 'Red Eye', 'Espresso', 'M', 'Robusta');
INSERT INTO coffee (id, name, method, size, type) VALUES ('632ee8c6-4cbe-4c4f-b22c-53a440fda195', 'Ristreto', 'Espresso', 'S', 'Robusta');

INSERT INTO coffee_type (id, type) VALUES ('54dbf003-00ff-4691-9b5e-615f1533ed91', 'Arabica');
INSERT INTO coffee_type (id, type) VALUES ('8439463a-6266-44ed-9a4d-56634459ec61', 'Robusta');

INSERT INTO coffee_size (id, size) VALUES ('960d96d1-6c42-4a98-9f91-6ba397241f35', 'S');
INSERT INTO coffee_size (id, size) VALUES ('7a81de0a-df41-4643-9196-fb90e06a8c50', 'M');
INSERT INTO coffee_size (id, size) VALUES ('624f03fd-7478-4140-8ec6-7989d03a270f', 'L');

INSERT INTO brewing_method (id, method) VALUES ('6a337ae5-9653-4397-85d1-29cb30462c25', 'Cone');
INSERT INTO brewing_method (id, method) VALUES ('0e530bb2-4832-4955-9c04-59191bed9782', 'Espresso');
INSERT INTO brewing_method (id, method) VALUES ('ea58a34d-9afd-49ae-9472-7e878eb05429', 'French Press');
INSERT INTO brewing_method (id, method) VALUES ('ef1ec9ba-aa76-4625-a2dc-0668060eac35', 'Siphon');
INSERT INTO brewing_method (id, method) VALUES ('f60192ed-58a1-4bc3-882c-8de0d0fe9c62', 'Moka Pot');