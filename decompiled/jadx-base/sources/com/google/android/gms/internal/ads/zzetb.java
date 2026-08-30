package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetb implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzbyi zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final android.content.Context zzc;

    public zzetb(com.google.android.gms.internal.ads.zzbyi zzbyiVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzbyiVar;
        this.zzb = zzgcsVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetc zzc() throws java.lang.Exception {
        if (!this.zza.zzp(this.zzc)) {
            return new com.google.android.gms.internal.ads.zzetc(null, null, null, null, null);
        }
        java.lang.String strZzd = this.zza.zzd(this.zzc);
        java.lang.String str = strZzd == null ? "" : strZzd;
        java.lang.String strZzb = this.zza.zzb(this.zzc);
        java.lang.String str2 = strZzb == null ? "" : strZzb;
        java.lang.String strZza = this.zza.zza(this.zzc);
        java.lang.String str3 = strZza == null ? "" : strZza;
        java.lang.Long l = null;
        java.lang.String str4 = true != this.zza.zzp(this.zzc) ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzat);
        }
        return new com.google.android.gms.internal.ads.zzetc(str, str2, str3, str4 == null ? "" : str4, l);
    }
}
