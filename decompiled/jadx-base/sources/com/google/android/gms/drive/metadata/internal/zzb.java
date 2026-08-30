package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zzb extends com.google.android.gms.drive.metadata.zza<java.lang.Boolean> {
    public zzb(java.lang.String str, int i) {
        super(str, i);
    }

    public zzb(java.lang.String str, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, int i) {
        super(str, collection, collection2, com.google.android.gms.common.util.GmsVersion.VERSION_ORLA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zza
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return java.lang.Boolean.valueOf(dataHolder.getBoolean(getName(), i, i2));
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Boolean bool) {
        bundle.putBoolean(getName(), bool.booleanValue());
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Boolean zzb(android.os.Bundle bundle) {
        return java.lang.Boolean.valueOf(bundle.getBoolean(getName()));
    }
}
