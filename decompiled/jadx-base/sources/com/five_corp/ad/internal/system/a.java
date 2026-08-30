package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.system.b f2065a;

    public a(com.five_corp.ad.internal.system.b bVar) {
        this.f2065a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f2065a);
    }
}
