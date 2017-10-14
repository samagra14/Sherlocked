package data;

import android.provider.BaseColumns;

/**
 * Created by samagra on 06-01-2017.
 */

public final class SherlockContract {

    public static final class SeasonEntry implements BaseColumns{

        public static final String TABLE_NAME = "seasons";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_SEASON_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the Season
        public static final String SEASON_1 = "Season 1";
        public static final String SEASON_2 = "Season 2";
        public static final String SEASON_3 ="Season 3";
        public static final String SEASON_4 = "Season 4";
        public static final String SEASON_SPECIAL = "Specials";



    }

    /**
     * contract for different seasons
     */

    public static  final  class EpisodeSeasonOneEntry implements  BaseColumns{

        public static final String TABLE_NAME = "episodes_season_1";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the episodes
        public static final String EPISODE_1 = "Episode 1";
        public static final String EPISODE_2 = "Episode 2";
        public static final String EPISODE_3 ="Episode 3";

    }

    public static  final  class EpisodeSeasonTwoEntry implements  BaseColumns{

        public static final String TABLE_NAME = "episodes_season_2";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the episodes
        public static final String EPISODE_1 = "Episode 1";
        public static final String EPISODE_2 = "Episode 2";
        public static final String EPISODE_3 ="Episode 3";

    }

    public static  final  class EpisodeSeasonThreeEntry implements  BaseColumns{

        public static final String TABLE_NAME = "episodes_season_3";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the episodes
        public static final String EPISODE_1 = "Episode 1\nThe Empty Hearse";
        public static final String EPISODE_2 = "Episode 2\nThe Sign Of Three";
        public static final String EPISODE_3 ="Episode 3\nHis Last Vow";

    }

    public static  final  class EpisodeSeasonFourEntry implements  BaseColumns{

        public static final String TABLE_NAME = "episodes_season_4";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the episodes
        public static final String EPISODE_1 = "Episode 1\nThe Six Thatchers";
        public static final String EPISODE_2 = "Episode 2\nThe Lying Detective";
        public static final String EPISODE_3 ="Episode 3\nThe Final Problem";

    }
    public static  final  class EpisodeSeasonSpecialEntry implements  BaseColumns{

        public static final String TABLE_NAME = "episodes_season_special";
        //now define the names of various columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        //constants for the episodes
        public static final String EPISODE_1 = "Episode 1\nPilot";
        public static final String EPISODE_2 = "Episode 2\nThe Abominable Bride";
        public static final String EPISODE_3 ="Episode 3\n Many Happy Returns";

    }

    /**
     * contract for different episodes
     */

    public static final class DescriptionEpisodesSeasonOne implements BaseColumns{

