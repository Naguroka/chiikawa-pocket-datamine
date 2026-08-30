package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzpi extends java.lang.Exception {
    public final int zza;
    public final boolean zzb;

    public zzpi(int i, int i2, int i3, int i4, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, java.lang.Exception exc) {
        java.lang.String strValueOf = java.lang.String.valueOf(zzabVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
    }
}
