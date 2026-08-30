package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzy {
    private java.lang.String zza = null;
    private java.lang.Boolean zzb = null;
    private java.lang.Boolean zzc = null;

    private zzy() {
    }

    /* synthetic */ zzy(com.google.android.gms.common.zzz zzzVar) {
    }

    final com.google.android.gms.common.zzy zza(boolean z) {
        this.zzb = java.lang.Boolean.valueOf(z);
        return this;
    }

    final com.google.android.gms.common.zzy zzb(boolean z) {
        this.zzc = java.lang.Boolean.valueOf(z);
        return this;
    }

    final com.google.android.gms.common.zzy zzc(java.lang.String str) {
        this.zza = str;
        return this;
    }

    final com.google.android.gms.common.zzaa zzd() {
        java.lang.Boolean bool = this.zzb;
        if (bool == null) {
            throw new java.lang.IllegalStateException("allowTestKeys must be set");
        }
        if (this.zzc != null) {
            return new com.google.android.gms.common.zzaa(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), null, null);
        }
        throw new java.lang.IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
