package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh extends com.google.android.gms.drive.metadata.zza<java.lang.Integer> {
    public zzh(java.lang.String str, int i) {
        super(str, com.google.android.gms.common.util.GmsVersion.VERSION_JARLSBERG);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Integer zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return java.lang.Integer.valueOf(dataHolder.getInteger(getName(), i, i2));
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Integer num) {
        bundle.putInt(getName(), num.intValue());
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Integer zzb(android.os.Bundle bundle) {
        return java.lang.Integer.valueOf(bundle.getInt(getName()));
    }
}
