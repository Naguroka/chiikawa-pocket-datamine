package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcma implements com.google.android.gms.internal.ads.zzcwo {
    private final com.google.android.gms.internal.ads.zzfdh zza;

    public zzcma(com.google.android.gms.internal.ads.zzfdh zzfdhVar) {
        this.zza = zzfdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(android.content.Context context) {
        try {
            this.zza.zzg();
        } catch (com.google.android.gms.internal.ads.zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(android.content.Context context) {
        try {
            this.zza.zzt();
        } catch (com.google.android.gms.internal.ads.zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(android.content.Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (com.google.android.gms.internal.ads.zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
