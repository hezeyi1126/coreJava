package com.my;


public class Switch{
    enum PlayerTypes {
        TENNIS,
        FOOTBALL,
        BASKETBALL,
        PINGPANG,
        UNKNOWN
    }

    public static void main(String[] args) {
        System.out.println(createPlayer(PlayerTypes.BASKETBALL));
    }

    private static String createPlayer(PlayerTypes playerType) {
        return switch (playerType) {
            case TENNIS -> "网球运动员费德勒";
            case FOOTBALL -> "足球运动员C罗";
            case BASKETBALL -> "篮球运动员詹姆斯";
            case PINGPANG -> "乒乓球运动员马龙";
            case UNKNOWN -> throw new IllegalArgumentException("未知");
        };
    }
}