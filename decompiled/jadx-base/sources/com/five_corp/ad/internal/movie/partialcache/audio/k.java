package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f1998a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.audio.m b;

    public k(com.five_corp.ad.internal.movie.partialcache.audio.m mVar, byte[] bArr) {
        this.b = mVar;
        this.f1998a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.media.AudioTrack audioTrack;
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar;
        com.five_corp.ad.internal.s sVar;
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar2 = this.b;
        if (mVar2.f != 2 || (audioTrack = mVar2.e) == null) {
            return;
        }
        byte[] bArr = this.f1998a;
        int iWrite = audioTrack.write(bArr, 0, bArr.length);
        if (iWrite == -6) {
            mVar = this.b;
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.i5, null, null, null);
        } else if (iWrite == -3) {
            mVar = this.b;
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.h5, null, null, null);
        } else if (iWrite == -2) {
            mVar = this.b;
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.j5, null, null, null);
        } else {
            if (iWrite != -1) {
                return;
            }
            mVar = this.b;
            sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.k5, null, null, null);
        }
        com.five_corp.ad.internal.movie.partialcache.audio.m.a(mVar, sVar);
    }
}
