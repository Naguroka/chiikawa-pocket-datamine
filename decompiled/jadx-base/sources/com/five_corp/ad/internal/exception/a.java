package com.five_corp.ad.internal.exception;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.five_corp.ad.internal.exception.b {
    public a(com.five_corp.ad.internal.t tVar, int i) {
        super(tVar, java.lang.String.format("DetailedErrorCode name %s: DetailedErrorCode enum value: %d, unknown enum value %d", tVar.name(), java.lang.Integer.valueOf(tVar.b()), java.lang.Integer.valueOf(i)));
    }
}
