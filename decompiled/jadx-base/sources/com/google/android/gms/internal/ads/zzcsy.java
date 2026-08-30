package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcsy implements com.google.android.gms.ads.internal.client.zza {
    private final com.google.android.gms.internal.ads.zzctc zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;

    zzcsy(com.google.android.gms.internal.ads.zzctc zzctcVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zza = zzctcVar;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
