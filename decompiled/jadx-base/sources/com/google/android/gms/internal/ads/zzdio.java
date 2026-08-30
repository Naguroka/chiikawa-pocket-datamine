package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdio {
    com.google.android.gms.internal.ads.zzbgx zza;
    com.google.android.gms.internal.ads.zzbgu zzb;
    com.google.android.gms.internal.ads.zzbhk zzc;
    com.google.android.gms.internal.ads.zzbhh zzd;
    com.google.android.gms.internal.ads.zzbmi zze;
    final androidx.collection.SimpleArrayMap zzf = new androidx.collection.SimpleArrayMap();
    final androidx.collection.SimpleArrayMap zzg = new androidx.collection.SimpleArrayMap();

    public final com.google.android.gms.internal.ads.zzdio zza(com.google.android.gms.internal.ads.zzbgu zzbguVar) {
        this.zzb = zzbguVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdio zzb(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        this.zza = zzbgxVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdio zzc(java.lang.String str, com.google.android.gms.internal.ads.zzbhd zzbhdVar, com.google.android.gms.internal.ads.zzbha zzbhaVar) {
        this.zzf.put(str, zzbhdVar);
        if (zzbhaVar != null) {
            this.zzg.put(str, zzbhaVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdio zzd(com.google.android.gms.internal.ads.zzbmi zzbmiVar) {
        this.zze = zzbmiVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdio zze(com.google.android.gms.internal.ads.zzbhh zzbhhVar) {
        this.zzd = zzbhhVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdio zzf(com.google.android.gms.internal.ads.zzbhk zzbhkVar) {
        this.zzc = zzbhkVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdiq zzg() {
        return new com.google.android.gms.internal.ads.zzdiq(this);
    }
}
