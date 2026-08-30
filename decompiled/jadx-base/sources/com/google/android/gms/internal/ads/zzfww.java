package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfww extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.lang.Object zzd = new java.lang.Object();

    @javax.annotation.CheckForNull
    transient int[] zza;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] zzb;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] zzc;

    @javax.annotation.CheckForNull
    private transient java.lang.Object zze;
    private transient int zzf;
    private transient int zzg;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzh;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzi;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzj;

    zzfww() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        return (int[]) java.util.Objects.requireNonNull(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] zzB() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] zzC() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.zzc);
    }

    static /* synthetic */ java.lang.Object zzg(com.google.android.gms.internal.ads.zzfww zzfwwVar, int i) {
        return zzfwwVar.zzB()[i];
    }

    static /* synthetic */ java.lang.Object zzj(com.google.android.gms.internal.ads.zzfww zzfwwVar, int i) {
        return zzfwwVar.zzC()[i];
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfww zzfwwVar, int i, java.lang.Object obj) {
        zzfwwVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZzb = com.google.android.gms.internal.ads.zzfxf.zzb(obj);
        int iZzv = zzv();
        int iZzc = com.google.android.gms.internal.ads.zzfwx.zzc(java.util.Objects.requireNonNull(this.zze), iZzb & iZzv);
        if (iZzc != 0) {
            int i = ~iZzv;
            int i2 = iZzb & i;
            do {
                int i3 = iZzc - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && com.google.android.gms.internal.ads.zzfuk.zza(obj, zzB()[i3])) {
                    return i3;
                }
                iZzc = i4 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object objZzd = com.google.android.gms.internal.ads.zzfwx.zzd(i2);
        if (i4 != 0) {
            com.google.android.gms.internal.ads.zzfwx.zze(objZzd, i3 & i5, i4 + 1);
        }
        java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] iArrZzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int iZzc = com.google.android.gms.internal.ads.zzfwx.zzc(objRequireNonNull, i6);
            while (iZzc != 0) {
                int i7 = iZzc - 1;
                int i8 = iArrZzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iZzc2 = com.google.android.gms.internal.ads.zzfwx.zzc(objZzd, i10);
                com.google.android.gms.internal.ads.zzfwx.zze(objZzd, i10, iZzc);
                iArrZzA[i7] = ((~i5) & i9) | (iZzc2 & i5);
                iZzc = i8 & i;
            }
        }
        this.zze = objZzd;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzy(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            int iZzb = com.google.android.gms.internal.ads.zzfwx.zzb(obj, null, iZzv, java.util.Objects.requireNonNull(this.zze), zzA(), zzB(), null);
            if (iZzb != -1) {
                java.lang.Object obj2 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj2;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = com.google.android.gms.internal.ads.zzgaq.zzc(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        java.util.Arrays.fill(zzB(), 0, this.zzg, (java.lang.Object) null);
        java.util.Arrays.fill(zzC(), 0, this.zzg, (java.lang.Object) null);
        java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(this.zze);
        if (objRequireNonNull instanceof byte[]) {
            java.util.Arrays.fill((byte[]) objRequireNonNull, (byte) 0);
        } else if (objRequireNonNull instanceof short[]) {
            java.util.Arrays.fill((short[]) objRequireNonNull, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) objRequireNonNull, 0);
        }
        java.util.Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (com.google.android.gms.internal.ads.zzfuk.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.zzi;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.ads.zzfwq zzfwqVar = new com.google.android.gms.internal.ads.zzfwq(this);
        this.zzi = zzfwqVar;
        return zzfwqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.zzh;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.ads.zzfws zzfwsVar = new com.google.android.gms.internal.ads.zzfws(this);
        this.zzh = zzfwsVar;
        return zzfwsVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int iMin;
        if (zzr()) {
            com.google.android.gms.internal.ads.zzfun.zzm(zzr(), "Arrays already allocated");
            int i = this.zzf;
            int iMax = java.lang.Math.max(i + 1, 2);
            int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = java.lang.Math.max(4, iHighestOneBit);
            this.zze = com.google.android.gms.internal.ads.zzfwx.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i];
            this.zzb = new java.lang.Object[i];
            this.zzc = new java.lang.Object[i];
        }
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        java.lang.Object[] objArrZzB = zzB();
        java.lang.Object[] objArrZzC = zzC();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int iZzb = com.google.android.gms.internal.ads.zzfxf.zzb(obj);
        int iZzv = zzv();
        int i4 = iZzb & iZzv;
        int iZzc = com.google.android.gms.internal.ads.zzfwx.zzc(java.util.Objects.requireNonNull(this.zze), i4);
        if (iZzc != 0) {
            int i5 = ~iZzv;
            int i6 = iZzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = iZzc - 1;
                int i9 = iArrZzA[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && com.google.android.gms.internal.ads.zzfuk.zza(obj, objArrZzB[i8])) {
                    java.lang.Object obj3 = objArrZzC[i8];
                    objArrZzC[i8] = obj2;
                    return obj3;
                }
                int i11 = i9 & iZzv;
                i7++;
                if (i11 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iZzv) {
                            iArrZzA[i8] = (i3 & iZzv) | i10;
                            break;
                        }
                        iZzv = zzx(iZzv, com.google.android.gms.internal.ads.zzfwx.zza(iZzv), iZzb, i2);
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i11;
            }
        } else if (i3 > iZzv) {
            iZzv = zzx(iZzv, com.google.android.gms.internal.ads.zzfwx.zza(iZzv), iZzb, i2);
        } else {
            com.google.android.gms.internal.ads.zzfwx.zze(java.util.Objects.requireNonNull(this.zze), i4, i3);
        }
        int length = zzA().length;
        if (i3 > length && (iMin = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = java.util.Arrays.copyOf(zzA(), iMin);
            this.zzb = java.util.Arrays.copyOf(zzB(), iMin);
            this.zzc = java.util.Arrays.copyOf(zzC(), iMin);
        }
        zzA()[i2] = (~iZzv) & iZzb;
        zzB()[i2] = obj;
        zzC()[i2] = obj2;
        this.zzg = i3;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        java.lang.Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.zzfwu zzfwuVar = new com.google.android.gms.internal.ads.zzfwu(this);
        this.zzj = zzfwuVar;
        return zzfwuVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @javax.annotation.CheckForNull
    final java.util.Map zzl() {
        java.lang.Object obj = this.zze;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i) {
        this.zzf = com.google.android.gms.internal.ads.zzgaq.zzc(i, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzq(int i, int i2) {
        java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(this.zze);
        int[] iArrZzA = zzA();
        java.lang.Object[] objArrZzB = zzB();
        java.lang.Object[] objArrZzC = zzC();
        int size = size() - 1;
        if (i >= size) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i3 = i + 1;
        java.lang.Object obj = objArrZzB[size];
        objArrZzB[i] = obj;
        objArrZzC[i] = objArrZzC[size];
        objArrZzB[size] = null;
        objArrZzC[size] = null;
        iArrZzA[i] = iArrZzA[size];
        iArrZzA[size] = 0;
        int iZzb = com.google.android.gms.internal.ads.zzfxf.zzb(obj) & i2;
        int iZzc = com.google.android.gms.internal.ads.zzfwx.zzc(objRequireNonNull, iZzb);
        int i4 = size + 1;
        if (iZzc == i4) {
            com.google.android.gms.internal.ads.zzfwx.zze(objRequireNonNull, iZzb, i3);
            return;
        }
        while (true) {
            int i5 = iZzc - 1;
            int i6 = iArrZzA[i5];
            int i7 = i6 & i2;
            if (i7 == i4) {
                iArrZzA[i5] = (i6 & (~i2)) | (i2 & i3);
                return;
            }
            iZzc = i7;
        }
    }

    final boolean zzr() {
        return this.zze == null;
    }

    zzfww(int i) {
        zzp(8);
    }
}
