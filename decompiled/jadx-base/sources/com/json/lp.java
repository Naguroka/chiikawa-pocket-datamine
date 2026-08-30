package com.json;

/* JADX INFO: loaded from: classes5.dex */
public enum lp {
    PER_DAY("d"),
    PER_HOUR(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f2896a;

    lp(java.lang.String str) {
        this.f2896a = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f2896a;
    }
}
