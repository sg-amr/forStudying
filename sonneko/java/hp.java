import java.util.*;
import java.lang.*;
import java.io.*;

class Hp 
{
    final int maxHp;
    private int nowHp;
    private boolean isAlive;
    public Hp(int maxHpIn, int initHpIn) {
        if (maxHpIn < initHpIn) {
            throw new IllegalArgumentException("Initial HP cannot be greater than max HP.");
        }
        this.maxHp = maxHpIn;
        this.nowHp = initHpIn;
        this.isAlive = true;
    }
    public int get() {
        return this.nowHp;
    }

    // HPを決まった値に設定する
    public void setHp(int changedHpIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.maxHp < changedHpIn) {
            throw new IllegalArgumentException("Changed HP cannot be greater than max HP.");
        }
        this.nowHp = changedHpIn;
    }

    // ダメージを与える
    public void damage(int changeHpIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.nowHp - changeHpIn < 0) {
            // 死んだ時
            this.nowHp = 0;
            this.isAlive = false;
        } else {
            // 死んでない時
            this.nowHp -= changeHpIn;
        }
    }
    
    // 回復させる
    public void recover(int changeHpIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.nowHp - changeHpIn < 0) {
            // 最大量を超している時
            this.nowHp = this.maxHp;
        } else {
            // 最大量を超していない時
            this.nowHp += changeHpIn;
        }
    }

    // HPを完全にする
    public void complete() {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        this.nowHp = this.maxHp;
    }

    // 復活させる
    public void relive(int initHpIn) {
        if (isAlive) {
            // 生きているのに復活した
            throw new IllegalArgumentException("生きているので復活できない");
        }
        this.isAlive = true;
        this.nowHp = initHpIn;
    }
}
