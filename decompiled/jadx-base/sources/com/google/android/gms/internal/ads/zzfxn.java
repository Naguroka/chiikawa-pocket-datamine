package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxn extends com.google.android.gms.internal.ads.zzfxi implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.ads.zzfzu zza = new com.google.android.gms.internal.ads.zzfxl(com.google.android.gms.internal.ads.zzfyz.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzfxn() {
    }

    public static com.google.android.gms.internal.ads.zzfxk zzi(int i) {
        com.google.android.gms.internal.ads.zzfwk.zza(i, "expectedSize");
        return new com.google.android.gms.internal.ads.zzfxk(i);
    }

    static com.google.android.gms.internal.ads.zzfxn zzj(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.ads.zzfyz.zza : new com.google.android.gms.internal.ads.zzfyz(objArr, i);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzl(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.ads.zzfxi)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.ads.zzfyx.zzb(array, length);
            return zzj(array, length);
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzd = ((com.google.android.gms.internal.ads.zzfxi) collection).zzd();
        if (!zzfxnVarZzd.zzf()) {
            return zzfxnVarZzd;
        }
        java.lang.Object[] array2 = zzfxnVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzm(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return com.google.android.gms.internal.ads.zzfyz.zza;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzn() {
        return com.google.android.gms.internal.ads.zzfyz.zza;
    }

    public static com.google.android.gms.internal.ads.zzfxn zzo(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzp(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzq(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzfxn zzt(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        java.lang.System.arraycopy(objArr, 0, objArr2, 12, length);
        com.google.android.gms.internal.ads.zzfyx.zzb(objArr2, i);
        return zzj(objArr2, i);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.ads.zzfuk.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.ads.zzfuk.zza(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzfxn zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.ads.zzfzt iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.zzfxn subList(int i, int i2) {
        com.google.android.gms.internal.ads.zzfun.zzk(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? com.google.android.gms.internal.ads.zzfyz.zza : new com.google.android.gms.internal.ads.zzfxm(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfzu listIterator(int i) {
        com.google.android.gms.internal.ads.zzfun.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.ads.zzfxl(this, i);
    }

    public static com.google.android.gms.internal.ads.zzfxn zzk(java.lang.Iterable iterable) {
        iterable.getClass();
        return zzl((java.util.Collection) iterable);
    }
}
