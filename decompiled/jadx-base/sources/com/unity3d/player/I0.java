package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class I0 implements java.lang.Runnable {
    I0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.unity3d.player.AbstractC1703c.a();
        } catch (java.lang.Exception e) {
            com.unity3d.player.AbstractC1749z.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
