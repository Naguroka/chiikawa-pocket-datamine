package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzwo {
    public final long zza;
    public final long zzb;

    public zzwo(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzwo)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzwo zzwoVar = (com.google.android.gms.internal.ads.zzwo) obj;
        return this.zza == zzwoVar.zza && this.zzb == zzwoVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
