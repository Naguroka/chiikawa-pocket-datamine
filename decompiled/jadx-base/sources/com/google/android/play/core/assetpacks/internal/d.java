package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends com.google.android.play.core.assetpacks.internal.a implements com.google.android.play.core.assetpacks.internal.f {
    d(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void c(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(hVar);
        b(14, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void d(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        parcelA.writeStrongBinder(hVar);
        b(11, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void e(java.lang.String str, android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(hVar);
        b(5, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void f(java.lang.String str, android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(hVar);
        b(10, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void g(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        parcelA.writeStrongBinder(hVar);
        b(6, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void h(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        parcelA.writeStrongBinder(hVar);
        b(7, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void i(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        parcelA.writeStrongBinder(hVar);
        b(9, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void j(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        parcelA.writeStrongBinder(hVar);
        b(13, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void k(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(hVar);
        b(12, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void l(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.h hVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(hVar);
        b(2, parcelA);
    }
}
