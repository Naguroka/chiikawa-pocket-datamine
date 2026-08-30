package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzht extends com.google.android.gms.drive.metadata.internal.zzb {
    zzht(java.lang.String str, java.util.Collection collection, java.util.Collection collection2, int i) {
        super(str, collection, collection2, com.google.android.gms.common.util.GmsVersion.VERSION_ORLA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.internal.zzb
    /* JADX INFO: renamed from: zze */
    public final java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return java.lang.Boolean.valueOf(dataHolder.getInteger("trashed", i, i2) == 2);
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzc(dataHolder, i, i2);
    }
}