        public  static final String TABLE_NAME = "season_1_episodes";
        //column names
        public static final String _ID = BaseColumns._ID;
        public  static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        public static final String COLUMN_DIRECTOR = "director";
        public  static  final String COLUMN_WRITER = "writer";
        public static final String COLUMN_RUNNING_TIME = "time";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SUMMARY = "summary";
        //episode names
        public static final String EPISODE_1 = "A STUDY IN PINK";
        public static final String EPISODE_2 = "THE BLIND BANKER";
        public static final String EPISODE_3 ="THE GREAT GAME";
        //directors
        public static final String EPISODE_1_DIRECTOR = "Paul McGuigan";
        public static final String EPISODE_2_DIRECTOR = "Euros Lyn";
        public static final String EPISODE_3_DIRECTOR ="Paul McGuigan";
        //writers
        public static final String EPISODE_1_WRITER = "Stevan Moffat";
        public static final String EPISODE_2_WRITER = "Stephen Thompson";
        public static final String EPISODE_3_WRITER ="Mark Gatiss";
        //time
        public static final int EPISODE_1_TIME = 90;
        public static final int EPISODE_2_TIME = 90;
        public static final int EPISODE_3_TIME = 90;
        //date
        public static final String EPISODE_1_DATE ="25 July 2010";
        public static final String EPISODE_2_DATE ="1 August 2010";
        public static final String EPISODE_3_DATE ="8 August 2010";
        /**
         *
         * summary for various episodes
         */
        //summary
        public static final String EPISODE_1_SUMMARY ="The police investigate the deaths of a series of " +
                "people who all appear to have committed suicide by taking a poisonous pill. They turn to" +
                " their unofficial consultant, Sherlock Holmes, who deduces various elements pointing to a" +
                " serial killer. Meanwhile, Holmes is introduced to John Watson, a former soldier who served" +
                " in Afghanistan, and the pair immediately move into a flat in Baker Street. John Watson" +
                " slowly gets to know and trust Sherlock despite police officer Sally Donovan (Vinette Robinson)" +
                " warning him that Holmes is a psychopath and will one day be responsible for murder. Sherlock's" +
                " brother Mycroft (Mark Gatiss), at first not revealing his identity, arranges a meeting with Watson" +
                " and asks whether he'll spy on Sherlock for money, but John refuses. After a series of incidents," +
                " the person responsible for the deaths, a taxicab driver (Phil Davis), reveals that his victims took their" +
                " own lives by playing a game of Russian roulette with two pills: one fatally poisonous, the other safe." +
                " Before Sherlock can play the cabbie's game, John shoots the cabbie from an opposite building." +
                " Before he dies, the taxicab driver reveals that \"Moriarty\" was his sponsor.";
        public static final String EPISODE_2_SUMMARY ="Sherlock is hired by an old friend to investigate a mysterious break-in" +
                " at a bank in the City. He discovers that symbols spray-painted onto an office wall are a coded message intended" +
                " for an employee of the bank, who is later discovered dead in his flat. The next day, a journalist is killed and" +
                " the same symbols are found nearby. Sherlock and John follow a trail of clues that link the two dead men to a" +
                " Chinese smuggling ring, who are trying to retrieve a valuable item that one of the dead men stole. Sherlock" +
                " eventually cracks the coded message based on Suzhou numerals and a book cipher, but not before John and Sarah" +
                " (John's date) are kidnapped by the criminals, who believe that John is Sherlock. Sherlock rescues" +
                " John and Sarah,"+
                " but the leader of the gang escapes. Later, the leader of the gang is in" +
                " communication with her superior, who is identified by the initial \"M\". She is then shot by a sniper.";
        public static final String EPISODE_3_SUMMARY ="Sherlock is commissioned by Mycroft to investigate the suspicious" +
                " death of a government employee, who was working on a top-secret defence project: the Bruce-Partington" +
                " Project.[12] After rejecting the case and handing it over to John, Sherlock begins to be taunted by" +
                " a criminal who puts his victims into explosive vests and sets Sherlock deadlines to solve the apparently" +
                " unrelated cases, which include a twenty-year-old cold case involving the shoes of a drowned boy, the" +
                " disappearance of a businessman, the death of a TV personality, and the assassination of a guard of an" +
                " art gallery by the \"Golem\". As Sherlock solves the cases, he finds links between them. After clearing" +
                " up the original case of the civil servant, Sherlock tries to force his unseen adversary to reveal himself." +
                " Near the end of the episode, Sherlock and \"Jim Moriarty\" reach a standoff, where Jim reveals that he is" +
                " responsible for the crimes. In the final seconds, Sherlock Holmes points his gun at a bomb on the floor" +
                " that had been strapped to John.";

    }

    public static final class DescriptionEpisodesSeasonTwo implements BaseColumns{

