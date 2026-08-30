package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.system.i f2069a;

    public g(com.five_corp.ad.internal.system.i iVar) {
        this.f2069a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.five_corp.ad.internal.system.i iVar = this.f2069a;
        iVar.getClass();
        try {
            iVar.a();
        } catch (java.lang.Exception e) {
            iVar.c.a(e);
        }
    }
}
