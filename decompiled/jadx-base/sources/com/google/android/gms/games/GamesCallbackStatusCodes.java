package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GamesCallbackStatusCodes {

    @java.lang.Deprecated
    public static final int CLIENT_RECONNECT_REQUIRED = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int OK = 0;

    private GamesCallbackStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        if (i == 0) {
            return "OK";
        }
        if (i == 1) {
            return "INTERNAL_ERROR";
        }
        if (i == 2) {
            return "CLIENT_RECONNECT_REQUIRED";
        }
        if (i == 6003) {
            return "MULTIPLAYER_DISABLED";
        }
        if (i == 7004) {
            return "REAL_TIME_ROOM_NOT_JOINED";
        }
        if (i == 7000) {
            return "REAL_TIME_CONNECTION_FAILED";
        }
        if (i == 7001) {
            return "REAL_TIME_MESSAGE_SEND_FAILED";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(47);
        sb.append("unknown games callback status code: ");
        sb.append(i);
        return sb.toString();
    }
}