        public  static final String TABLE_NAME = "season_2_episodes";
        //column names
        public static final String _ID = BaseColumns._ID;
        public  static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        public static final String COLUMN_DIRECTOR = "director";
        public  static  final String COLUMN_WRITER = "writer";
        public static final String COLUMN_RUNNING_TIME = "time";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SUMMARY = "summary";
        //episode names
        public static final String EPISODE_1 = "A SCANDAL IN BELGRAVIA";
        public static final String EPISODE_2 = "THE HOUNDS OF BASKERVILLE";
        public static final String EPISODE_3 ="THE REICHENBACH FALL";
        //directors
        public static final String EPISODE_1_DIRECTOR = "Paul McGuigan";
        public static final String EPISODE_2_DIRECTOR = "Paul McGuigan";
        public static final String EPISODE_3_DIRECTOR ="Toby Haynes";
        //writers
        public static final String EPISODE_1_WRITER = "Stevan Moffat";
        public static final String EPISODE_2_WRITER = "Mark Gatiss";
        public static final String EPISODE_3_WRITER ="Stephen Thompson";
        //time
        public static final int EPISODE_1_TIME = 90;
        public static final int EPISODE_2_TIME = 90;
        public static final int EPISODE_3_TIME = 90;
        //date
        public static final String EPISODE_1_DATE ="1 January 2012";
        public static final String EPISODE_2_DATE ="8 January 2012";
        public static final String EPISODE_3_DATE ="15 January 2012";
        /**
         *
         * summary for various episodes
         */
        //summary
        public static final String EPISODE_1_SUMMARY ="Mycroft hires Sherlock and John to retrieve compromising photos" +
                " of a minor royal, which are held on the camera phone of Irene Adler (Lara Pulver), a ruthless and" +
                " brilliant dominatrix who also trades in classified information extracted from her rich and powerful" +
                " clients. Sherlock obtains Adler's phone, but discovers it is booby-trapped and requires a code to disarm" +
                " it. When Adler discovers that the CIA are on her trail, she disappears and is then apparently killed," +
                " only to reappear to ask John to get her camera phone back from Sherlock. Weeks later when the coast is clear," +
                " Adler tricks Sherlock into deciphering a coded message on her phone which she obtained from another" +
                " well-connected client. She sends the message to Moriarty, who in turn uses it to foil a British" +
                " counter-terror operation. She almost succeeds in blackmailing Mycroft, but Sherlock finally cracks the" +
                " password for the phone, leaving Adler without the protection she needs to survive. The episode concludes" +
                " as Mycroft tells John that she has been killed by a terrorist group in Pakistan, while in fact she was" +
                " secretly rescued by Sherlock.";
        public static final String EPISODE_2_SUMMARY ="Sherlock and John are contacted by Henry Knight (Russell Tovey), a" +
                " man traumatised by the death of his father by a monstrous hound on Dartmoor years before. Investigating" +
                " Dewer's Hollow, a local spot where the beast was allegedly seen, as well as the nearby Ministry of Defence" +
                " testing site Baskerville, Sherlock and John uncover a conspiracy wherein one of the Baskerville scientists" +
                ", Dr. Frankland (Clive Mantle), is continuing the work of H.O.U.N.D., an aborted project to create a" +
                " hallucinogenic gas for military use. Sherlock and John discover that the legendary hound is an ordinary" +
                " dog used for publicity that the hallucinogenic gas makes appear as a demonic monster. The \"hound\" that" +
                " killed Henry's father was actually Frankland wearing a red-lensed gas mask and a T-shirt bearing the logo" +
                " of the H.O.U.N.D. group. Confronting both the dog and Frankland at Dewer's Hollow, John and Lestrade shoot" +
                " the dog. Frankland attempts to flee, but dies when he runs into a minefield. In the final scene, Mycroft" +
                " releases a confined Jim Moriarty.";
        public static final String EPISODE_3_SUMMARY ="Moriarty launches a simultaneous heist on the Tower of London," +
                " Bank of England and Pentonville Prison using just a few lines of code that can break any security; crimes" +
                " for which he allows himself to be captured and put on trial. He secures a not-guilty verdict through" +
                " intimidating the jury and visits Sherlock, explaining he still intends to \"burn\" him, taunting him with" +
                " a \"final problem\" for him to solve. Soon afterwards, Moriarty arranges for the kidnapping of the" +
                " children of an American ambassador, who are terrified of Sherlock once he has them rescued. This" +
                " leads to Sherlock becoming a suspect. Sherlock escapes arrest, and soon learns Moriarty is using" +
                " the alias of an actor who claims to have been hired by Sherlock, and has seeded the press with a " +
                "story of Sherlock being a fraud. The two meet on the roof of a hospital, where Moriarty explains" +
                " that assassins will kill John, Mrs. Hudson and Lestrade if Sherlock does not commit suicide; he wants" +
                " Sherlock to do this to cement his story after explaining that his \"god code\" was a myth. After a tense" +
                " conversation, in which Moriarty realises the two are enough alike that Sherlock would be willing to do" +
                " anything to Moriarty to get him to call off the assassins, Moriarty kills himself to force Sherlock to do" +
                " the same. Sherlock calls John and \"confesses\" to being a fraud (which John refuses to believe)." +
                " John pleads for him to come down. Sherlock states his final \"Goodbye\" and then steps off the roof.";
    }

    public static final class DescriptionEpisodesSeasonThree implements BaseColumns {

