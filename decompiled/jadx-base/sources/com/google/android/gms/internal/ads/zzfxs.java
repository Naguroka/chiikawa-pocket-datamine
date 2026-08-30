package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxs extends com.google.android.gms.internal.ads.zzfxi implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.ads.zzfxn zza;

    zzfxs() {
    }

    static int zzh(int i) {
        int iMax = java.lang.Math.max(i, 2);
        if (iMax >= 751619276) {
            com.google.android.gms.internal.ads.zzfun.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static com.google.android.gms.internal.ads.zzfxr zzj(int i) {
        return new com.google.android.gms.internal.ads.zzfxr(i, true);
    }

    public static com.google.android.gms.internal.ads.zzfxs zzl(java.util.Collection collection) {
        if ((collection instanceof com.google.android.gms.internal.ads.zzfxs) && !(collection instanceof java.util.SortedSet)) {
            com.google.android.gms.internal.ads.zzfxs zzfxsVar = (com.google.android.gms.internal.ads.zzfxs) collection;
            if (!zzfxsVar.zzf()) {
                return zzfxsVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static com.google.android.gms.internal.ads.zzfxs zzm(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzv(length, (java.lang.Object[]) objArr.clone()) : new com.google.android.gms.internal.ads.zzfzq(objArr[0]);
        }
        return com.google.android.gms.internal.ads.zzfzf.zza;
    }

    public static com.google.android.gms.internal.ads.zzfxs zzn() {
        return com.google.android.gms.internal.ads.zzfzf.zza;
    }

    public static com.google.android.gms.internal.ads.zzfxs zzo(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzfzq(obj);
    }

    public static com.google.android.gms.internal.ads.zzfxs zzp(java.lang.Object obj, java.lang.Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static com.google.android.gms.internal.ads.zzfxs zzq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static com.google.android.gms.internal.ads.zzfxs zzr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzfxs zzs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, 3);
        return zzv(9, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.ads.zzfxs) && zzu() && ((com.google.android.gms.internal.ads.zzfxs) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return com.google.android.gms.internal.ads.zzfzp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.android.gms.internal.ads.zzfzp.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public com.google.android.gms.internal.ads.zzfxn zzd() {
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = this.zza;
        if (zzfxnVar != null) {
            return zzfxnVar;
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzi = zzi();
        this.zza = zzfxnVarZzi;
        return zzfxnVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract com.google.android.gms.internal.ads.zzfzt iterator();

    com.google.android.gms.internal.ads.zzfxn zzi() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.ads.zzfxn.zzd;
        return com.google.android.gms.internal.ads.zzfxn.zzj(array, array.length);
    }

    boolean zzu() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.zzfxs zzv(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzfzf.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.ads.zzfzq(java.util.Objects.requireNonNull(objArr[0]));
        }
        int iZzh = zzh(i);
        java.lang.Object[] objArr2 = new java.lang.Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            com.google.android.gms.internal.ads.zzfyx.zza(obj, i5);
            int iHashCode = obj.hashCode();
            int iZza = com.google.android.gms.internal.ads.zzfxf.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                java.lang.Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iZza++;
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            return new com.google.android.gms.internal.ads.zzfzq(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzh(i4) < iZzh / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.ads.zzfzf(objArr, i3, objArr2, i2, i4);
    }
}
