-- Catalogs
insert into catalog (code, name, description, parameter, parent, audit_user)
values ('019b7679-ab4c-739e-b2d2-5aa276cab79a', 'Processes', 'Processes', null, null, 'SYSTEM');

insert into catalog (code, name, description, parameter, parent, audit_user)
values ('019b7678-85c4-7222-8dbd-24ec1d24c529', 'Process 1', 'Description for Process 1', null, '019b7679-ab4c-739e-b2d2-5aa276cab79a', 'SYSTEM'),
       ('019b7687-aa33-7c1f-bc72-620cab6188e8', 'Process 2', 'Description for Process 2', null, '019b7679-ab4c-739e-b2d2-5aa276cab79a', 'SYSTEM');

-- Insert Country: Ecuador
INSERT INTO administrative_division (id, name, description, parent, audit_user)
VALUES (1, 'Ecuador', 'country', NULL, 'samagua');

-- Insert Provinces of Ecuador
INSERT INTO administrative_division (id, name, description, parent, audit_user)
VALUES (2, 'Azuay', 'province', 1, 'samagua'),
       (3, 'Bolívar', 'province', 1, 'samagua'),
       (4, 'Cañar', 'province', 1, 'samagua'),
       (5, 'Carchi', 'province', 1, 'samagua'),
       (6, 'Chimborazo', 'province', 1, 'samagua'),
       (7, 'Cotopaxi', 'province', 1, 'samagua'),
       (8, 'El Oro', 'province', 1, 'samagua'),
       (9, 'Esmeraldas', 'province', 1, 'samagua'),
       (10, 'Galápagos', 'province', 1, 'samagua'),
       (11, 'Guayas', 'province', 1, 'samagua'),
       (12, 'Imbabura', 'province', 1, 'samagua'),
       (13, 'Loja', 'province', 1, 'samagua'),
       (14, 'Los Ríos', 'province', 1, 'samagua'),
       (15, 'Manabí', 'province', 1, 'samagua'),
       (16, 'Morona Santiago', 'province', 1, 'samagua'),
       (17, 'Napo', 'province', 1, 'samagua'),
       (18, 'Orellana', 'province', 1, 'samagua'),
       (19, 'Pastaza', 'province', 1, 'samagua'),
       (20, 'Pichincha', 'province', 1, 'samagua'),
       (21, 'Santa Elena', 'province', 1, 'samagua'),
       (22, 'Santo Domingo de los Tsáchilas', 'province', 1, 'samagua'),
       (23, 'Sucumbíos', 'province', 1, 'samagua'),
       (24, 'Tungurahua', 'province', 1, 'samagua'),
       (25, 'Zamora Chinchipe', 'province', 1, 'samagua');

-- password: password123
INSERT INTO tourist (username, points, profile_picture, badge, audit_user) VALUES ('samagua', 100, 'profile_pic.png', 'gold_badge', 'samagua');
INSERT INTO tourist (username, points, profile_picture, badge, audit_user) VALUES ('john_doe', 100, 'profile_pic.png', 'gold_badge', 'samagua');

INSERT INTO tourism_experience (id, province, city, address, latitude, longitude, name, description, type, audit_user)
VALUES (1, 20, 'Quito', 'Calle García Moreno', '-0.2201641', '-78.5123274', 'La Compañía de Jesús', 'A historic church known for its elaborate baroque architecture.', 'Cultural', 'samagua');

INSERT INTO tourism_experience (id, province, city, address, latitude, longitude, name, description, type, audit_user)
VALUES (2, 10, 'Puerto Ayora', 'Avenida Charles Darwin', '-0.7403', '-90.3122', 'Charles Darwin Research Station', 'A biological research station and active breeding center for endangered species.', 'Natural', 'samagua');

INSERT INTO tourism_experience (id, province, city, address, latitude, longitude, name, description, type, audit_user)
VALUES (3, 2, 'Cuenca', 'Calle Larga', '-2.90055', '-79.00453', 'El Barranco', 'A scenic riverside area with colonial architecture and cultural attractions.', 'Cultural', 'samagua');

