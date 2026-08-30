package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class VisualStateCallbackAdapter implements org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface {
    private final androidx.webkit.WebViewCompat.VisualStateCallback mVisualStateCallback;

    public VisualStateCallbackAdapter(androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mVisualStateCallback = visualStateCallback;
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j) {
        this.mVisualStateCallback.onComplete(j);
    }
}
