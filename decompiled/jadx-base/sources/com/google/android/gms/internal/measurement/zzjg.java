package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjg extends java.lang.Exception {
    public zzjg() {
    }

    public zzjg(java.lang.String str) {
        super(str);
    }

    public zzjg(java.lang.String str, java.lang.Throwable th) {
        super("ContentProvider query failed", th);
    }
}
