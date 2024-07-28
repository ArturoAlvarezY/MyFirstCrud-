INSERT INTO users (id, username, password) VALUES (1, 'user1', 'password1');
INSERT INTO users (id, username, password) VALUES (2, 'user2', 'password2');

INSERT INTO requests (id, solicitant_name, request_date, subject_consult, description_consult) VALUES 
(1, 'Juan Perez', CURRENT_TIMESTAMP, 'Consulta 1', 'Descripción de la consulta 1'),
(2, 'Maria Lopez', CURRENT_TIMESTAMP, 'Consulta 2', 'Descripción de la consulta 2'),
(3, 'Carlos Diaz', CURRENT_TIMESTAMP, 'Consulta 3', 'Descripción de la consulta 3');