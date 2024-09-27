class Game {
    public:
        int mp = 0;
        int hp = 0;
    private:
        int Game(int inMp, int inHp) {
            mp = inMp;
            hp = inHp;
            return 0;
        }
        int add(Game a, Game b) {
            Game out = Game(a.mp + b.mp, a.hp + b.hp);
            retrun out;
        }
        
}