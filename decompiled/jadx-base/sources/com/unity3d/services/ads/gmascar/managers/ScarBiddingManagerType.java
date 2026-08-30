package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: classes6.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final java.lang.String name;

    ScarBiddingManagerType(java.lang.String str) {
        this.name = str;
    }

    public java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public static com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType fromName(java.lang.String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 99470) {
            if (iHashCode == 100171 && str.equals("eag")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("dis")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return EAGER;
        }
        return DISABLED;
    }

    private static class Constants {
        private static final java.lang.String DIS = "dis";
        private static final java.lang.String EAG = "eag";

        private Constants() {
        }
    }
}
