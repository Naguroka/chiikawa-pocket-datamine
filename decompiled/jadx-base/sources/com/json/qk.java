package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/qk;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "script", "", "Landroid/webkit/WebView;", "webView", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface qk {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/qk$a;", "Lcom/ironsource/qk;", "", "script", "", "b", "c", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Z", "isKitkatAndAbove", "", "androidSDKVersion", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.qk {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private android.webkit.WebView webView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean isKitkatAndAbove;

        public a() {
            this(0, 1, null);
        }

        public a(int i) {
            this.isKitkatAndAbove = i >= 19;
        }

        public /* synthetic */ a(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? android.os.Build.VERSION.SDK_INT : i);
        }

        private final void b(java.lang.String script) {
            android.webkit.WebView webView = this.webView;
            if (webView != null) {
                webView.evaluateJavascript(script, null);
            }
        }

        private final void c(java.lang.String script) {
            android.webkit.WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl("javascript:" + script);
            }
        }

        @Override // com.json.qk
        public void a(android.webkit.WebView webView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @Override // com.json.qk
        public void a(java.lang.String script) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.isKitkatAndAbove) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                this.isKitkatAndAbove = false;
                c(script);
            }
        }

        @Override // com.json.qk
        public boolean a() {
            return this.webView != null;
        }
    }

    void a(android.webkit.WebView webView);

    void a(java.lang.String script);

    boolean a();
}
