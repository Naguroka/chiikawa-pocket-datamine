package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawf extends com.google.android.gms.internal.ads.zzatq {
    public java.lang.Long zza;
    public java.lang.Long zzb;
    public java.lang.Long zzc;
    public java.lang.Long zzd;
    public java.lang.Long zze;
    public java.lang.Long zzf;
    public java.lang.Long zzg;
    public java.lang.Long zzh;
    public java.lang.Long zzi;
    public java.lang.Long zzj;
    public java.lang.Long zzk;

    public zzawf() {
    }

    public zzawf(java.lang.String str) {
        java.util.HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = (java.lang.Long) mapZza.get(0);
            this.zzb = (java.lang.Long) mapZza.get(1);
            this.zzc = (java.lang.Long) mapZza.get(2);
            this.zzd = (java.lang.Long) mapZza.get(3);
            this.zze = (java.lang.Long) mapZza.get(4);
            this.zzf = (java.lang.Long) mapZza.get(5);
            this.zzg = (java.lang.Long) mapZza.get(6);
            this.zzh = (java.lang.Long) mapZza.get(7);
            this.zzi = (java.lang.Long) mapZza.get(8);
            this.zzj = (java.lang.Long) mapZza.get(9);
            this.zzk = (java.lang.Long) mapZza.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    protected final java.util.HashMap zzb() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        map.put(4, this.zze);
        map.put(5, this.zzf);
        map.put(6, this.zzg);
        map.put(7, this.zzh);
        map.put(8, this.zzi);
        map.put(9, this.zzj);
        map.put(10, this.zzk);
        return map;
    }
}
