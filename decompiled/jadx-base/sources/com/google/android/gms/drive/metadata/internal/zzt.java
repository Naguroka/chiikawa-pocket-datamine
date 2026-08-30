package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zzt extends com.google.android.gms.drive.metadata.zza<java.lang.String> {
    public zzt(java.lang.String str, int i) {
        super(str, i);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.String zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return dataHolder.getString(getName(), i, i2);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.String str) {
        bundle.putString(getName(), str);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.String zzb(android.os.Bundle bundle) {
        return bundle.getString(getName());
    }
}
