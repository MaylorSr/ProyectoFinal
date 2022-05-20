INSERT INTO servicios (id, nombre, descripcion, imagen, precio,  duracion) VALUES (NEXTVAL('hibernate_sequence'),'Corte sin degradado','Corte para caballeros sin incluir un degradado a un precio justo.', 'https://hombresconestilo.com/wp-content/uploads/2020/11/variedad-de-cortes-de-pelo-para-calvos.jpg.webp', '9', '2.5'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Tinte','Tinte de cabello acabado con degradado', 'https://cdn-0.somosmamas.com.ar/wp-content/uploads/2019/04/1f6a0ad9ba8d51d39b2abe3ce1b140d6.jpg', '11', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion)VALUES (NEXTVAL('hibernate_sequence'),'Mechas','Tinte en una parte del cabello, incluye degradado.', 'https://www.todoelectroofertas.cl/wp-content/uploads/2019/11/826ce1866a9d67fdafa01d610fb07b41-600x600-247x247.jpg', '13', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion)VALUES (NEXTVAL('hibernate_sequence'),'Corte con degradado','Corte con degradado para los caballeros, incluída las líneas laterales y formas que desee.', 'https://modaellos.com/wp-content/uploads/2020/10/los-mejores-cortes-de-cabello-para-hombre-pelo-corto-CORTE-texturizado-pelo-rizado-istock.jpg', '11', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Mechas de gorro','Incluye colores primarios.', 'https://i.pinimg.com/474x/27/d2/a9/27d2a95b0bde573d3f56694119664c9d.jpg', '9', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Balayage ','Barre el color por el cabello. Pero, en realidad, el tinte se aplica a mano alzada con un pincel.', 'https://i.pinimg.com/474x/a9/b2/db/a9b2dba9bfa9e1847eab2f4c8915d367.jpg', '15', '1.5'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Mechas','Incluye todos los tintes que quieras. ', 'https://modaellos.com/wp-content/uploads/2020/10/los-mejores-cortes-de-cabello-para-hombre-pelo-corto-CORTE-hombres-mayores-istock.jpg', '7', '1.5'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Lavar y secar','Lavado con champú y masaje en la cabeza ', 'https://www.puntofape.com/wp-content/uploads/2010/03/higiene-capilar.jpg', '5', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Planca Cabello Corto','Planchamos el pelo y te lo dejamos liso. ', 'https://modaellos.com/wp-content/uploads/2016/06/cortes-de-pelo-corto-hombre-degradado-castano.jpg', '12', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion) VALUES (NEXTVAL('hibernate_sequence'),'Planca Cabello Largo','Planchamos el pelo y te lo dejamos liso, incluye brillo para el cabello.', 'https://modaellos.com/wp-content/uploads/2016/07/cortes-de-pelo-corto-hombre-con-tupe-moreno-ojos-claros-1.jpg', '15', '0.25'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion)VALUES (NEXTVAL('hibernate_sequence'),'Decoloración','Proceso químico que sirve para remover el color del cabello.', 'https://cortesdecabellohombre.com/wp-content/uploads/2018/03/comb-over-con-cabello-blanco.jpg', '17', '0.5'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion)VALUES (NEXTVAL('hibernate_sequence'),'Cortesito CR7','Corte del famoso futbolista.', 'https://www.todonline.co/contenido/uploads/2021/06/Cristiano-Ronaldo-corte-de-pelo-Comb-Over-Undercut-Part.webp', '20', '0.5'); 
INSERT INTO servicios (id, nombre, descripcion, imagen, precio, duracion)VALUES (NEXTVAL('hibernate_sequence'),'Cortesito Xokas','Corte del famoso YouTuber, incluye goma para amarrate el pelo.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiDo4MT-_F_979H3rXs4S4EoJMiJ4Pi29lifLutcjh7SE0Vc4AxmkVQsq8n7FAW0UzkMU&usqp=CAU', '15', '0.5'); 

INSERT INTO citas (id, nombre, telefono_cliente, fecha, hora, servicios_id)VALUES (NEXTVAL('hibernate_sequence'),'Maylor', '609835692', '2001-12-17', '19:00', 1); 
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Griz', '3079782668', '2022-05-24', '18:58', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Neall', '4617126431', '2022-09-13', '19:11', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Maressa', '6872386839', '2022-08-01', '17:36', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Waring', '6672367345', '2021-09-05', '17:46', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Erminia', '7607573370', '2022-07-05', '17:32', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Coleman', '9602883622', '2021-08-03', '17:30', 13);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Eryn', '7585335562', '2022-12-11', '16:37', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Wolfgang', '7265475771', '2022-03-01', '18:16', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Robb', '6674431758', '2022-09-05', '19:01', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Krissie', '7277319308', '2022-02-19', '17:29', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Alyson', '5072942317', '2022-07-20', '18:14', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Cherin', '8564908813', '2021-05-16', '17:23', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Giacobo', '4366429222', '2021-08-06', '17:37', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Lucian', '2387865365', '2022-06-25', '19:22', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Tanhya', '7997820166', '2021-11-22', '16:35', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Viviene', '7826284699', '2022-02-24', '18:39', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Natassia', '8081222346', '2022-02-26', '18:14', 5);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Ronnie', '7585587275', '2021-07-26', '18:35', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Egan', '9728167755', '2022-06-12', '16:52', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Bentlee', '9619936566', '2021-07-04', '16:42', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Billy', '7414265514', '2022-07-22', '17:09', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Edan', '8998145633', '2021-07-13', '17:57', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Karrah', '5789147012', '2021-07-07', '18:30', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Brien', '6123363150', '2022-01-08', '18:14', 10);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Dulce', '7779945120', '2022-06-12', '17:30', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Corty', '9665449768', '2021-06-30', '18:45', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Amelina', '5525380203', '2022-12-03', '18:14', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Vern', '3248975357', '2021-08-06', '19:09', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Christalle', '2301997924', '2021-06-03', '18:14', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Roberto', '6487823082', '2021-12-19', '17:25', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Rosa', '8722615677', '2022-03-29', '17:21', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Jordan', '1345195701', '2021-05-23', '19:29', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Norrie', '9407131058', '2022-11-17', '16:39', 10);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Nannie', '5982920246', '2022-03-26', '16:35', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Man', '6606254155', '2021-12-26', '16:33', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Vanya', '1024054324', '2021-09-02', '18:14', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Sawyere', '7101779135', '2022-01-08', '19:16', 12);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Judy', '5408852930', '2021-12-18', '19:03', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Jermaine', '3526887476', '2021-09-15', '18:54', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Amabel', '7353577727', '2021-12-28', '17:07', 12);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Ashly', '6013338725', '2022-01-10', '17:01', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Eveleen', '8014447079', '2022-01-22', '19:20', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Traci', '6023149367', '2021-06-07', '17:14', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Dorothee', '2179611933', '2022-10-30', '18:16', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Kip', '7503217405', '2021-12-28', '17:42', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Marlow', '3345291021', '2021-08-05', '19:25', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Jonell', '2313996382', '2021-06-19', '19:21', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Andee', '8064609709', '2021-09-02', '16:38', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Alicia', '2998328824', '2022-10-24', '18:28', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Carce', '9005096319', '2022-07-05', '17:38', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Lottie', '9446787572', '2022-12-20', '19:02', 5);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Kimmi', '2792505998', '2022-04-29', '18:21', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Gerhardine', '8656142835', '2022-06-24', '17:48', 13);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Alys', '1005319608', '2021-07-29', '17:50', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Addison', '1804099780', '2021-11-20', '18:15', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Man', '1936934199', '2021-09-17', '16:49', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Cobb', '6204895053', '2022-12-16', '17:23', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Johan', '8296641153', '2021-12-13', '16:36', 12);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Cortney', '9712008650', '2022-03-05', '16:53', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Kinnie', '4116796432', '2022-10-05', '18:09', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Giff', '9892775086', '2021-06-25', '17:47', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Barnaby', '8076798821', '2022-04-25', '17:32', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Nicky', '4954069651', '2022-06-25', '18:18', 12);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Umeko', '2248065953', '2021-08-11', '18:09', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Amandie', '1328915852', '2021-07-02', '19:22', 13);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Natka', '6849514623', '2022-03-26', '16:45', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Albie', '7449371210', '2022-08-12', '18:31', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Felicdad', '9004377107', '2022-09-18', '17:53', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Shirline', '9458363265', '2022-06-17', '17:11', 10);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Gerry', '3865458433', '2022-08-20', '18:11', 9);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Kevin', '7215379135', '2022-03-10', '17:12', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Sheryl', '9505290925', '2022-09-26', '17:52', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Richie', '2652326912', '2021-08-12', '16:51', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Abelard', '7306637583', '2022-04-24', '16:45', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Verile', '9734082616', '2021-12-11', '16:48', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Paddy', '4267594372', '2022-01-26', '18:41', 5);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Dani', '9751929684', '2022-07-05', '16:55', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Aurel', '6379414814', '2021-12-24', '17:12', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Vita', '3248045572', '2021-12-20', '17:57', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Elaina', '3329006022', '2021-05-22', '18:59', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Robinette', '8358546097', '2022-07-02', '18:15', 5);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Modesty', '7262470368', '2022-11-17', '17:17', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Ailyn', '2979872433', '2022-03-13', '16:54', 2);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Erhart', '9543932337', '2022-03-08', '18:57', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Cindie', '3337352860', '2022-09-20', '17:48', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Janifer', '4686823371', '2021-09-03', '18:33', 13);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Quinton', '6759364092', '2021-05-31', '17:39', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Mady', '1245679348', '2021-08-02', '18:21', 1);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Robbie', '9974245995', '2021-11-06', '17:52', 8);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Neile', '8541571956', '2021-05-11', '17:49', 13);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Kingsley', '6907822083', '2022-12-29', '18:19', 6);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Gerrie', '8537531761', '2022-07-10', '17:09', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Pasquale', '2702605144', '2022-06-21', '17:12', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Bartholomeo', '6636850633', '2022-09-13', '18:36', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Vaclav', '6217352996', '2022-11-18', '17:29', 3);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Hally', '5049088284', '2022-02-22', '17:49', 4);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Blondy', '5481485110', '2022-01-02', '17:31', 12);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Wait', '8608560472', '2022-04-07', '17:02', 7);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Daloris', '8669289632', '2021-09-03', '18:01', 11);
insert into citas (id, nombre, telefono_cliente, fecha, hora, servicios_id) values (NEXTVAL('hibernate_sequence'), 'Masha', '6368432996', '2022-09-24', '17:20', 1);
