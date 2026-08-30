package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzei {
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final java.util.Set zzc;
    private final android.os.Bundle zzd;
    private final java.util.Map zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.ads.search.SearchAdRequest zzh;
    private final int zzi;
    private final java.util.Set zzj;
    private final android.os.Bundle zzk;
    private final java.util.Set zzl;
    private final boolean zzm;
    private final java.lang.String zzn;
    private final int zzo;
    private long zzp = 0;

    public zzei(com.google.android.gms.ads.internal.client.zzeh zzehVar, com.google.android.gms.ads.search.SearchAdRequest searchAdRequest) {
        this.zza = zzehVar.zzg;
        this.zzb = zzehVar.zzh;
        this.zzc = java.util.Collections.unmodifiableSet(zzehVar.zza);
        this.zzd = zzehVar.zzb;
        this.zze = java.util.Collections.unmodifiableMap(zzehVar.zzc);
        this.zzf = zzehVar.zzi;
        this.zzg = zzehVar.zzj;
        this.zzh = searchAdRequest;
        this.zzi = zzehVar.zzk;
        this.zzj = java.util.Collections.unmodifiableSet(zzehVar.zzd);
        this.zzk = zzehVar.zze;
        this.zzl = java.util.Collections.unmodifiableSet(zzehVar.zzf);
        this.zzm = zzehVar.zzl;
        this.zzn = zzehVar.zzm;
        this.zzo = zzehVar.zzn;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzp;
    }

    public final android.os.Bundle zzd(java.lang.Class cls) {
        android.os.Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final android.os.Bundle zze() {
        return this.zzk;
    }

    public final android.os.Bundle zzf(java.lang.Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final android.os.Bundle zzg() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.mediation.NetworkExtras zzh(java.lang.Class cls) {
        return (com.google.android.gms.ads.mediation.NetworkExtras) this.zze.get(cls);
    }

    public final com.google.android.gms.ads.search.SearchAdRequest zzi() {
        return this.zzh;
    }

    public final java.lang.String zzj() {
        return this.zzn;
    }

    public final java.lang.String zzk() {
        return this.zza;
    }

    public final java.lang.String zzl() {
        return this.zzf;
    }

    public final java.lang.String zzm() {
        return this.zzg;
    }

    public final java.util.List zzn() {
        return new java.util.ArrayList(this.zzb);
    }

    public final java.util.Set zzo() {
        return this.zzl;
    }

    public final java.util.Set zzp() {
        return this.zzc;
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    @java.lang.Deprecated
    public final boolean zzr() {
        return this.zzm;
    }

    public final boolean zzs(android.content.Context context) {
        com.google.android.gms.ads.RequestConfiguration requestConfigurationZzc = com.google.android.gms.ads.internal.client.zzex.zzf().zzc();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        java.util.Set set = this.zzj;
        java.lang.String strZzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context);
        return set.contains(strZzy) || requestConfigurationZzc.getTestDeviceIds().contains(strZzy);
    }
}
