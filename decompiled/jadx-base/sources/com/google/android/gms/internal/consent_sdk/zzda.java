package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzda extends com.google.android.gms.internal.consent_sdk.zzcx implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.consent_sdk.zzdh zza = new com.google.android.gms.internal.consent_sdk.zzcy(com.google.android.gms.internal.consent_sdk.zzdd.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzda() {
    }

    static com.google.android.gms.internal.consent_sdk.zzda zzg(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.consent_sdk.zzdd.zza : new com.google.android.gms.internal.consent_sdk.zzdd(objArr, i);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                        if (com.google.android.gms.internal.consent_sdk.zzcs.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.android.gms.internal.consent_sdk.zzcs.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    /* JADX INFO: renamed from: zzd */
    public final com.google.android.gms.internal.consent_sdk.zzdg iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.consent_sdk.zzda subList(int i, int i2) {
        com.google.android.gms.internal.consent_sdk.zzct.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? com.google.android.gms.internal.consent_sdk.zzdd.zza : new com.google.android.gms.internal.consent_sdk.zzcz(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzdh listIterator(int i) {
        com.google.android.gms.internal.consent_sdk.zzct.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.consent_sdk.zzcy(this, i);
    }
}
