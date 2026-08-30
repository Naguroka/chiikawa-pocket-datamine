package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebMessagePortCompat {

    public static abstract class WebMessageCallbackCompat {
        public void onMessage(androidx.webkit.WebMessagePortCompat webMessagePortCompat, androidx.webkit.WebMessageCompat webMessageCompat) {
        }
    }

    public abstract void close();

    public abstract android.webkit.WebMessagePort getFrameworkPort();

    public abstract java.lang.reflect.InvocationHandler getInvocationHandler();

    public abstract void postMessage(androidx.webkit.WebMessageCompat webMessageCompat);

    public abstract void setWebMessageCallback(android.os.Handler handler, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat);

    public abstract void setWebMessageCallback(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat);
}
