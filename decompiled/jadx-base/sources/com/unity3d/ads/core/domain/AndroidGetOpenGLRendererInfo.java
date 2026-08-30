package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetOpenGLRendererInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetOpenGLRendererInfo;", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/google/protobuf/ByteString;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetOpenGLRendererInfo implements com.unity3d.ads.core.domain.GetOpenGLRendererInfo {
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public com.google.protobuf.ByteString invoke() {
        if (this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            com.unity3d.ads.gl.EglCore eglCore = new com.unity3d.ads.gl.EglCore(null, 2);
            com.unity3d.ads.gl.OffscreenSurface offscreenSurface = new com.unity3d.ads.gl.OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            java.lang.String renderer = android.opengl.GLES20.glGetString(7937);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(renderer, "renderer");
            byte[] bytes = renderer.getBytes(kotlin.text.Charsets.ISO_8859_1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            com.google.protobuf.ByteString byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(bytes);
            offscreenSurface.release();
            eglCore.release();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "{\n            // We need…dererByteString\n        }");
            return byteStringCopyFrom;
        }
        com.google.protobuf.ByteString byteStringEmpty = com.google.protobuf.ByteString.empty();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringEmpty, "{\n            ByteString.empty()\n        }");
        return byteStringEmpty;
    }
}
