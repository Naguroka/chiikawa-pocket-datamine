package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzeq {
    public final int zzd;

    public static java.lang.String zze(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public java.lang.String toString() {
        return zze(this.zzd);
    }
}
