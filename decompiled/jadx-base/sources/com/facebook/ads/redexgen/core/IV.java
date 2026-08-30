package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IV implements android.media.MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C3F A00;

    public IV(com.facebook.ads.redexgen.core.C3F c3f, android.media.MediaCodec mediaCodec) {
        this.A00 = c3f;
        mediaCodec.setOnFrameRenderedListener(this, new android.os.Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1S();
    }
}
