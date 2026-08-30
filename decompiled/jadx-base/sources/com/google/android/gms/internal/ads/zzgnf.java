package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnf {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzgnd zzb;
    private final java.lang.Class zzc;
    private final com.google.android.gms.internal.ads.zzglo zzd;

    /* synthetic */ zzgnf(java.util.Map map, java.util.List list, com.google.android.gms.internal.ads.zzgnd zzgndVar, com.google.android.gms.internal.ads.zzglo zzgloVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzgne zzgneVar) {
        this.zza = map;
        this.zzb = zzgndVar;
        this.zzc = cls;
        this.zzd = zzgloVar;
    }

    public static com.google.android.gms.internal.ads.zzgnc zzb(java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzgnc(cls, null);
    }

    public final com.google.android.gms.internal.ads.zzglo zza() {
        return this.zzd;
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.internal.ads.zzgnd zzc() {
        return this.zzb;
    }

    public final java.lang.Class zzd() {
        return this.zzc;
    }

    public final java.util.Collection zze() {
        return this.zza.values();
    }

    public final java.util.List zzf(byte[] bArr) {
        java.util.List list = (java.util.List) this.zza.get(com.google.android.gms.internal.ads.zzgvo.zzb(bArr));
        return list != null ? list : java.util.Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.zzd.zza().isEmpty();
    }
}
