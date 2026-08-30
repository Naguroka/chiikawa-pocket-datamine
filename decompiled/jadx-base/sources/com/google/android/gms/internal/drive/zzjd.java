package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjd extends com.google.android.gms.internal.drive.zzjf {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzjc zznu;

    zzjd(com.google.android.gms.internal.drive.zzjc zzjcVar) {
        this.zznu = zzjcVar;
        this.limit = zzjcVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.drive.zzjj
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new java.util.NoSuchElementException();
        }
        this.position = i + 1;
        return this.zznu.zzt(i);
    }
}
