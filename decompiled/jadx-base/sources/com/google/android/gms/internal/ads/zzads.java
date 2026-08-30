package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzads {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzads(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzads zzadsVar = (com.google.android.gms.internal.ads.zzads) obj;
            if (this.zza == zzadsVar.zza && this.zzc == zzadsVar.zzc && this.zzd == zzadsVar.zzd && java.util.Arrays.equals(this.zzb, zzadsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + java.util.Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
