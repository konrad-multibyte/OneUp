# ---!Ups

MERGE INTO game VALUES(1, 'Metal Bear Solid', 'The year is 1998, and the world stands on the precipice' ||
                                              ' of nuclear war. A group of terrorists, formerly' ||
                                              ' an elite special forces squad known as Foxhound,' ||
                                              ' has infiltrated and captured the nuclear disposal' ||
                                              ' facility of Shadow Moses island. Pitted against' ||
                                              ' insurmountable odds, retired agent, Solid Snake,' ||
                                              ' must infiltrate the island and put a stop to' ||
                                              ' Foxhound. Can he stop them before This text box' ||
                                              ' runs out of characters?', 59.99, 49.29, 0.2);

MERGE INTO game VALUES(2, 'Final Fantasy 15 (not really final then, is it)',
                       'Some twink''s dad dies' ||
                       ' and he goes and becomes an angsty virgin with a deathwish. Venture with' ||
                       ' Prince Noctis as he crosses the land with his boyband and defeats' ||
                       ' ancient creatures with the help of the gods (because he can''t do it himself',
                       49.99, 97.20, 0);

MERGE INTO game VALUES(3, 'Car Stealers Five', 'Three men, brought together by an unfortunate twist' ||
                                               ' of fate, find themselves embroiled in a plot to' ||
                                               ' see who can create the most faithful reenaction' ||
                                               ' of Quentin Tarantino''s Resevoir Dogs. They soon' ||
                                               ' learn that the art of stealing jewellery and then feeling' ||
                                               ' bad about it afterwards is not as easy as it seems.', 14.99, 85.50, 0.6);

MERGE INTO media VALUES (1, 'image/jpg/cover', 'images/Metal-Gear.jpg', null);
MERGE INTO media VALUES (2, 'image/png', 'images/hashketchum.png', null);
MERGE INTO media VALUES (3, 'image/jpg/cover', 'images/ffxv.jpg', null);
MERGE INTO media VALUES (4, 'image/png/cover', 'images/gtav.png', null);

MERGE INTO game_media VALUES (1, 1);
MERGE INTO game_media VALUES (2, 3);
MERGE INTO game_media VALUES (3, 4);

MERGE INTO thread VALUES (1, 'my game is not working pls to help', '1998-10-06 12:54:21', 1);
MERGE INTO thread VALUES (2, 'this game sucks and here''s why', '1998-10-07 15:05:55', 1);
MERGE INTO thread VALUES (3, 'test post please ignore', '1998-10-04 05:12:23', 1);
MERGE INTO thread VALUES (4, 'i don''t like thing', '1998-10-07 05:55:55', 2);
MERGE INTO thread VALUES (5, 'Oh, there once was a post on a forum', '1998-10-04 21:40:25', 3);

MERGE INTO post VALUES (1, 'it just broke my washing machine when i tried to install it', '1998-10-06 13:16:41', 1);
MERGE INTO post VALUES (2, 'you are retarded', '1998-11-06 21:42:04', 1);
MERGE INTO post VALUES (3, 'it is a symbol of the male fantasy as you can clearly see', '1998-10-07 17:54:21', 2);
MERGE INTO post VALUES (4, 'you just have shit taste tbqh smdh lol', '1998-10-08 02:51:32', 2);
MERGE INTO post VALUES (5, 'test i guess', '1998-10-04 16:00:20', 3);
MERGE INTO post VALUES (6, 'nice blogpost kid nobody cares. back to reddit', '1998-10-07 06:15:52', 4);
MERGE INTO post VALUES (7, 'that lacked somewhat in decorum--', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (8, 'It''s creator was lazy', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (9, 'his motivations quite hazy--', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (10, 'orum orum good luck rhyming something with this without being like a roman fucking centurion' ||
                            'jesus', '1998-10-04 21:41:20', 5);

# ---!Downs

