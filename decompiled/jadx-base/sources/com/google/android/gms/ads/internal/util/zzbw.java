package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbw extends com.google.android.gms.ads.internal.util.zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbw(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzfir zzfirVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zza(this.zzb);
        } else {
            new com.google.android.gms.internal.ads.zzfiq(zzvVar.zzb(), this.zza, com.google.android.gms.internal.ads.zzbzw.zze, null).zzd(this.zzb);
        }
    }
}
