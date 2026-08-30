package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaf {
    private java.lang.String zza = null;
    private long zzb = -1;
    private com.google.android.gms.internal.common.zzal zzc = com.google.android.gms.internal.common.zzal.zzm();
    private com.google.android.gms.internal.common.zzal zzd = com.google.android.gms.internal.common.zzal.zzm();

    zzaf() {
    }

    final com.google.android.gms.common.zzaf zza(long j) {
        this.zzb = j;
        return this;
    }

    final com.google.android.gms.common.zzaf zzb(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzd = com.google.android.gms.internal.common.zzal.zzl(list);
        return this;
    }

    final com.google.android.gms.common.zzaf zzc(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzc = com.google.android.gms.internal.common.zzal.zzl(list);
        return this;
    }

    final com.google.android.gms.common.zzaf zzd(java.lang.String str) {
        this.zza = str;
        return this;
    }

    final com.google.android.gms.common.zzah zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new java.lang.IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new java.lang.IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new com.google.android.gms.common.zzah(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
