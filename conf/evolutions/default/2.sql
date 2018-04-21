# ---!Ups

MERGE INTO cart VALUES (1, 500);
MERGE INTO cart VALUES (2, 199);

MERGE INTO user VALUES ('customer', 12420, 'normie@oneup.com', '$2a$10$GF9gQHb7408xiHQhP8Wuuez4ZPNP4C.05Hl1VBwXpIwAB5l6Z5YZG', 'Norman', 'User', 'Casual user.', 'xX_sNIP3rW0LF_Xx', '2018-04-17 14:46:25', 2, false, null);
MERGE INTO user VALUES ('admin', 12452, 'admin@oneup.com', '$2a$10$3e4CeGNijd3Z79B1cRufOObaYB/2gScT2fOUkEC3P5p679NvfLMTm', 'ad', 'min', 'Hardcore weeb.', 'admin', '2018-04-17 14:42:30', 1, false, null);

MERGE INTO game VALUES(1, 'Metal Bear Solid', 'The year is 1998, and the world stands on the precipice' ||
                                              ' of nuclear war. A group of terrorists, formerly' ||
                                              ' an elite special forces squad known as Foxhound,' ||
                                              ' has infiltrated and captured the nuclear disposal' ||
                                              ' facility of Shadow Moses island. Pitted against' ||
                                              ' insurmountable odds, retired agent, Solid Snake,' ||
                                              ' must infiltrate the island and put a stop to' ||
                                              ' Foxhound. Can he stop them before This text box' ||
                                              ' runs out of characters?', 59.99, 49.29, 0.2, true);

MERGE INTO game VALUES(2, 'Final Fantasy XV (not really final then, is it)',
                       'Some twink''s dad dies' ||
                       ' and he goes and becomes an angsty virgin with a deathwish. Venture with' ||
                       ' Prince Noctis as he crosses the land with his boyband and defeats' ||
                       ' ancient creatures with the help of the gods (because he can''t do it himself',
                       49.99, 97.20, 0, false);

MERGE INTO game VALUES(3, 'Car Stealers Five', 'Three men, brought together by an unfortunate twist' ||
                                               ' of fate, find themselves embroiled in a plot to' ||
                                               ' see who can create the most faithful reenaction' ||
                                               ' of Quentin Tarantino''s Resevoir Dogs. They soon' ||
                                               ' learn that the art of stealing jewelry and then feeling' ||
                                               ' bad about it afterwards is not as easy as it seems.', 14.99, 85.50, 0.6, true);

MERGE INTO media VALUES (1, 'image/jpg/cover', 'images/Metal-Gear.jpg', null);
MERGE INTO media VALUES (2, 'image/png', 'images/hashketchum.png', null);
MERGE INTO media VALUES (3, 'image/jpg/cover', 'images/ffxv.jpg', null);
MERGE INTO media VALUES (4, 'image/png/cover', 'images/gtav.png', null);

MERGE INTO user_game VALUES (12452, 1);
MERGE INTO user_game VALUES (12452, 2);
MERGE INTO user_game VALUES (12420, 1);
MERGE INTO user_game VALUES (12420, 3);

MERGE INTO game_media VALUES (1, 1);
MERGE INTO game_media VALUES (2, 3);
MERGE INTO game_media VALUES (3, 4);

MERGE INTO thread (id, poster_id, title, game_id) VALUES (1, 12452, 'my game is not working pls to help', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (2, 12452, 'this game sucks and here''s why', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (3, 12420, 'test post please ignore', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (4, 12452, 'i don''t like thing', 2);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (5, 12420, 'Oh, there once was a post on a forum', 3);

MERGE INTO post VALUES (1, 12452, 'it just broke my washing machine when i tried to install it', '1998-10-06 13:16:41', 1);
MERGE INTO post VALUES (2, 12420, 'you are retarded', '1998-11-06 21:42:04', 1);
MERGE INTO post VALUES (3, 12452, 'it is a symbol of the male fantasy as you can clearly see', '1998-10-07 17:54:21', 2);
MERGE INTO post VALUES (4, 12452, 'you just have shit taste tbqh smdh lol', '1998-10-08 02:51:32', 2);
MERGE INTO post VALUES (5, 12420, 'test i guess', '1998-10-04 16:00:20', 3);
MERGE INTO post VALUES (6, 12452, 'nice blogpost kid nobody cares. back to reddit', '1998-10-07 06:15:52', 4);
MERGE INTO post VALUES (7, 12420, 'that lacked somewhat in decorum--', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (8, 12420, 'It''s creator was lazy', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (9, 12452, 'his motivations quite hazy--', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (10, 12452, 'orum orum good luck rhyming something with this without being like a roman fucking centurion' ||
                            'jesus', '1998-10-04 21:41:20', 5);

# ---!Downs