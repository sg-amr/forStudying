import java.util.*;
import java.lang.*;
import java.io.*;

class Type {
    private String id;
    private String name;
    public Type (String id) {
        if (id == "fire") {
            this.id = "fire";
            this.name = "炎";
        } else if (id == "water") {
            this.id = "water";
            this.name = "水";
        } else if (id == "ground") {
            this.id = "ground";
            this.name = "土";
        } else if (id == "sander") {
            this.id = "sander";
            this.name = "轟";
        } else {
            throw new IllegalArgumentException("unknown type id");
        }
    }
    public String getName() {
        return this.name;
    }
}

class Skill {
    Type type;          // 属性
    int hpAmount;       // ダメージ量もしくは回復量
    int mpUsing;        // 使うMP(使わない場合は、0)
    String message;     // 発動した時に出すメッセージ
}

class Main {
    public static void main(String[] args) {
        Skill skill = new Skill();
        // skillの設定
        skill.type = new Type("fire");
        skill.hpAmount = 10;
        skill.mpUsing = 10;
        skill.message = "火属性の攻撃が発動しました";

        
    }
}