        public static final String TABLE_NAME = "season_3_episodes";
        //column names
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        public static final String COLUMN_DIRECTOR = "director";
        public static final String COLUMN_WRITER = "writer";
        public static final String COLUMN_RUNNING_TIME = "time";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SUMMARY = "summary";
        //episode names
        public static final String EPISODE_1 = "THE EMPTY HEARSE";
        public static final String EPISODE_2 = "THE SIGN OF THREE";
        public static final String EPISODE_3 = "HIS LAST VOW";
        //directors
        public static final String EPISODE_1_DIRECTOR = "Jeremy Lovering";
        public static final String EPISODE_2_DIRECTOR = "Colm McCarthy";
        public static final String EPISODE_3_DIRECTOR = "Nick Hurran";
        //writers
        public static final String EPISODE_1_WRITER = "Mark Gatiss";
        public static final String EPISODE_2_WRITER = "Steven Moffat\nMark Gatiss";
        public static final String EPISODE_3_WRITER = "Toby Haynes";
        //time
        public static final int EPISODE_1_TIME = 90;
        public static final int EPISODE_2_TIME = 90;
        public static final int EPISODE_3_TIME = 90;
        //date
        public static final String EPISODE_1_DATE = "1 January 2014";
        public static final String EPISODE_2_DATE = "5 January 2014 ";
        public static final String EPISODE_3_DATE = "12 January 2014";
        /**
         * summary for various episodes
         */
        //summary
        public static final String EPISODE_1_SUMMARY = "Two years after his reported Reichenbach Fall demise, Sherlock," +
                " who has been cleared of all fraud charges against him, returns with Mycroft's help to a London under" +
                " threat of terrorist attack. He tries to convince John - who has moved on and now has a girlfriend," +
                " Mary Morstan (Amanda Abbington) - to help; however, John is angry that Sherlock didn't tell him he" +
                " was alive. Instead, Sherlock enlists Molly to assist him, but when John is kidnapped by unknown assailants" +
                " and is rescued by Sherlock and Mary, John returns to help find the terrorists and an underground plot " +
                "to blow up the Houses of Parliament during an all night sitting on Guy Fawkes Night.";
        public static final String EPISODE_2_SUMMARY = "It is John and Mary's wedding day and Sherlock is daunted by the task" +
                " of delivering a Best Man's speech. As part of the speech, he recounts cases they have worked on including " +
                "a soldier being stalked and somehow stabbed in a locked shower, a ghost dating women he dubs" +
                " \"The Mayfly Man\", the last being part of John's disastrous stag night, among others. Before his" +
                " speech ends, he realises that a murderer is present among the guests intent on killing John's old" +
                " friend, Major Sholto. Sherlock saves the targeted guest, and then informs John and Mary of the meaning" +
                " of the sign of three; namely that Mary is pregnant.";
        public static final String EPISODE_3_SUMMARY = "Stolen letters lead Sherlock into conflict with Charles Augustus" +
                " Magnussen, \"the Napoleon of blackmail\" who knows the personal weakness of every person of importance" +
                " in the Western world. During the investigation Sherlock is shot and nearly killed by Mary, who is being" +
                " blackmailed by Magnussen. After waking up from near-death, Sherlock escapes the hospital and lures Mary" +
                " to an abandoned building, where he tricks her into revealing her false identity and attempted murder" +
                " while John is listening nearby. Months later, Sherlock drugs everyone at the Holmes family Christmas party" +
                ", steals Mycroft's laptop full of state secrets, and he and John take the laptop to Magnussen to trade for" +
                " all of the files on 'Mary Morstan'. It's revealed that Magnussen keeps no files; it's all in his near-perfect" +
                " photographic memory. To protect John, Mary, and their forthcoming child, Holmes kills Magnussen in front of" +
                " Mycroft and several other witnesses, and as a result is sent off on a suicidal assignment overseas. However," +
                " he is brought back almost immediately because of a video being broadcast all over London with Jim Moriarty's" +
                " face asking \"Did you miss me?\"";
    }


    public static final class DescriptionEpisodesSeasonFour implements BaseColumns{

