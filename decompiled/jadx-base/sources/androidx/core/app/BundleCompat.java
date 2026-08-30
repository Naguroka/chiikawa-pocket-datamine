package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class BundleCompat {

    static class BeforeApi18Impl {
        private static final java.lang.String TAG = "BundleCompatBaseImpl";
        private static java.lang.reflect.Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static java.lang.reflect.Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        private BeforeApi18Impl() {
        }

        public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
            if (!sGetIBinderMethodFetched) {
                try {
                    java.lang.reflect.Method method = android.os.Bundle.class.getMethod("getIBinder", java.lang.String.class);
                    sGetIBinderMethod = method;
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve getIBinder method", e);
                }
                sGetIBinderMethodFetched = true;
            }
            java.lang.reflect.Method method2 = sGetIBinderMethod;
            if (method2 != null) {
                try {
                    return (android.os.IBinder) method2.invoke(bundle, str);
                } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.i(TAG, "Failed to invoke getIBinder via reflection", e2);
                    sGetIBinderMethod = null;
                }
            }
            return null;
        }

        public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
            if (!sPutIBinderMethodFetched) {
                try {
                    java.lang.reflect.Method method = android.os.Bundle.class.getMethod("putIBinder", java.lang.String.class, android.os.IBinder.class);
                    sPutIBinderMethod = method;
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve putIBinder method", e);
                }
                sPutIBinderMethodFetched = true;
            }
            java.lang.reflect.Method method2 = sPutIBinderMethod;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.i(TAG, "Failed to invoke putIBinder via reflection", e2);
                    sPutIBinderMethod = null;
                }
            }
        }
    }

    private BundleCompat() {
    }

    public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
        return androidx.core.app.BundleCompat.Api18Impl.getBinder(bundle, str);
    }

    public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        androidx.core.app.BundleCompat.Api18Impl.putBinder(bundle, str, iBinder);
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
            return bundle.getBinder(str);
        }

        static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }
}