INSERT INTO tourism_experience (id, province, city, address, latitude, longitude, name, description, type, audit_user)
VALUES (4, 12, 'Otavalo', 'Plaza de los Ponchos', '0.2333', '-78.2667', 'Otavalo Market', 'A famous market known for its vibrant textiles and crafts.', 'Cultural', 'samagua');

INSERT INTO tourism_experience (id, province, city, address, latitude, longitude, name, description, type, audit_user)
VALUES (5, 24, 'Baños', 'Ruta de las Cascadas', '-1.396', '-78.422', 'Pailón del Diablo', 'A stunning waterfall and popular tourist attraction.', 'Natural', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Experience 1', 'Description for Experience 1', 'image', 'experience1.svg', '/tmp-images/tourism-experience-media/experience1.svg', 'image/svg+xml', '1', '019b7678-85c4-7222-8dbd-24ec1d24c529','samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Experience 2', 'Description for Experience 2', 'image', 'experience2.svg', '/tmp-images/tourism-experience-media/experience2.svg', 'image/svg+xml', '2', '019b7678-85c4-7222-8dbd-24ec1d24c529', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Experience 3', 'Description for Experience 3', 'image', 'experience3.svg', '/tmp-images/tourism-experience-media/experience3.svg', 'image/svg+xml', '3', '019b7678-85c4-7222-8dbd-24ec1d24c529', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Experience 4', 'Description for Experience 4', 'image', 'experience4.svg', '/tmp-images/tourism-experience-media/experience4.svg', 'image/svg+xml', '4', '019b7678-85c4-7222-8dbd-24ec1d24c529', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Experience 5', 'Description for Experience 5', 'image', 'experience5.svg', '/tmp-images/tourism-experience-media/experience5.svg', 'image/svg+xml', '5', '019b7678-85c4-7222-8dbd-24ec1d24c529', 'samagua');

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (1, 'Achievement Azuay', 'Achievement description for Azuay', 100, 'type1', 'samagua', 2);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (2, 'Achievement Bolívar', 'Achievement description for Bolívar', 100, 'type1', 'samagua', 3);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (3, 'Achievement Cañar', 'Achievement description for Cañar', 100, 'type1', 'samagua', 4);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (4, 'Achievement Carchi', 'Achievement description for Carchi', 100, 'type1', 'samagua', 5);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (5, 'Achievement Chimborazo', 'Achievement description for Chimborazo', 100, 'type1', 'samagua', 6);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (6, 'Achievement Cotopaxi', 'Achievement description for Cotopaxi', 100, 'type1', 'samagua', 7);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (7, 'Achievement El Oro', 'Achievement description for El Oro', 100, 'type1', 'samagua', 8);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (8, 'Achievement Esmeraldas', 'Achievement description for Esmeraldas', 100, 'type1', 'samagua', 9);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (9, 'Achievement Galápagos', 'Achievement description for Galápagos', 100, 'type1', 'samagua', 10);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (10, 'Achievement Guayas', 'Achievement description for Guayas', 100, 'type1', 'samagua', 11);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (11, 'Achievement Imbabura', 'Achievement description for Imbabura', 100, 'type1', 'samagua', 12);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (12, 'Achievement Loja', 'Achievement description for Loja', 100, 'type1', 'samagua', 13);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (13, 'Achievement Los Ríos', 'Achievement description for Los Ríos', 100, 'type1', 'samagua', 14);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (14, 'Achievement Manabí', 'Achievement description for Manabí', 100, 'type1', 'samagua', 15);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (15, 'Achievement Morona Santiago', 'Achievement description for Morona Santiago', 100, 'type1', 'samagua', 16);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (16, 'Achievement Napo', 'Achievement description for Napo', 100, 'type1', 'samagua', 17);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (17, 'Achievement Orellana', 'Achievement description for Orellana', 100, 'type1', 'samagua', 18);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (18, 'Achievement Pastaza', 'Achievement description for Pastaza', 100, 'type1', 'samagua', 19);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (19, 'Achievement Pichincha', 'Achievement description for Pichincha', 100, 'type1', 'samagua', 20);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (20, 'Achievement Santa Elena', 'Achievement description for Santa Elena', 100, 'type1', 'samagua', 21);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (21, 'Achievement Santo Domingo de los Tsáchilas', 'Achievement description for Santo Domingo de los Tsáchilas', 100, 'type1', 'samagua', 22);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (22, 'Achievement Sucumbíos', 'Achievement description for Sucumbíos', 100, 'type1', 'samagua', 23);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (23, 'Achievement Tungurahua', 'Achievement description for Tungurahua', 100, 'type1', 'samagua', 24);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (24, 'Achievement Zamora Chinchipe', 'Achievement description for Zamora Chinchipe', 100, 'type1', 'samagua', 25);