        public  static final String TABLE_NAME = "season_4_episodes";
        //column names
        public static final String _ID = BaseColumns._ID;
        public  static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        public static final String COLUMN_DIRECTOR = "director";
        public  static  final String COLUMN_WRITER = "writer";
        public static final String COLUMN_RUNNING_TIME = "time";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SUMMARY = "summary";
        //episode names
        public static final String EPISODE_1 = "THE SIX THATCHERS";
        public static final String EPISODE_2 = "THE LYING DETECTIVE";
        public static final String EPISODE_3 ="THE FINAL PROBLEM";
        //directors
        public static final String EPISODE_1_DIRECTOR = "Rachel Talalay";
        public static final String EPISODE_2_DIRECTOR = "Nick Hurran";
        public static final String EPISODE_3_DIRECTOR ="Ben Caron";
        //writers
        public static final String EPISODE_1_WRITER = "Mark Gatiss";
        public static final String EPISODE_2_WRITER = "Steven Moffat";
        public static final String EPISODE_3_WRITER ="Steven Moffat\nMark Gatiss";
        //time
        public static final int EPISODE_1_TIME = 90;
        public static final int EPISODE_2_TIME = 90;
        public static final int EPISODE_3_TIME = 90;
        //date
        public static final String EPISODE_1_DATE ="1 January 2017";
        public static final String EPISODE_2_DATE ="8 January 2017";
        public static final String EPISODE_3_DATE ="15 January 2017";
        /**
         *
         * summary for various episodes
         */
        //summary
        public static final String EPISODE_1_SUMMARY ="Sherlock is asked to investigate the mysterious death of a young man, " +
                "which he solves quickly but he is led into another mystery when a bust of Margaret Thatcher owned by the dead " +
                "man's father is smashed. Further busts are smashed and Sherlock discovers that the mystery is linked to Mary" +
                " and her past as a government agent. A figure from her past is bent on revenge in the belief that Mary betrayed " +
                "him, but Sherlock discovers that someone else was really the traitor. Mary is then shot to death as she jumps " +
                "into the way of a bullet meant for Sherlock.";
        public static final String EPISODE_2_SUMMARY ="Title based loosely on the Doyle short story \"The Adventure of the Dying" +
                " Detective\"";
        public static final String EPISODE_3_SUMMARY ="Title matches the Doyle short story \"The Final Problem\"";

    }



    public static final class DescriptionEpisodesSeasonSpecial implements BaseColumns{

        public  static final String TABLE_NAME = "season_special_episodes";
        //column names
        public static final String _ID = BaseColumns._ID;
        public  static final String COLUMN_EPISODE_NAME = "episode";
        public static final String COLUMN_RESOURCE_ID = "resource";
        public static final String COLUMN_DIRECTOR = "director";
        public  static  final String COLUMN_WRITER = "writer";
        public static final String COLUMN_RUNNING_TIME = "time";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_SUMMARY = "summary";
        //episode names
        public static final String EPISODE_1 = "PILOT";
        public static final String EPISODE_2 = "THE ABOMINABLE BRIDE";
        public static final String EPISODE_3 ="MANY HAPPY RETURNS";
        //directors
        public static final String EPISODE_1_DIRECTOR = "Coky Giedroyc";
        public static final String EPISODE_2_DIRECTOR = "Douglas Mackinnon";
        public static final String EPISODE_3_DIRECTOR ="Jeremy Lovering";
        //writers
        public static final String EPISODE_1_WRITER = "Steven Moffat";
        public static final String EPISODE_2_WRITER = "Mark Gatiss\nSteven Moffat";
        public static final String EPISODE_3_WRITER ="Mark Gatiss\n" +
                "Steven Moffat";
        //time
        public static final int EPISODE_1_TIME = 60;
        public static final int EPISODE_2_TIME = 90;
        public static final int EPISODE_3_TIME = 8;
        //date
        public static final String EPISODE_1_DATE ="N/A";
        public static final String EPISODE_2_DATE ="1 January 2016";
        public static final String EPISODE_3_DATE ="24 December 2013";
        /**
         *
         * summary for various episodes
         */
        //summary
        public static final String EPISODE_1_SUMMARY ="London, 2009: A series of mysterious suicides have struck the English " +
                "capital. Nothing links the victims, bar the manner of death. The Police investigation, led by DI Lestrade, is " +
                "baffled. Meanwhile, Dr John Watson, recently invalided home from the war in Afghanistan, finds his existence now " +
                "without direction. The solution for both parties lies with a single man: Sherlock Holmes.";
        public static final String EPISODE_2_SUMMARY ="Sherlock, under the influence of drugs, enters his mind palace to" +
                " solve a case from Victorian times about a bride shooting herself in the head and rising from the grave" +
                " to kill her husband. If he can solve the murder it might lead him to how Moriarty has risen from the grave" +
                " after similarly shooting himself in the head. He solves the case, and concludes that Moriarty is indeed dead," +
                " but \"is back\".";
        public static final String EPISODE_3_SUMMARY ="Anderson believes that Sherlock is still alive after the Reichenbach" +
                " fall. He confides in Lestrade and tells him his theory for his existence. Anderson believes a string of events" +
                " ranging from Tibet to India to Germany involve Sherlock's assistance, and this is due to Sherlock not being" +
                " able to stop investigating. Lestrade tells him Sherlock is definitely dead and goes to visit John, who has " +
                "moved out of Baker Street following his death. He gives him some of Sherlock's old items, including a video" +
                " message from John's birthday. In the message Sherlock states that he will see John very soon and tells him" +
                " to have a good birthday without him as he is 'busy'.";

    }

    }




