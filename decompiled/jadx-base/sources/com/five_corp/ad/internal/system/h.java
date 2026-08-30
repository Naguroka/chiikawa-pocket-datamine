package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.system.i f2070a;

    public h(com.five_corp.ad.internal.system.i iVar) {
        this.f2070a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.five_corp.ad.internal.system.i iVar = this.f2070a;
        iVar.getClass();
        try {
            android.net.NetworkInfo activeNetworkInfo = iVar.b.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            iVar.a();
        } catch (java.lang.Exception e) {
            iVar.c.a(e);
        }
    }
}
