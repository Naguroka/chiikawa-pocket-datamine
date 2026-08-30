package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class D {
    public static /* synthetic */ java.lang.String a(int i) {
        switch (i) {
            case 1:
                return "INITIALIZED";
            case 2:
                return "WAITING_SURFACE_FOR_FIRST_FRAME";
            case 3:
                return "RENDERING_FIRST_FRAME";
            case 4:
                return "PAUSED_WITHOUT_SURFACE";
            case 5:
                return "WAITING_SURFACE_FOR_PLAYING";
            case 6:
                return "PREPARING_FOR_PLAYING";
            case 7:
                return "PLAYING";
            case 8:
                return "PAUSED_WITH_MEDIA_PLAYER";
            case 9:
                return "COMPLETE";
            case 10:
                return "ERROR";
            default:
                throw null;
        }
    }
}
