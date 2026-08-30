package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgao implements java.io.Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgao(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i2;
    }

    public static com.google.android.gms.internal.ads.zzgao zzb(int[] iArr) {
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
        return new com.google.android.gms.internal.ads.zzgao(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgao)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgao zzgaoVar = (com.google.android.gms.internal.ads.zzgao) obj;
        if (this.zzb != zzgaoVar.zzb) {
            return false;
        }
        for (int i = 0; i < this.zzb; i++) {
            if (zza(i) != zzgaoVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        if (i == 0) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.zza[0]);
        for (int i2 = 1; i2 < this.zzb; i2++) {
            sb.append(", ");
            sb.append(this.zza[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zza[i];
    }
}
