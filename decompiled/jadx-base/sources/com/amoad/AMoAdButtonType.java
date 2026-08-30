package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public enum AMoAdButtonType {
    LARGE(1, 40),
    MEDIUM(2, 30),
    SMALL(3, 20);

    private final int mNo;
    final int mSize;

    AMoAdButtonType(int i, int i2) {
        this.mNo = i;
        this.mSize = i2;
    }

    static com.amoad.AMoAdButtonType fromNo(int i) {
        for (com.amoad.AMoAdButtonType aMoAdButtonType : values()) {
            if (java.util.Objects.equals(java.lang.Integer.valueOf(aMoAdButtonType.mNo), java.lang.Integer.valueOf(i))) {
                return aMoAdButtonType;
            }
        }
        return MEDIUM;
    }
}
