package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(java.lang.reflect.InvocationHandler invocationHandler);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler invocationHandler);

    void setWebMessageCallback(java.lang.reflect.InvocationHandler invocationHandler, android.os.Handler handler);
}