INSERT INTO achievement (id, title, description, points, point_type, audit_user, administrative_division)
VALUES (25, 'Achievement Ecuador', 'Achievement description for Ecuador', 100, 'type1', 'samagua', 1);

INSERT INTO experience_review (rating, title, description, tourist, tourism_experience, audit_user)
VALUES (4.5, 'Amazing Experience', 'The architecture was breathtaking and the history fascinating.', 1, 1, 'samagua');

INSERT INTO experience_review (rating, title, description, tourist, tourism_experience, audit_user)
VALUES (4.8, 'Incredible Visit', 'The research station was very informative and inspiring.', 1, 2, 'samagua');

INSERT INTO experience_review (rating, title, description, tourist, tourism_experience, audit_user)
VALUES (4.2, 'Beautiful Scenery', 'The riverside area was peaceful and full of cultural charm.', 1, 3, 'samagua');

INSERT INTO experience_review (rating, title, description, tourist, tourism_experience, audit_user)
VALUES (4.7, 'Vibrant Market', 'The textiles and crafts were stunning and unique.', 1, 4, 'samagua');

INSERT INTO experience_review (rating, title, description, tourist, tourism_experience, audit_user)
VALUES (4.9, 'Breathtaking Waterfall', 'The waterfall was absolutely stunning and worth the visit.', 1, 5, 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Review Media 1', 'Media description for Review 1', 'image', 'review1.svg', '/tmp-images/experience-review-media/review1.svg', 'image/svg+xml', '1', '019b7687-aa33-7c1f-bc72-620cab6188e8', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Review Media 2', 'Media description for Review 2', 'image', 'review2.svg', '/tmp-images/experience-review-media/review2.svg', 'image/svg+xml', '2', '019b7687-aa33-7c1f-bc72-620cab6188e8', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Review Media 3', 'Media description for Review 3', 'image', 'review3.svg', '/tmp-images/experience-review-media/review3.svg', 'image/svg+xml', '3', '019b7687-aa33-7c1f-bc72-620cab6188e8', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Review Media 4', 'Media description for Review 4', 'image', 'review4.svg', '/tmp-images/experience-review-media/review4.svg', 'image/svg+xml', '4', '019b7687-aa33-7c1f-bc72-620cab6188e8', 'samagua');

INSERT INTO process_media (title, description, media_type, file_name, file_path, mime_type, process_code, process_type, audit_user)
VALUES ('Review Media 5', 'Media description for Review 5', 'image', 'review5.svg', '/tmp-images/experience-review-media/review5.svg', 'image/svg+xml', '5', '019b7687-aa33-7c1f-bc72-620cab6188e8', 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 1, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 2, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 3, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 4, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 5, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 6, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 7, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 8, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 9, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 10, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 11, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 12, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 13, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 14, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 15, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 16, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 17, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 18, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 19, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 20, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 21, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 22, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 23, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 24, NOW(), 'samagua');

INSERT INTO tourist_achievement (tourist, achievement, creation_date, audit_user)
VALUES (1, 25, NOW(), 'samagua');

INSERT INTO tourist_score (points, creation_date, point_type, tourist, audit_user)
VALUES (100, NOW(), 'type1', 1, 'samagua');

INSERT INTO tourist_score (points, creation_date, point_type, tourist, audit_user)
VALUES (200, NOW(), 'type2', 1, 'samagua');

INSERT INTO tourist_score (points, creation_date, point_type, tourist, audit_user)
VALUES (150, NOW(), 'type1', 2, 'samagua');

INSERT INTO tourist_score (points, creation_date, point_type, tourist, audit_user)
VALUES (250, NOW(), 'type2', 2, 'samagua');