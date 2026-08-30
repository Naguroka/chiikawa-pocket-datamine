package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzzd {
    private static final java.util.Comparator zza = new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzyz
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.android.gms.internal.ads.zzzb) obj).zza - ((com.google.android.gms.internal.ads.zzzb) obj2).zza;
        }
    };
    private static final java.util.Comparator zzb = new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzza
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Float.compare(((com.google.android.gms.internal.ads.zzzb) obj).zzc, ((com.google.android.gms.internal.ads.zzzb) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final com.google.android.gms.internal.ads.zzzb[] zzd = new com.google.android.gms.internal.ads.zzzb[5];
    private final java.util.ArrayList zzc = new java.util.ArrayList();
    private int zze = -1;

    public zzzd(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            java.util.Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            com.google.android.gms.internal.ads.zzzb zzzbVar = (com.google.android.gms.internal.ads.zzzb) this.zzc.get(i2);
            i += zzzbVar.zzb;
            if (i >= f3) {
                return zzzbVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        java.util.ArrayList arrayList = this.zzc;
        return ((com.google.android.gms.internal.ads.zzzb) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        com.google.android.gms.internal.ads.zzzb zzzbVar;
        if (this.zze != 1) {
            java.util.Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            com.google.android.gms.internal.ads.zzzb[] zzzbVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzzbVar = zzzbVarArr[i3];
        } else {
            zzzbVar = new com.google.android.gms.internal.ads.zzzb(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzzbVar.zza = i4;
        zzzbVar.zzb = i;
        zzzbVar.zzc = f;
        this.zzc.add(zzzbVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 + androidx.media3.common.C.PRIORITY_PROCESSING_FOREGROUND;
            com.google.android.gms.internal.ads.zzzb zzzbVar2 = (com.google.android.gms.internal.ads.zzzb) this.zzc.get(0);
            int i7 = zzzbVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    com.google.android.gms.internal.ads.zzzb[] zzzbVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzzbVarArr2[i8] = zzzbVar2;
                }
            } else {
                zzzbVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
