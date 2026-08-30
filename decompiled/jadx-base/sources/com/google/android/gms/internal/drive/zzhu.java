package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzhu extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.common.data.BitmapTeleporter> {
    zzhu(java.lang.String str, java.util.Collection collection, java.util.Collection collection2, int i) {
        super(str, collection, collection2, com.google.android.gms.common.util.GmsVersion.VERSION_KENAFA);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        throw new java.lang.IllegalStateException("Thumbnail field is write only");
    }
}
