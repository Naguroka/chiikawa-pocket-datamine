package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TracingController {
    public abstract boolean isTracing();

    public abstract void start(androidx.webkit.TracingConfig tracingConfig);

    public abstract boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor);

    public static androidx.webkit.TracingController getInstance() {
        return androidx.webkit.TracingController.LAZY_HOLDER.INSTANCE;
    }

    private static class LAZY_HOLDER {
        static final androidx.webkit.TracingController INSTANCE = new androidx.webkit.internal.TracingControllerImpl();

        private LAZY_HOLDER() {
        }
    }
}
