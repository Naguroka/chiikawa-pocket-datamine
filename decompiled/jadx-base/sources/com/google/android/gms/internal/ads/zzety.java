package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzety implements com.google.android.gms.internal.ads.zzetq {
    private final int zza;
    private final int zzb;

    zzety(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        int i = this.zza;
        if (i == -1 || this.zzb == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i);
        bundle.putInt("crashes_without_flags", this.zzb);
        int i2 = com.google.android.gms.ads.internal.client.zzbc.zza;
        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
