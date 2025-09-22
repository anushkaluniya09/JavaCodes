package com.Static.Static24;

class Stadium {
    static class Match {
        String matchType;
        Match(String matchType) { this.matchType = matchType; }
        void showMatch() { System.out.println("Match: " + matchType); }
    }
}
