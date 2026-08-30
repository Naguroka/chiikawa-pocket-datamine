package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ys;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "()I", "code", "<init>", "(Ljava/lang/String;II)V", "c", "d", "e", "f", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum ys {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    ys(int i) {
        this.code = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
