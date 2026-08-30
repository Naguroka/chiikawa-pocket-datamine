package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum QosTier {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.QosTier> valueMap;
    private final int value;

    static {
        com.google.android.datatransport.cct.internal.QosTier qosTier = DEFAULT;
        com.google.android.datatransport.cct.internal.QosTier qosTier2 = UNMETERED_ONLY;
        com.google.android.datatransport.cct.internal.QosTier qosTier3 = UNMETERED_OR_DAILY;
        com.google.android.datatransport.cct.internal.QosTier qosTier4 = FAST_IF_RADIO_AWAKE;
        com.google.android.datatransport.cct.internal.QosTier qosTier5 = NEVER;
        com.google.android.datatransport.cct.internal.QosTier qosTier6 = UNRECOGNIZED;
        android.util.SparseArray<com.google.android.datatransport.cct.internal.QosTier> sparseArray = new android.util.SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, qosTier);
        sparseArray.put(1, qosTier2);
        sparseArray.put(2, qosTier3);
        sparseArray.put(3, qosTier4);
        sparseArray.put(4, qosTier5);
        sparseArray.put(-1, qosTier6);
    }

    QosTier(int i) {
        this.value = i;
    }

    public final int getNumber() {
        return this.value;
    }

    public static com.google.android.datatransport.cct.internal.QosTier forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }
}
