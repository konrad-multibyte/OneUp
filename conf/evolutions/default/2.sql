# --- !Ups

DELETE FROM game_media WHERE game_id = 1;
DELETE FROM game_media WHERE game_id = 2;
DELETE FROM game_media WHERE game_id = 3;

DELETE FROM game WHERE id=1;
DELETE FROM game WHERE id=2;
DELETE FROM game WHERE id=3;

INSERT INTO game VALUES (1, 'Metal Bear Solid', 'The year is 1998, and the world stands on the precipice' ||
                                                ' of nuclear war. A group of terrorists, formerly' ||
                                                ' an elite special forces squad known as Foxhound,' ||
                                                ' has infiltrated and captured the nuclear disposal' ||
                                                ' facility of Shadow Moses island. Pitted against' ||
                                                ' insurmountable odds, retired agent, Solid Snake,' ||
                                                ' must infiltrate the island and put a stop to' ||
                                                ' Foxhound. Can he stop them before This text box' ||
                                                ' runs out of characters?', 59.99, 49.29, 0.2, null);
INSERT INTO game VALUES (2, 'Final Fantasy 15 (not really final then, is it)',
                         'Some twink''s dad dies' ||
                         ' and he goes and becomes an angsty virgin with a deathwish. Venture with' ||
                         ' Prince Noctis as he crosses the land with his boyband and defeats' ||
                         ' ancient creatures with the help of the gods (because he can''t do it himself',
                         49.99, 97.20, 0, null);

INSERT INTO game VALUES (3, 'Car Stealers Five', 'Three men, brought together by an unfortunate twist' ||
                                                 ' of fate, find themselves embroiled in a plot to' ||
                                                 ' see who can create the most faithful reenaction' ||
                                                 ' of Quentin Tarantino''s Resevoir Dogs. They soon' ||
                                                 ' learn that the art of robbing banks and then feeling' ||
                                                 ' bad about it afterwards is not as easy as it seems.',
                                                  34.99, 89.50, 0.6, null);

DELETE FROM media WHERE id=1;
DELETE FROM media WHERE id=2;
DELETE FROM media WHERE id=3;
DELETE FROM media WHERE id=4;

INSERT INTO media VALUES (1, 'image/jpg/cover', 'images/Metal-Gear.jpg', null);
INSERT INTO media VALUES (2, 'image/png', 'images/hashketchum.png', null);
INSERT INTO media VALUES (3, 'image/jpg/cover', 'images/ffxv.jpg', null);
INSERT INTO media VALUES (4, 'image/png/cover', 'images/gtav.png', null);

INSERT INTO game_media VALUES(1, 1);
INSERT INTO game_media VALUES(2, 3);
INSERT INTO game_media VALUES(3, 4);

# --- !Downs

