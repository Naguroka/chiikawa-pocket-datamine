package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgap extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzgap(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) && com.google.android.gms.internal.ads.zzgaq.zza(this.zza, ((java.lang.Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgap)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzgap zzgapVar = (com.google.android.gms.internal.ads.zzgap) obj;
        int i = this.zzc - this.zzb;
        if (zzgapVar.zzc - zzgapVar.zzb != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zza[this.zzb + i2] != zzgapVar.zza[zzgapVar.zzb + i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzc - this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.lang.Integer.valueOf(this.zza[this.zzb + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        int iZza;
        if (!(obj instanceof java.lang.Integer) || (iZza = com.google.android.gms.internal.ads.zzgaq.zza(this.zza, ((java.lang.Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return iZza - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (i2 >= i) {
                if (iArr[i2] != iIntValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.zzb;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzc - this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int[] iArr = this.zza;
        int i2 = this.zzb + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return java.lang.Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        com.google.android.gms.internal.ads.zzfun.zzk(i, i2, this.zzc - this.zzb);
        if (i == i2) {
            return java.util.Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i3 = this.zzb;
        return new com.google.android.gms.internal.ads.zzgap(iArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.zzc - this.zzb) * 5);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i = this.zzb;
        while (true) {
            i++;
            if (i >= this.zzc) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.zza[i]);
        }
    }
}
