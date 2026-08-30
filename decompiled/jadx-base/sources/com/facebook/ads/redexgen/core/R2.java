package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R2 implements android.media.AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8T A00;

    public R2(com.facebook.ads.redexgen.core.C8T c8t) {
        this.A00 = c8t;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.QF(this, i));
    }
}
