package com.five_corp.ad.internal.http;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1919a;
    public final java.lang.String b;
    public final byte[] c;

    public c(int i, byte[] bArr, java.lang.String str) {
        this.f1919a = i;
        this.b = str;
        this.c = bArr;
    }

    public final java.lang.String a() {
        java.lang.String str = this.b;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        }
        return null;
    }
}
