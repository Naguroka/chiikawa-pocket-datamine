package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
public interface HeartBeatInfo {
    com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat getHeartBeatCode(java.lang.String str);

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }
}
