package cat;

import care.FeedCat;

public abstract class Cat implements CatAction {

    protected FeedCat catWeigth;

    enum Games {
        Run,
        HideAndSeek,
        Attack,
        LazerBeam,
        TakeABath,
        LookOutTheWindow
    }
}



