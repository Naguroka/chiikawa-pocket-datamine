package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public enum FiveAdErrorCode {
    NETWORK_ERROR(1),
    NO_AD(2),
    BAD_APP_ID(4),
    STORAGE_ERROR(5),
    INTERNAL_ERROR(6),
    INVALID_STATE(8),
    BAD_SLOT_ID(9),
    SUPPRESSED(10),
    PLAYER_ERROR(12),
    FORMAT_MISMATCH(13);

    public final int value;

    FiveAdErrorCode(int i) {
        this.value = i;
    }
}
