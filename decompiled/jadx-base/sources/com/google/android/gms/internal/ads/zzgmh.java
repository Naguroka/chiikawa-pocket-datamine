package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmh {
    private static final com.google.android.gms.internal.ads.zzgmh zza = new com.google.android.gms.internal.ads.zzgmh();
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.zzgnb(new com.google.android.gms.internal.ads.zzgmy(null), null));

    zzgmh() {
    }

    public static com.google.android.gms.internal.ads.zzgmh zza() {
        return zza;
    }

    public final java.lang.Class zzb(java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnb) this.zzb.get()).zza(cls);
    }

    public final java.lang.Object zzc(com.google.android.gms.internal.ads.zzgdx zzgdxVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnb) this.zzb.get()).zzb(zzgdxVar, cls);
    }

    public final java.lang.Object zzd(com.google.android.gms.internal.ads.zzgnf zzgnfVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnb) this.zzb.get()).zzc(zzgnfVar, cls);
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzgmx zzgmxVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgmy zzgmyVar = new com.google.android.gms.internal.ads.zzgmy((com.google.android.gms.internal.ads.zzgnb) this.zzb.get(), null);
        zzgmyVar.zza(zzgmxVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnb(zzgmyVar, null));
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzgng zzgngVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgmy zzgmyVar = new com.google.android.gms.internal.ads.zzgmy((com.google.android.gms.internal.ads.zzgnb) this.zzb.get(), null);
        zzgmyVar.zzb(zzgngVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnb(zzgmyVar, null));
    }
}
