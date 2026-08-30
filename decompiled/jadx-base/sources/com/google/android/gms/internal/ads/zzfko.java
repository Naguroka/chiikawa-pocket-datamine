package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfko {
    private boolean zza;

    final void zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfmk.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        com.google.android.gms.internal.ads.zzfls.zzb().zzd(context);
        com.google.android.gms.internal.ads.zzflj.zza().zzd(context);
        com.google.android.gms.internal.ads.zzfmf.zzb(context);
        com.google.android.gms.internal.ads.zzfmg.zzd(context);
        com.google.android.gms.internal.ads.zzfmj.zza(context);
        com.google.android.gms.internal.ads.zzflp.zzb().zzc(context);
        com.google.android.gms.internal.ads.zzfli.zza().zzd(context);
        com.google.android.gms.internal.ads.zzflu.zza().zze(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
