package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IW implements android.hardware.display.DisplayManager.DisplayListener {
    public final android.hardware.display.DisplayManager A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.IY A01;

    public IW(com.facebook.ads.redexgen.core.IY iy, android.hardware.display.DisplayManager displayManager) {
        this.A01 = iy;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
