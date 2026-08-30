package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzkh {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkh() {
        this.zza = androidx.media3.common.C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }

    /* synthetic */ zzkh(com.google.android.gms.internal.ads.zzkj zzkjVar, com.google.android.gms.internal.ads.zzki zzkiVar) {
        this.zza = zzkjVar.zza;
        this.zzb = zzkjVar.zzb;
        this.zzc = zzkjVar.zzc;
    }

    public final com.google.android.gms.internal.ads.zzkh zzd(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzc = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzkh zze(long j) {
        this.zza = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzkh zzf(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzb = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzkj zzg() {
        return new com.google.android.gms.internal.ads.zzkj(this, null);
    }
}
