package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/fa;", "Lcom/ironsource/r8;", "", "url", "Ljava/io/InputStream;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final class fa implements com.json.r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.fa f2652a = new com.json.fa();

    private fa() {
    }

    @Override // com.json.r8
    public java.io.InputStream a(java.lang.String url) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.io.InputStream inputStreamOpenStream = new java.net.URL(url).openStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
