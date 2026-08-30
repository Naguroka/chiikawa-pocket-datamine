package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza {
    public static final /* synthetic */ int zzi = 0;
    public final long zza;
    public final int zzb;

    @java.lang.Deprecated
    public final android.net.Uri[] zzc;
    public final com.google.android.gms.internal.ads.zzar[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new com.google.android.gms.internal.ads.zzar[0], new long[0], 0L, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zza zzaVar = (com.google.android.gms.internal.ads.zza) obj;
            if (this.zzb == zzaVar.zzb && java.util.Arrays.equals(this.zzd, zzaVar.zzd) && java.util.Arrays.equals(this.zze, zzaVar.zze) && java.util.Arrays.equals(this.zzf, zzaVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzb * 31) - 1) * 961) + java.util.Arrays.hashCode(this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze)) * 31) + java.util.Arrays.hashCode(this.zzf)) * 961;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final com.google.android.gms.internal.ads.zza zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = java.lang.Math.max(0, length);
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
        java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = java.lang.Math.max(0, length2);
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax2);
        java.util.Arrays.fill(jArrCopyOf, length2, iMax2, androidx.media3.common.C.TIME_UNSET);
        return new com.google.android.gms.internal.ads.zza(0L, 0, -1, iArrCopyOf, (com.google.android.gms.internal.ads.zzar[]) java.util.Arrays.copyOf(this.zzd, 0), jArrCopyOf, 0L, false);
    }

    private zza(long j, int i, int i2, int[] iArr, com.google.android.gms.internal.ads.zzar[] zzarVarArr, long[] jArr, long j2, boolean z) {
        android.net.Uri uri;
        int length = iArr.length;
        int length2 = zzarVarArr.length;
        int i3 = 0;
        com.google.android.gms.internal.ads.zzcw.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i;
        this.zze = iArr;
        this.zzd = zzarVarArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
        this.zzc = new android.net.Uri[length2];
        while (true) {
            android.net.Uri[] uriArr = this.zzc;
            if (i3 >= uriArr.length) {
                return;
            }
            com.google.android.gms.internal.ads.zzar zzarVar = zzarVarArr[i3];
            if (zzarVar == null) {
                uri = null;
            } else {
                com.google.android.gms.internal.ads.zzam zzamVar = zzarVar.zzb;
                zzamVar.getClass();
                uri = zzamVar.zza;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }
}
