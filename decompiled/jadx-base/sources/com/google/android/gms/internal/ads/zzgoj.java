package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgoj implements com.google.android.gms.internal.ads.zzgng {
    private static final com.google.android.gms.internal.ads.zzgoj zza = new com.google.android.gms.internal.ads.zzgoj();

    private zzgoj() {
    }

    static void zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgmh.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final java.lang.Class zza() {
        return com.google.android.gms.internal.ads.zzgog.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final java.lang.Class zzb() {
        return com.google.android.gms.internal.ads.zzgog.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzgnf zzgnfVar) throws java.security.GeneralSecurityException {
        if (zzgnfVar.zzc() == null) {
            throw new java.security.GeneralSecurityException("no primary in primitive set");
        }
        java.util.Iterator it = zzgnfVar.zze().iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((java.util.List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new com.google.android.gms.internal.ads.zzgoh(zzgnfVar, null);
    }
}
