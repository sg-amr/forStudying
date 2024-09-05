#include <iostream>
#include "game.hpp"
using namespace std;

namespace game {
    namespace character {
        class Skill {
        public:
            string name  = "";
            
    }

    class InitCharacter {
        public:
            string name = "";
            string id = "";
            int maxHp;
            int maxMp;
            int Character(string inName, string inId, int inMaxHp, int inMaxMp) {
                name = inName;
                id = inId;
                maxHp = inMaxHp;
                maxMp = inMaxMp;
            }
    }
    }
}

int main() {
    return 0;
}

class Character {
    string name = "";
    int hp = 0;
    int mp = 0;
    int 
}