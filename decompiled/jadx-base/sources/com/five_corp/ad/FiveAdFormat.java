package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public enum FiveAdFormat {
    INTERSTITIAL_LANDSCAPE(1),
    INTERSTITIAL_PORTRAIT(2),
    IN_FEED(3),
    BOUNCE(4),
    W320_H180(5),
    W300_H250(6),
    CUSTOM_LAYOUT(7),
    VIDEO_REWARD(8);

    public final int rawValue;

    FiveAdFormat(int i) {
        this.rawValue = i;
    }

    public static com.five_corp.ad.FiveAdFormat get(int i) {
        switch (i) {
            case 1:
                return INTERSTITIAL_LANDSCAPE;
            case 2:
                return INTERSTITIAL_PORTRAIT;
            case 3:
                return IN_FEED;
            case 4:
                return BOUNCE;
            case 5:
                return W320_H180;
            case 6:
                return W300_H250;
            case 7:
                return CUSTOM_LAYOUT;
            case 8:
                return VIDEO_REWARD;
            default:
                return null;
        }
    }
}
