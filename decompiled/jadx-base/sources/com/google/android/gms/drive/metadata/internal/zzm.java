package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzm<T extends com.google.android.gms.common.internal.ReflectedParcelable> extends com.google.android.gms.drive.metadata.zza<T> {
    public zzm(java.lang.String str, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Object obj) {
        bundle.putParcelable(getName(), (com.google.android.gms.common.internal.ReflectedParcelable) obj);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return (com.google.android.gms.common.internal.ReflectedParcelable) bundle.getParcelable(getName());
    }
}
