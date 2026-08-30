package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbt extends com.google.android.gms.internal.play_billing.zzbq implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.play_billing.zzci zza = new com.google.android.gms.internal.play_billing.zzbr(com.google.android.gms.internal.play_billing.zzca.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzbt() {
    }

    static com.google.android.gms.internal.play_billing.zzbt zzi(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.play_billing.zzca.zza : new com.google.android.gms.internal.play_billing.zzca(objArr, i);
    }

    public static com.google.android.gms.internal.play_billing.zzbt zzj(java.util.Collection collection) {
        if (!(collection instanceof com.google.android.gms.internal.play_billing.zzbq)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            com.google.android.gms.internal.play_billing.zzbz.zza(array, length);
            return zzi(array, length);
        }
        com.google.android.gms.internal.play_billing.zzbt zzbtVarZzd = ((com.google.android.gms.internal.play_billing.zzbq) collection).zzd();
        if (!zzbtVarZzd.zzf()) {
            return zzbtVarZzd;
        }
        java.lang.Object[] array2 = zzbtVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static com.google.android.gms.internal.play_billing.zzbt zzk() {
        return com.google.android.gms.internal.play_billing.zzca.zza;
    }

    public static com.google.android.gms.internal.play_billing.zzbt zzl(java.lang.Object obj) {
        java.lang.Object[] objArr = {"inapp"};
        com.google.android.gms.internal.play_billing.zzbz.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static com.google.android.gms.internal.play_billing.zzbt zzm(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {"subs", "inapp"};
        com.google.android.gms.internal.play_billing.zzbz.zza(objArr, 2);
        return zzi(objArr, 2);
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

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.play_billing.zzbf.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.play_billing.zzbf.zza(it.next(), it2.next())) {
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
    public final int indexOf(java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.play_billing.zzbq
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    @java.lang.Deprecated
    public final com.google.android.gms.internal.play_billing.zzbt zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.play_billing.zzch iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.play_billing.zzbt subList(int i, int i2) {
        com.google.android.gms.internal.play_billing.zzbg.zzd(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? com.google.android.gms.internal.play_billing.zzca.zza : new com.google.android.gms.internal.play_billing.zzbs(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzci listIterator(int i) {
        com.google.android.gms.internal.play_billing.zzbg.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.play_billing.zzbr(this, i);
    }
}
