# ---!Ups

MERGE INTO cart VALUES (1, 500);
MERGE INTO cart VALUES (2, 199);

<<<<<<< HEAD
MERGE INTO user VALUES ('customer', 12420, 'normie@oneup.com', '$2a$10$GF9gQHb7408xiHQhP8Wuuez4ZPNP4C.05Hl1VBwXpIwAB5l6Z5YZG', 'Norman', 'User', 'Casual user.', 'xX_sNIP3rW0LF_Xx', '2018-04-17 14:46:25', 2, false, null);
MERGE INTO user VALUES ('admin', 12452, 'admin@oneup.com', '$2a$10$3e4CeGNijd3Z79B1cRufOObaYB/2gScT2fOUkEC3P5p679NvfLMTm', 'ad', 'min', 'Hardcore weeb.', 'admin', '2018-04-17 14:42:30', 1, false, null);
=======
MERGE INTO user VALUES ('customer', 12420, 'normie@oneup.com', '$2a$10$GF9gQHb7408xiHQhP8Wuuez4ZPNP4C.05Hl1VBwXpIwAB5l6Z5YZG', 'Norman', 'User', 'Casual user.', 'UserGuy', '2018-04-17 14:46:25', 2);
MERGE INTO user VALUES ('admin', 12452, 'admin@oneup.com', '$2a$10$3e4CeGNijd3Z79B1cRufOObaYB/2gScT2fOUkEC3P5p679NvfLMTm', 'ad', 'min', 'Hardcore weeb.', 'admin', '2018-04-17 14:42:30', 1);
>>>>>>> b398c95ef6ff7ce4157710ba0eec20f305b0d14c

MERGE INTO game VALUES(1, 'Metal Gear Solid', 'The year is 1998, and a terrorist threat made by a' ||
                                              ' former special forces squad calls retired agent, Snake' ||
                                              ' Plissken, back into action. Infiltrate the radioactive waste' ||
                                              ' disposal facility of Shadow Moses island and put an end to the' ||
                                              ' threat before it boils over.', 59.99, 49.29, 0.2, true);

MERGE INTO game VALUES(2, 'Final Fantasy XV',
                       'On the verge of war, a king sends his son on a voyage to marry the soon-to-be leader' ||
                       ' of a foreign country in order to bring peace. War is declared before the marriage can' ||
                       ' be completed, leaving only the prince and his three bodyguards to save the day.',
                       49.99, 97.20, 0, false);

MERGE INTO game VALUES(3, 'Car Stealers Five', 'Three men, brought together by an unfortunate twist' ||
                                               ' of fate, find themselves embroiled in a plot to' ||
                                               ' see who can create the most faithful reenaction' ||
                                               ' of Quentin Tarantino''s Resevoir Dogs. They soon' ||
                                               ' learn that the art of stealing jewelry and then feeling' ||
                                               ' bad about it afterwards is not as easy as it seems.', 14.99, 85.50, 0.6, true);

MERGE INTO media VALUES (1, 'image/jpg/cover', 'images/Metal-Gear.jpg', null);
MERGE INTO media VALUES (3, 'image/jpg/cover', 'images/ffxv.jpg', null);
MERGE INTO media VALUES (4, 'image/png/cover', 'images/gtav.png', null);

MERGE INTO user_game VALUES (12452, 1);
MERGE INTO user_game VALUES (12452, 2);
MERGE INTO user_game VALUES (12420, 1);
MERGE INTO user_game VALUES (12420, 3);

MERGE INTO game_media VALUES (1, 1);
MERGE INTO game_media VALUES (2, 3);
MERGE INTO game_media VALUES (3, 4);

MERGE INTO thread (id, poster_id, title, game_id) VALUES (1, 12452, 'my game is not working pls help', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (2, 12452, 'I don''t like the ending because reasons', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (3, 12420, 'Test post please ignore', 1);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (4, 12452, 'Amazing how forums work', 2);
MERGE INTO thread (id, poster_id, title, game_id) VALUES (5, 12420, 'Refund please', 3);

MERGE INTO post VALUES (1, 12452, 'it just broke my washing machine when i tried to install it', '1998-10-06 13:16:41', 1);
MERGE INTO post VALUES (2, 12420, 'Try reinstalling', '1998-11-06 21:42:04', 1);
MERGE INTO post VALUES (3, 12452, 'I''m not going to state those reasons however', '1998-10-07 17:54:21', 2);
MERGE INTO post VALUES (4, 12452, 'okay sure', '1998-10-08 02:51:32', 2);
MERGE INTO post VALUES (5, 12420, 'test', '1998-10-04 16:00:20', 3);
MERGE INTO post VALUES (6, 12452, 'yeah, imagine what the code behind this forum looks like' ||
                                  ' too bad we can''t see it because we''re just normal users', '1998-10-07 06:15:52', 4);
MERGE INTO post VALUES (7, 12420, 'i would like a refund', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (8, 12420, 'Refunds are a little too far out of scope', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (9, 12452, 'alright maybe next year', '1998-10-04 21:41:20', 5);
MERGE INTO post VALUES (10, 12452, 'it can even do emojis 🤔🤔', '1998-10-04 21:41:20', 4);

# ---!Downs