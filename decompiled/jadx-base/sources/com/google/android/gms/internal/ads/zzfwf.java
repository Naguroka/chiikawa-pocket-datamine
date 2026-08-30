package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwf extends com.google.android.gms.internal.ads.zzfwd implements java.util.List {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwf(com.google.android.gms.internal.ads.zzfwg zzfwgVar, java.lang.Object obj, @javax.annotation.CheckForNull java.util.List list, com.google.android.gms.internal.ads.zzfwd zzfwdVar) {
        super(zzfwgVar, obj, list, zzfwdVar);
        this.zzf = zzfwgVar;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((java.util.List) this.zzb).add(i, obj);
        this.zzf.zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((java.util.List) this.zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zzf.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        zzb();
        return ((java.util.List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        zzb();
        return new com.google.android.gms.internal.ads.zzfwe(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        zzb();
        java.lang.Object objRemove = ((java.util.List) this.zzb).remove(i);
        this.zzf.zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        zzb();
        java.util.List listSubList = ((java.util.List) this.zzb).subList(i, i2);
        com.google.android.gms.internal.ads.zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar == null) {
            zzfwdVar = this;
        }
        return this.zzf.zzh(this.zza, listSubList, zzfwdVar);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        zzb();
        return new com.google.android.gms.internal.ads.zzfwe(this, i);
    }
}
