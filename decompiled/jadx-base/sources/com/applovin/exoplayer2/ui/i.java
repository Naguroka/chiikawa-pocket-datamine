package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public interface i {

    public interface a {
        void a(com.applovin.exoplayer2.ui.i iVar, long j);

        void a(com.applovin.exoplayer2.ui.i iVar, long j, boolean z);

        void b(com.applovin.exoplayer2.ui.i iVar, long j);
    }

    void a(com.applovin.exoplayer2.ui.i.a aVar);

    void a(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
