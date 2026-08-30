package com.unity3d.ads.gl;

/* JADX INFO: compiled from: OffscreenSurface.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/gl/OffscreenSurface;", "Lcom/unity3d/ads/gl/EglSurfaceBase;", "eglCore", "Lcom/unity3d/ads/gl/EglCore;", "width", "", "height", "(Lcom/unity3d/ads/gl/EglCore;II)V", "release", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OffscreenSurface extends com.unity3d.ads.gl.EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(com.unity3d.ads.gl.EglCore eglCore, int i, int i2) {
        super(eglCore);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
