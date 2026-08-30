package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class w {
    public static /* synthetic */ java.lang.String a(int i) {
        switch (i) {
            case 1:
                return "INIT";
            case 2:
                return "WAITING_METADATA";
            case 3:
                return "REQUESTING_SURFACE_FOR_FIRST_FRAME";
            case 4:
                return "FIRST_FRAME_RENDERING";
            case 5:
                return "PAUSE";
            case 6:
                return "REQUESTING_SURFACE_FOR_PLAYING";
            case 7:
                return "VIDEO_PREPARING";
            case 8:
                return "AUDIO_PREPARING";
            case 9:
                return "PLAYING";
            case 10:
                return "COMPLETE";
            case 11:
                return "STALL";
            case 12:
                return "STALL_PAUSE";
            case 13:
                return "ERROR";
            default:
                throw null;
        }
    }
}
