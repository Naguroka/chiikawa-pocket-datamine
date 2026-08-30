package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzo {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.content.ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    public zzo(android.content.ComponentName componentName, int i) {
        this.zza = null;
        this.zzb = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        this.zzc = componentName;
        this.zzd = 4225;
        this.zze = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.zzo)) {
            return false;
        }
        com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzoVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzoVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzoVar.zzc)) {
            int i = zzoVar.zzd;
            if (this.zze == zzoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, 4225, java.lang.Boolean.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
        return this.zzc.flattenToString();
    }

    public final android.content.ComponentName zza() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public zzo(java.lang.String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(java.lang.String str, java.lang.String str2, int i, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        this.zzb = str2;
        this.zzc = null;
        this.zzd = 4225;
        this.zze = z;
    }
}
