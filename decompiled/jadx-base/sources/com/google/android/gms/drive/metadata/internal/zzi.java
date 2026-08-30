package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zzi extends com.google.android.gms.drive.metadata.zza<java.lang.Long> {
    public zzi(java.lang.String str, int i) {
        super(str, com.google.android.gms.common.util.GmsVersion.VERSION_JARLSBERG);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Long zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return java.lang.Long.valueOf(dataHolder.getLong(getName(), i, i2));
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Long l) {
        bundle.putLong(getName(), l.longValue());
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Long zzb(android.os.Bundle bundle) {
        return java.lang.Long.valueOf(bundle.getLong(getName()));
    }
}
