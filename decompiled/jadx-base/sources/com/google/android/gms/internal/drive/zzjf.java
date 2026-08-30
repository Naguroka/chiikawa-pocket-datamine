package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzjf implements com.google.android.gms.internal.drive.zzjj {
    zzjf() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Byte next() {
        return java.lang.Byte.valueOf(nextByte());
    }
}
