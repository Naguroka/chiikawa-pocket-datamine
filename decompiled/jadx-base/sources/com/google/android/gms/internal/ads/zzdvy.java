package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzdvy extends java.lang.Exception {
    private final int zza;

    public zzdvy(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdvy(int i, java.lang.String str) {
        super(str);
        this.zza = i;
    }

    public zzdvy(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
