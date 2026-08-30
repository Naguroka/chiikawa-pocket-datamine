package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcva {
    private android.content.Context zza;
    private com.google.android.gms.internal.ads.zzfcj zzb;
    private android.os.Bundle zzc;
    private com.google.android.gms.internal.ads.zzfcb zzd;
    private com.google.android.gms.internal.ads.zzcut zze;
    private com.google.android.gms.internal.ads.zzedb zzf;
    private int zzg = 0;

    public final com.google.android.gms.internal.ads.zzcva zze(com.google.android.gms.internal.ads.zzedb zzedbVar) {
        this.zzf = zzedbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzf(android.content.Context context) {
        this.zza = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzg(android.os.Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzh(com.google.android.gms.internal.ads.zzcut zzcutVar) {
        this.zze = zzcutVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzi(int i) {
        this.zzg = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzj(com.google.android.gms.internal.ads.zzfcb zzfcbVar) {
        this.zzd = zzfcbVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcva zzk(com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zzb = zzfcjVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcvc zzl() {
        return new com.google.android.gms.internal.ads.zzcvc(this, null);
    }
}
