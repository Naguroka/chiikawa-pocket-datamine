package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzddw {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzfja zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzddw(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfja zzfjaVar) {
        this.zza = zzfboVar.zzp;
        this.zzb = zzfjaVar;
        this.zzc = zzfboVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zze(this.zza, this.zzc);
        this.zzd = true;
    }
}
