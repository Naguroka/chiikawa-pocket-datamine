package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzic extends com.google.android.gms.drive.metadata.internal.zzb implements com.google.android.gms.drive.metadata.SearchableMetadataField<java.lang.Boolean> {
    public zzic(java.lang.String str, int i) {
        super(str, com.google.android.gms.common.util.GmsVersion.VERSION_HALLOUMI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.internal.zzb
    /* JADX INFO: renamed from: zze */
    public final java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return java.lang.Boolean.valueOf(dataHolder.getInteger(getName(), i, i2) != 0);
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzc(dataHolder, i, i2);
    }
}
