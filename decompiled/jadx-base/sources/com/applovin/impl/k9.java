package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class k9 implements com.applovin.impl.y4 {
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.UUID f951a;
    public final byte[] b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(com.applovin.impl.xp.c)) {
            java.lang.String str = com.applovin.impl.xp.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        d = z;
    }

    public k9(java.util.UUID uuid, byte[] bArr, boolean z) {
        this.f951a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
