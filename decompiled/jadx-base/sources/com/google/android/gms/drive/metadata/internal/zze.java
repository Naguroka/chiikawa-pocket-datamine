package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zze extends com.google.android.gms.drive.metadata.zzd<java.util.Date> {
    public zze(java.lang.String str, int i) {
        super(str, i);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return new java.util.Date(dataHolder.getLong(getName(), i, i2));
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Object obj) {
        bundle.putLong(getName(), ((java.util.Date) obj).getTime());
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return new java.util.Date(bundle.getLong(getName()));
    }
}
