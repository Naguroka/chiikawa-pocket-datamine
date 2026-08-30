package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f1774a;

    public a(android.view.Window window) {
        this.f1774a = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f1774a.getDecorView().setSystemUiVisibility(com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.BLE_SCANNING_UNSUPPORTED);
    }
}
