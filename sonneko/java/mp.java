import java.util.*;
import java.lang.*;
import java.io.*;

class Mp 
{
    final int maxMP;
    private int nowMP;
    private boolean isAlive;
    public MP(int maxMPIn, int initMPIn) {
        if (maxMPIn < initMPIn) {
            throw new IllegalArgumentException("Initial MP cannot be greater than max MP.");
        }
        this.maxMP = maxMPIn;
        this.nowMP = initMPIn;
        this.isAlive = true;
    }
    public int get() {
        return this.nowMP;
    }

    // MPを決まった値に設定する
    public void setMP(int changedMPIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.maxMP < changedMPIn) {
            throw new IllegalArgumentException("Changed MP cannot be greater than max MP.");
        }
        this.nowMP = changedMPIn;
    }

    // ダメージを与える
    public void damage(int changeMPIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.nowMP - changeMPIn < 0) {
            // 死んだ時
            this.nowMP = 0;
            this.isAlive = false;
        } else {
            // 死んでない時
            this.nowMP -= changeMPIn;
        }
    }
    
    // 回復させる
    public void recover(int changeMPIn) {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        if (this.nowMP - changeMPIn < 0) {
            // 最大量を超している時
            this.nowMP = this.maxMP;
        } else {
            // 最大量を超していない時
            this.nowMP += changeMPIn;
        }
    }

    // MPを完全にする
    public void complete() {
        if (!isAlive) {
            // 既に死んでる
            throw new IllegalArgumentException("already died!");
        }
        this.nowMP = this.maxMP;
    }

    // 復活させる
    public void relive(int initMPIn) {
        if (isAlive) {
            // 生きているのに復活した
            throw new IllegalArgumentException("生きているので復活できない");
        }
        this.isAlive = true;
        this.nowMP = initMPIn;
    }
}
