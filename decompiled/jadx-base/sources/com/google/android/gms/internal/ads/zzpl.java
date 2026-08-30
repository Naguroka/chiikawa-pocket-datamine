package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzpl extends java.lang.Exception {
    public final int zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzab zzc;

    public zzpl(int i, com.google.android.gms.internal.ads.zzab zzabVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzabVar;
    }
}
