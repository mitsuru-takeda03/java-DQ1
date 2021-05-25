package com.dq1.game.king;

public enum KingDialogue {
    Start("おお　！勇者ロトの血を引くものよ！そなたの来るのを待っておったぞ。"),
    Revive("おお　！死んでしまうとはあわれなり！");

    private final String dialogue;

    KingDialogue(String dialogue) { this.dialogue = dialogue; }

    public String getDialogue() {
        return dialogue;
    }
}
