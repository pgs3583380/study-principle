package com.study.principle.demeter;

/**
 * @author 潘根山
 * @create 2018-08-27 20:53
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader=new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
