package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public enum CreativeType {
    NOT_LOADED(0),
    MOVIE(1),
    IMAGE(2);

    public final int value;

    CreativeType(int i) {
        this.value = i;
    }

    public static com.five_corp.ad.CreativeType get(int i) throws com.five_corp.ad.internal.exception.a {
        for (com.five_corp.ad.CreativeType creativeType : values()) {
            if (creativeType.value == i) {
                return creativeType;
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.b1, i);
    }
}
