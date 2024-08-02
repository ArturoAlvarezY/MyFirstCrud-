INSERT INTO users (username, password) VALUES ('user1', 'password1');
INSERT INTO users (username, password) VALUES ('user2', 'password2');

INSERT INTO requests (solicitant_name, request_date, subject_consult, description_consult) VALUES 
('Bumby', CURRENT_TIMESTAMP, 'Consulta 1', 'Descripción de la consulta 1'),
('Lucas', CURRENT_TIMESTAMP, 'Consulta 2', 'Descripción de la consulta 2'),
('Pupi', CURRENT_TIMESTAMP, 'Consulta 3', 'Descripción de la consulta 3');