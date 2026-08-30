package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class zzl<T extends android.os.Parcelable> extends com.google.android.gms.drive.metadata.zzb<T> {
    public zzl(java.lang.String str, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zza
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public java.util.Collection<T> zzb(android.os.Bundle bundle) {
        return bundle.getParcelableArrayList(getName());
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) obj;
        bundle.putParcelableArrayList(getName(), collection instanceof java.util.ArrayList ? (java.util.ArrayList) collection : new java.util.ArrayList<>(collection));
    }
}
