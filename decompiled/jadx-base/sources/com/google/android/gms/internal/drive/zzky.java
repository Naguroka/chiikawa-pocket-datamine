package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzky extends com.google.android.gms.internal.drive.zziw<java.lang.String> implements com.google.android.gms.internal.drive.zzkz, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzky zztk;
    private static final com.google.android.gms.internal.drive.zzkz zztl;
    private final java.util.List<java.lang.Object> zziu;

    public zzky() {
        this(10);
    }

    public zzky(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    private zzky(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zziu = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zziu.size();
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zzbq();
        if (collection instanceof com.google.android.gms.internal.drive.zzkz) {
            collection = ((com.google.android.gms.internal.drive.zzkz) collection).zzdr();
        }
        boolean zAddAll = this.zziu.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbq();
        this.zziu.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.lang.Object zzao(int i) {
        return this.zziu.get(i);
    }

    private static java.lang.String zzf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
            return ((com.google.android.gms.internal.drive.zzjc) obj).zzbt();
        }
        return com.google.android.gms.internal.drive.zzkm.zze((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.util.List<?> zzdr() {
        return java.util.Collections.unmodifiableList(this.zziu);
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final com.google.android.gms.internal.drive.zzkz zzds() {
        return zzbo() ? new com.google.android.gms.internal.drive.zzna(this) : this;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzbq();
        return zzf(this.zziu.set(i, (java.lang.String) obj));
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbq();
        java.lang.Object objRemove = this.zziu.remove(i);
        this.modCount++;
        return zzf(objRemove);
    }

    @Override // com.google.android.gms.internal.drive.zziw, com.google.android.gms.internal.drive.zzkp
    public final /* bridge */ /* synthetic */ boolean zzbo() {
        return super.zzbo();
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzbq();
        this.zziu.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp zzr(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zziu);
        return new com.google.android.gms.internal.drive.zzky((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.zziu.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
            com.google.android.gms.internal.drive.zzjc zzjcVar = (com.google.android.gms.internal.drive.zzjc) obj;
            java.lang.String strZzbt = zzjcVar.zzbt();
            if (zzjcVar.zzbu()) {
                this.zziu.set(i, strZzbt);
            }
            return strZzbt;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strZze = com.google.android.gms.internal.drive.zzkm.zze(bArr);
        if (com.google.android.gms.internal.drive.zzkm.zzd(bArr)) {
            this.zziu.set(i, strZze);
        }
        return strZze;
    }

    static {
        com.google.android.gms.internal.drive.zzky zzkyVar = new com.google.android.gms.internal.drive.zzky();
        zztk = zzkyVar;
        zzkyVar.zzbp();
        zztl = zzkyVar;
    }
}
