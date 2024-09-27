#include <iostream>
using namespace std;

namespace game {
    class Skill {
        string name  = "";
        string type = "";
        int damegeAmount;
        int mpConsump;
        public: 
            Skill(string inName, string inType, string inOther) {
                name = inName;
                type = inType;
                if (type == "attack-physical") {

                } else if (type == "attack-magic") {

                } else if (type == "")
            }
    }

    class InitCharacter {
        public:
            string name = "";
            string id = "";
            int maxHp;
            int maxMp;
            Skill skill; 
            CharacterData(string inName, string inId, int inMaxHp, int inMaxMp, Skill inSkill) {
                name = inName;
                id = inId;
                maxHp = inMaxHp;
                maxMp = inMaxMp;
                skill = inSkill;
            }
    }

    namespace character {
        const InitCharacter[] characterData = {
            CharacterData("キャラ1", "test1", 50, 50),
            CharacterData("キャラ2", "test2", 70, 70),
            CharacterData("キャラ3", "test3", 80, 80)
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
     
}