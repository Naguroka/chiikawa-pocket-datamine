package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcmo implements com.google.android.gms.internal.ads.zzcvw {
    private final com.google.android.gms.internal.ads.zzfbr zza;
    private final com.google.android.gms.internal.ads.zzfca zzb;
    private final com.google.android.gms.internal.ads.zzfiv zzc;
    private final com.google.android.gms.internal.ads.zzfja zzd;

    public zzcmo(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzfiv zzfivVar) {
        this.zzb = zzfcaVar;
        this.zzd = zzfjaVar;
        this.zzc = zzfivVar;
        this.zza = zzfcaVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        java.util.List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzc(this.zzb, null, list), null);
    }
}
