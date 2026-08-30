package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0582Au {
    public long A00;
    public long A01;
    public long A02;
    public final android.media.AudioTimestamp A03 = new android.media.AudioTimestamp();
    public final android.media.AudioTrack A04;

    public C0582Au(android.media.AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A03.nanoTime / 1000;
    }

    public final boolean A02() {
        boolean timestamp = this.A04.getTimestamp(this.A03);
        if (timestamp) {
            long j = this.A03.framePosition;
            long rawPositionFrames = this.A01;
            if (rawPositionFrames > j) {
                this.A02++;
            }
            this.A01 = j;
            long rawPositionFrames2 = this.A02;
            this.A00 = (rawPositionFrames2 << 32) + j;
        }
        return timestamp;
    }
}
