package com.five_corp.ad.internal.ad_check;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        throw null;
    }

    public static /* synthetic */ java.lang.String b(int i) {
        if (i == 1) {
            return "NOT_SHOW";
        }
        if (i == 2) {
            return "SUPPRESSED";
        }
        if (i == 3) {
            return "SHOW_ONE_OF_AD";
        }
        throw null;
    }
}
