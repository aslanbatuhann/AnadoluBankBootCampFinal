CREATE TABLE public.policy (
    policy_id bigint PRIMARY KEY NOT NULL,
	policy_num bigint NOT NULL,
    date_policy varchar NOT NULL,
    unit_cost bigint NOT null,
    car_model varchar null

);

CREATE TABLE public.customer (
    cust_id bigint PRIMARY KEY NOT NULL,
	first_name varchar NOT NULL,
    last_name varchar NOT NULL,
    age bigint NOT NULL,
    phone varchar NOT null

);

CREATE TABLE public.agent (
    agent_id bigint PRIMARY KEY NOT NULL,
	first_name varchar NOT NULL,
    last_name varchar NOT NULL,
    user_name varchar NOT NULL,
    password varchar NOT NULL

);

    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (1, 166, '2021-12-09 16:58:28', 513, 'FJ Cruiser');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (2, 349, '2022-07-08 07:16:33', 2623, '940');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (3, 349, '2019-10-31 17:56:12', 2455, 'SLX');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (4, 178, '2018-01-03 14:15:19', 1774, 'Tredia');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (5, 479, '2019-11-20 20:42:32', 1956, 'Bronco II');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (6, 24, '2022-03-19 23:10:29', 657, 'tC');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (7, 348, '2019-07-24 17:22:52', 1097, 'Continental');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (8, 284, '2020-04-29 08:47:18', 2488, 'Range Rover');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (9, 98, '2021-04-22 19:38:49', 1128, 'Grand Caravan');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (10, 72, '2021-12-21 04:43:25', 2036, 'Durango');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (11, 68, '2018-10-13 01:24:54', 2914, 'Dakota Club');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (12, 336, '2019-03-05 10:29:14', 932, 'Armada');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (13, 128, '2019-12-10 07:40:16', 2948, 'Azure');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (14, 523, '2018-11-22 20:37:52', 922, 'S2000');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (15, 276, '2021-04-13 00:11:28', 2225, 'Altima');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (16, 512, '2018-07-30 04:17:01', 525, 'Malibu');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (17, 376, '2018-09-02 00:50:08', 2291, 'B9 Tribeca');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (18, 515, '2018-12-03 13:22:56', 2833, 'Sidekick');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (19, 81, '2021-02-02 00:59:51', 693, 'Sable');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (20, 143, '2019-10-02 00:38:08', 1769, 'Aveo');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (21, 210, '2020-04-28 02:22:43', 2483, '3500');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (22, 496, '2022-04-22 20:24:13', 1903, 'Z4');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (23, 329, '2019-07-25 20:56:14', 2445, 'Tempo');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (24, 43, '2022-01-24 06:58:41', 2583, 'Montero Sport');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (25, 407, '2021-05-22 15:40:48', 1942, 'Intrepid');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (26, 223, '2019-12-29 12:39:57', 2619, 'Alliance');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (27, 209, '2019-10-24 03:35:24', 1169, '530');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (28, 402, '2020-06-01 10:42:01', 1224, 'XJ Series');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (29, 225, '2018-05-05 02:53:47', 1565, 'Soul');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (30, 520, '2020-12-13 07:58:00', 1133, 'Regal');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (31, 300, '2021-05-08 18:27:09', 2731, 'Grand Caravan');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (32, 31, '2018-03-23 20:10:52', 1628, '911');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (33, 437, '2019-08-17 02:23:10', 1830, 'Range Rover');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (34, 146, '2018-06-27 15:03:50', 1145, 'SJ');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (35, 147, '2022-05-01 11:30:51', 2808, 'Sunfire');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (36, 439, '2020-07-07 08:35:53', 2460, 'LX');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (37, 327, '2020-11-25 12:03:15', 1906, 'H2 SUV');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (38, 213, '2018-10-21 16:10:50', 2799, 'Mirage');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (39, 286, '2022-07-20 18:37:32', 2414, 'E250');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (40, 136, '2021-05-30 16:15:56', 2353, 'CL65 AMG');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (41, 347, '2021-04-22 18:56:55', 1413, 'F350');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (42, 248, '2019-10-17 18:54:38', 2310, 'Wrangler');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (43, 434, '2019-05-22 11:43:26', 2331, '9-7X');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (44, 34, '2018-06-14 07:46:47', 1193, 'Range Rover Sport');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (45, 67, '2021-09-05 18:53:00', 2318, 'LS');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (46, 133, '2019-09-02 16:55:57', 896, 'Silverado 2500');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (47, 337, '2022-01-29 00:56:19', 2930, 'Ram Van B250');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (48, 13, '2018-08-23 14:54:53', 2291, 'A4');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (49, 321, '2021-08-22 01:34:19', 1087, 'V40');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (50, 194, '2019-10-05 01:13:58', 1926, '4Runner');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (51, 196, '2022-01-01 10:41:10', 1972, 'Grand Marquis');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (52, 428, '2020-10-16 04:07:23', 626, 'GTI');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (53, 230, '2020-05-19 17:24:52', 544, 'Blazer');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (54, 445, '2020-11-28 13:18:04', 652, 'Legacy');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (55, 464, '2019-01-22 07:49:04', 1502, 'Esprit');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (56, 175, '2019-10-13 21:16:36', 889, 'EXP');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (57, 82, '2019-12-06 22:33:35', 593, 'Corvette');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (58, 287, '2020-06-22 03:40:50', 2438, 'DeVille');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (59, 451, '2018-03-08 05:53:41', 1740, 'Cabriolet');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (60, 61, '2021-12-26 09:16:25', 2081, 'Landaulet');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (61, 512, '2020-01-14 08:30:34', 1656, 'Golf');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (62, 81, '2021-05-30 05:43:49', 1799, 'A4');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (63, 439, '2018-04-08 05:18:02', 1209, 'Quattroporte');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (64, 4, '2019-02-25 21:05:44', 2605, 'Town & Country');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (65, 181, '2021-02-11 20:23:26', 2777, 'S-Class');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (66, 241, '2020-09-15 00:15:09', 1772, 'New Yorker');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (67, 315, '2022-05-14 13:09:35', 2199, 'Silverado 3500');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (68, 177, '2018-03-13 15:14:08', 2342, 'Grand Prix');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (69, 426, '2018-07-07 03:09:45', 2196, 'Type 2');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (70, 252, '2018-02-02 16:45:05', 2223, 'LaCrosse');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (71, 490, '2020-07-03 22:10:32', 1808, 'Ranger');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (72, 204, '2019-10-21 23:04:10', 1755, '900');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (73, 240, '2018-03-23 07:04:50', 1349, 'New Beetle');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (74, 492, '2020-04-19 13:13:37', 927, 'Cutlass Supreme');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (75, 6, '2019-03-03 10:44:06', 2350, '300M');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (76, 135, '2019-04-28 14:01:30', 1909, 'Impreza');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (77, 504, '2022-01-25 06:43:57', 2109, 'Mirage');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (78, 161, '2018-01-03 08:23:48', 2087, 'Estate');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (79, 270, '2021-12-18 01:18:00', 887, 'SL-Class');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (80, 447, '2018-01-09 05:17:13', 1972, 'Savana');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (81, 321, '2022-05-30 03:12:23', 2272, 'Vandura 1500');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (82, 467, '2018-02-21 14:20:09', 2093, 'Windstar');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (83, 197, '2019-01-19 04:32:51', 1752, 'Defender 90');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (84, 385, '2018-11-17 18:15:07', 1780, 'E-Series');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (85, 86, '2018-06-02 00:41:27', 1168, 'Accord');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (86, 478, '2020-06-23 06:48:36', 1820, 'S10 Blazer');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (87, 498, '2021-08-02 01:37:53', 793, 'RVR');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (88, 465, '2018-11-01 23:48:34', 2951, 'Elise');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (89, 468, '2022-04-09 20:02:55', 2794, 'Land Cruiser');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (90, 174, '2021-03-26 14:34:44', 1571, 'Ciera');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (91, 474, '2021-06-28 01:36:33', 2916, 'Maxima');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (92, 236, '2021-03-04 15:43:34', 637, 'Contour');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (93, 525, '2021-02-21 09:09:47', 2307, 'Yukon');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (94, 295, '2021-06-07 06:09:38', 800, 'LS');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (95, 274, '2019-07-31 16:53:44', 1703, 'Milan');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (96, 226, '2020-06-23 06:21:18', 1918, 'Skyhawk');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (97, 496, '2022-07-06 01:27:36', 1269, 'E150');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (98, 235, '2018-04-08 16:47:12', 911, 'Esprit');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (99, 506, '2022-04-04 02:40:19', 2068, '9000');
    insert into policy (policy_id, policy_num, date_policy, unit_cost, car_model) values (100, 14, '2020-12-29 23:07:13', 1782, 'Grand Am');


    insert into customer (cust_id, first_name, last_name, age, phone) values (1, 'Hortensia', 'Harness', 31, '(687) 9665108');
    insert into customer (cust_id, first_name, last_name, age, phone) values (2, 'Hedi', 'Cauderlie', 92, '(335) 1087720');
    insert into customer (cust_id, first_name, last_name, age, phone) values (3, 'Garret', 'Raiment', 29, '(879) 4740586');
    insert into customer (cust_id, first_name, last_name, age, phone) values (4, 'Manolo', 'Deignan', 63, '(300) 4120263');
    insert into customer (cust_id, first_name, last_name, age, phone) values (5, 'Phylis', 'McNair', 77, '(989) 3317355');
    insert into customer (cust_id, first_name, last_name, age, phone) values (6, 'Melloney', 'Arrowsmith', 89, '(319) 6202384');
    insert into customer (cust_id, first_name, last_name, age, phone) values (7, 'Thayne', 'Reijmers', 54, '(271) 6578321');
    insert into customer (cust_id, first_name, last_name, age, phone) values (8, 'Agnes', 'Bowbrick', 46, '(119) 5144450');
    insert into customer (cust_id, first_name, last_name, age, phone) values (9, 'Gabriele', 'Puffett', 83, '(869) 2851216');
    insert into customer (cust_id, first_name, last_name, age, phone) values (10, 'Sophey', 'Jahnel', 21, '(528) 9363803');
    insert into customer (cust_id, first_name, last_name, age, phone) values (11, 'Dyane', 'Hamprecht', 85, '(369) 4397049');
    insert into customer (cust_id, first_name, last_name, age, phone) values (12, 'Ariela', 'Ickeringill', 69, '(267) 4057082');
    insert into customer (cust_id, first_name, last_name, age, phone) values (13, 'Nonah', 'Oxborough', 20, '(787) 4311147');
    insert into customer (cust_id, first_name, last_name, age, phone) values (14, 'Edmund', 'Poole', 53, '(462) 7704838');
    insert into customer (cust_id, first_name, last_name, age, phone) values (15, 'Nomi', 'Tackes', 39, '(246) 2939136');
    insert into customer (cust_id, first_name, last_name, age, phone) values (16, 'Kilian', 'Bonnett', 62, '(905) 2579668');
    insert into customer (cust_id, first_name, last_name, age, phone) values (17, 'Oneida', 'Sjollema', 44, '(716) 5852448');
    insert into customer (cust_id, first_name, last_name, age, phone) values (18, 'Jemmy', 'Haskayne', 90, '(187) 6612823');
    insert into customer (cust_id, first_name, last_name, age, phone) values (19, 'Ellsworth', 'Fairham', 39, '(461) 7579095');
    insert into customer (cust_id, first_name, last_name, age, phone) values (20, 'Clarabelle', 'Allain', 42, '(584) 8653895');
    insert into customer (cust_id, first_name, last_name, age, phone) values (21, 'Shelley', 'Hazlehurst', 73, '(453) 6982158');
    insert into customer (cust_id, first_name, last_name, age, phone) values (22, 'Mariana', 'Vasilic', 81, '(213) 9249031');
    insert into customer (cust_id, first_name, last_name, age, phone) values (23, 'Sabina', 'Vannini', 30, '(431) 4338638');
    insert into customer (cust_id, first_name, last_name, age, phone) values (24, 'Lemmy', 'Noddle', 64, '(929) 7992549');
    insert into customer (cust_id, first_name, last_name, age, phone) values (25, 'Jerrie', 'Marchenko', 66, '(124) 9808475');
    insert into customer (cust_id, first_name, last_name, age, phone) values (26, 'Natale', 'Stoate', 50, '(823) 5098299');
    insert into customer (cust_id, first_name, last_name, age, phone) values (27, 'Joanna', 'Coudray', 35, '(250) 8675027');
    insert into customer (cust_id, first_name, last_name, age, phone) values (28, 'Jacynth', 'Mocher', 91, '(182) 3342546');
    insert into customer (cust_id, first_name, last_name, age, phone) values (29, 'Dar', 'Searson', 34, '(735) 9975365');
    insert into customer (cust_id, first_name, last_name, age, phone) values (30, 'Brooke', 'Scotsbrook', 42, '(570) 6683006');
    insert into customer (cust_id, first_name, last_name, age, phone) values (31, 'Agatha', 'Buret', 24, '(649) 9066400');
    insert into customer (cust_id, first_name, last_name, age, phone) values (32, 'Osmund', 'Meneghi', 82, '(164) 8500296');
    insert into customer (cust_id, first_name, last_name, age, phone) values (33, 'Roscoe', 'Vassbender', 20, '(955) 2779313');
    insert into customer (cust_id, first_name, last_name, age, phone) values (34, 'Earle', 'Knowlys', 29, '(709) 1973705');
    insert into customer (cust_id, first_name, last_name, age, phone) values (35, 'Kendra', 'Havill', 86, '(854) 2465858');
    insert into customer (cust_id, first_name, last_name, age, phone) values (36, 'Ofilia', 'Hitscher', 74, '(543) 9964451');
    insert into customer (cust_id, first_name, last_name, age, phone) values (37, 'Merrielle', 'Tuckwood', 41, '(428) 9775778');
    insert into customer (cust_id, first_name, last_name, age, phone) values (38, 'Carlo', 'McIsaac', 40, '(993) 6511351');
    insert into customer (cust_id, first_name, last_name, age, phone) values (39, 'Nickie', 'Terrazzo', 31, '(372) 3658436');
    insert into customer (cust_id, first_name, last_name, age, phone) values (40, 'Clarance', 'Downie', 26, '(972) 8192335');
    insert into customer (cust_id, first_name, last_name, age, phone) values (41, 'Christie', 'Cess', 67, '(635) 2946346');
    insert into customer (cust_id, first_name, last_name, age, phone) values (42, 'Antonina', 'De Cruze', 81, '(705) 4510044');
    insert into customer (cust_id, first_name, last_name, age, phone) values (43, 'Frances', 'O'' Driscoll', 55, '(893) 7176645');
    insert into customer (cust_id, first_name, last_name, age, phone) values (44, 'Elihu', 'Feenan', 70, '(438) 4906224');
    insert into customer (cust_id, first_name, last_name, age, phone) values (45, 'Ware', 'Golden of Ireland', 67, '(509) 8237434');
    insert into customer (cust_id, first_name, last_name, age, phone) values (46, 'Ban', 'Blanko', 31, '(845) 9996364');
    insert into customer (cust_id, first_name, last_name, age, phone) values (47, 'Conn', 'Vasyutochkin', 91, '(101) 3967217');
    insert into customer (cust_id, first_name, last_name, age, phone) values (48, 'Kandace', 'Gooderson', 78, '(169) 1763057');
    insert into customer (cust_id, first_name, last_name, age, phone) values (49, 'Xymenes', 'Cullnean', 50, '(114) 6066246');
    insert into customer (cust_id, first_name, last_name, age, phone) values (50, 'Arney', 'Ismay', 81, '(864) 3359996');
    insert into customer (cust_id, first_name, last_name, age, phone) values (51, 'Darryl', 'Brilon', 29, '(660) 2542298');
    insert into customer (cust_id, first_name, last_name, age, phone) values (52, 'Shandra', 'Duxfield', 75, '(908) 9481096');
    insert into customer (cust_id, first_name, last_name, age, phone) values (53, 'Josie', 'Arnaut', 62, '(161) 5382896');
    insert into customer (cust_id, first_name, last_name, age, phone) values (54, 'Garrick', 'Elleton', 55, '(589) 4498412');
    insert into customer (cust_id, first_name, last_name, age, phone) values (55, 'Ferd', 'Patria', 46, '(916) 1506904');
    insert into customer (cust_id, first_name, last_name, age, phone) values (56, 'Federico', 'Eastgate', 72, '(191) 2469798');
    insert into customer (cust_id, first_name, last_name, age, phone) values (57, 'Glenden', 'Danielsen', 27, '(923) 1673467');
    insert into customer (cust_id, first_name, last_name, age, phone) values (58, 'Hilary', 'Huison', 50, '(454) 2937151');
    insert into customer (cust_id, first_name, last_name, age, phone) values (59, 'Tanny', 'Losano', 64, '(557) 3987258');
    insert into customer (cust_id, first_name, last_name, age, phone) values (60, 'Fabe', 'Hasser', 60, '(758) 2940858');
    insert into customer (cust_id, first_name, last_name, age, phone) values (61, 'Bibbie', 'Crouch', 70, '(894) 7130544');
    insert into customer (cust_id, first_name, last_name, age, phone) values (62, 'Kat', 'Gauden', 18, '(337) 8954596');
    insert into customer (cust_id, first_name, last_name, age, phone) values (63, 'Julita', 'Petteford', 70, '(294) 9977629');
    insert into customer (cust_id, first_name, last_name, age, phone) values (64, 'Dewie', 'Joliffe', 18, '(392) 4486277');
    insert into customer (cust_id, first_name, last_name, age, phone) values (65, 'Gabie', 'Badder', 33, '(815) 7324218');
    insert into customer (cust_id, first_name, last_name, age, phone) values (66, 'Sarina', 'Mixhel', 42, '(906) 6551527');
    insert into customer (cust_id, first_name, last_name, age, phone) values (67, 'Aggie', 'Longmaid', 56, '(985) 9685965');
    insert into customer (cust_id, first_name, last_name, age, phone) values (68, 'Granville', 'O''Keevan', 25, '(528) 6988368');
    insert into customer (cust_id, first_name, last_name, age, phone) values (69, 'Tome', 'Dosdell', 87, '(674) 2585280');
    insert into customer (cust_id, first_name, last_name, age, phone) values (70, 'Ania', 'Michele', 89, '(254) 7540471');
    insert into customer (cust_id, first_name, last_name, age, phone) values (71, 'Karin', 'Fancet', 42, '(565) 2201532');
    insert into customer (cust_id, first_name, last_name, age, phone) values (72, 'Octavius', 'Wandless', 57, '(915) 7935739');
    insert into customer (cust_id, first_name, last_name, age, phone) values (73, 'Valaria', 'Lount', 55, '(974) 6709564');
    insert into customer (cust_id, first_name, last_name, age, phone) values (74, 'Shurlocke', 'Steward', 29, '(955) 4170058');
    insert into customer (cust_id, first_name, last_name, age, phone) values (75, 'Monty', 'Varga', 28, '(165) 2203365');
    insert into customer (cust_id, first_name, last_name, age, phone) values (76, 'Ardis', 'Grass', 77, '(740) 1361500');
    insert into customer (cust_id, first_name, last_name, age, phone) values (77, 'Verene', 'Diggar', 66, '(807) 8026726');
    insert into customer (cust_id, first_name, last_name, age, phone) values (78, 'Lorne', 'Lindup', 46, '(656) 3454478');
    insert into customer (cust_id, first_name, last_name, age, phone) values (79, 'Yevette', 'Avis', 67, '(723) 3565284');
    insert into customer (cust_id, first_name, last_name, age, phone) values (80, 'Caressa', 'Enochsson', 35, '(273) 2519499');
    insert into customer (cust_id, first_name, last_name, age, phone) values (81, 'Clarey', 'Lafont', 88, '(501) 8095468');
    insert into customer (cust_id, first_name, last_name, age, phone) values (82, 'Sollie', 'Wrightim', 67, '(527) 9530920');
    insert into customer (cust_id, first_name, last_name, age, phone) values (83, 'Antonina', 'Dimberline', 73, '(934) 5388259');
    insert into customer (cust_id, first_name, last_name, age, phone) values (84, 'Hannis', 'Sexcey', 85, '(344) 7292480');
    insert into customer (cust_id, first_name, last_name, age, phone) values (85, 'Weylin', 'Impleton', 40, '(697) 5589576');
    insert into customer (cust_id, first_name, last_name, age, phone) values (86, 'Andrus', 'Evered', 78, '(818) 5225046');
    insert into customer (cust_id, first_name, last_name, age, phone) values (87, 'Timmie', 'Hamments', 45, '(879) 5078648');
    insert into customer (cust_id, first_name, last_name, age, phone) values (88, 'Kara', 'Jagiello', 52, '(919) 4126128');
    insert into customer (cust_id, first_name, last_name, age, phone) values (89, 'Francoise', 'Gerhartz', 64, '(646) 9932531');
    insert into customer (cust_id, first_name, last_name, age, phone) values (90, 'Helena', 'Steinson', 51, '(638) 3229329');
    insert into customer (cust_id, first_name, last_name, age, phone) values (91, 'Josepha', 'Covington', 89, '(705) 2436608');
    insert into customer (cust_id, first_name, last_name, age, phone) values (92, 'Clarke', 'Tubbles', 75, '(166) 6620873');
    insert into customer (cust_id, first_name, last_name, age, phone) values (93, 'Bobbe', 'Wansbury', 64, '(327) 5163289');
    insert into customer (cust_id, first_name, last_name, age, phone) values (94, 'Junia', 'Scandrett', 49, '(607) 8925372');
    insert into customer (cust_id, first_name, last_name, age, phone) values (95, 'Joshua', 'Neaves', 67, '(616) 3004216');
    insert into customer (cust_id, first_name, last_name, age, phone) values (96, 'Noah', 'Lawling', 46, '(889) 1257701');
    insert into customer (cust_id, first_name, last_name, age, phone) values (97, 'Ethyl', 'Awmack', 68, '(872) 8313121');
    insert into customer (cust_id, first_name, last_name, age, phone) values (98, 'Gaynor', 'Allender', 75, '(116) 8058221');
    insert into customer (cust_id, first_name, last_name, age, phone) values (99, 'Carroll', 'Marns', 38, '(133) 5189857');
    insert into customer (cust_id, first_name, last_name, age, phone) values (100, 'Rebecca', 'Brumble', 33, '(561) 4584413');




    INSERT INTO public.agent (agent_id,first_name,last_name,user_name,"password")
	VALUES (1,'batuhan','aslan','batuhan1','12345');

	INSERT INTO public.agent (agent_id,first_name,last_name,user_name,"password")
    VALUES (2,'ahmet','aslan','ahmet11','987654');

    INSERT INTO public.agent (agent_id,first_name,last_name,user_name,"password")
     VALUES (3,'ekin','aslan','ekin111','54321');


