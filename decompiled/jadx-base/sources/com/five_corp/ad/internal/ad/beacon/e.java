package com.five_corp.ad.internal.ad.beacon;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    IMPRESSION(1, false),
    /* JADX INFO: Fake field, exist only in values array */
    VT_25(2, false),
    /* JADX INFO: Fake field, exist only in values array */
    VT_50(3, false),
    /* JADX INFO: Fake field, exist only in values array */
    VT_75(4, false),
    VT_100(5, false),
    ERROR(6, false),
    LOADED(7, false),
    PAUSE(8, true),
    RESUME(9, true),
    REWIND(10, true),
    CLOSE(11, false),
    CLICK_BEACON(12, true),
    /* JADX INFO: Fake field, exist only in values array */
    START(13, false),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPT_INVITATION(14, false),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_IN_MS(15, false),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP(16, false),
    /* JADX INFO: Fake field, exist only in values array */
    START(17, false),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPT_INVITATION(18, false),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_IN_MS(19, false),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP(20, false),
    /* JADX INFO: Fake field, exist only in values array */
    START(21, false),
    VIEWABLE_IMPRESSION(22, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1793a;
    public final boolean b;

    e(int i, boolean z) {
        this.f1793a = i;
        this.b = z;
    }
}
