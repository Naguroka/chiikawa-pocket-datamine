package bitter.jnibridge;

/* JADX INFO: loaded from: classes3.dex */
public class JNIBridge {
    static void disableInterfaceProxy(java.lang.Object obj) {
        if (obj != null) {
            bitter.jnibridge.a aVar = (bitter.jnibridge.a) java.lang.reflect.Proxy.getInvocationHandler(obj);
            synchronized (aVar.f7a) {
                aVar.b = 0L;
            }
        }
    }

    static native java.lang.Object invoke(long j, java.lang.Class cls, java.lang.reflect.Method method, java.lang.Object[] objArr);

    static java.lang.Object newInterfaceProxy(long j, java.lang.Class[] clsArr) {
        return java.lang.reflect.Proxy.newProxyInstance(bitter.jnibridge.JNIBridge.class.getClassLoader(), clsArr, new bitter.jnibridge.a(j));
    }
}
