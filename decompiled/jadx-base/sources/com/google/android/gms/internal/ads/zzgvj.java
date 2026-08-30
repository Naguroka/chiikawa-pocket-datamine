package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgvj extends java.lang.ThreadLocal {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvk zza;

    zzgvj(com.google.android.gms.internal.ads.zzgvk zzgvkVar) {
        this.zza = zzgvkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final javax.crypto.Mac initialValue() {
        try {
            javax.crypto.Mac mac = (javax.crypto.Mac) com.google.android.gms.internal.ads.zzguw.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
