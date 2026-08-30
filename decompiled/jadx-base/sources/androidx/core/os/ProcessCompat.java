package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCompat {
    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i) {
        return androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(i);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int i) {
            return android.os.Process.isApplicationUid(i);
        }
    }

    static class Api17Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = new java.lang.Object();

        private Api17Impl() {
        }

        static boolean isApplicationUid(int i) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserHandleIsAppMethod = android.os.UserHandle.class.getDeclaredMethod("isApp", java.lang.Integer.TYPE);
                    }
                }
                java.lang.reflect.Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    java.lang.Boolean bool = (java.lang.Boolean) method.invoke(null, java.lang.Integer.valueOf(i));
                    if (bool == null) {
                        throw new java.lang.NullPointerException();
                    }
                    return bool.booleanValue();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    static class Api16Impl {
        private static java.lang.reflect.Method sMethodUserIdIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = new java.lang.Object();

        private Api16Impl() {
        }

        static boolean isApplicationUid(int i) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserIdIsAppMethod = java.lang.Class.forName("android.os.UserId").getDeclaredMethod("isApp", java.lang.Integer.TYPE);
                    }
                }
                java.lang.reflect.Method method = sMethodUserIdIsAppMethod;
                if (method != null) {
                    java.lang.Boolean bool = (java.lang.Boolean) method.invoke(null, java.lang.Integer.valueOf(i));
                    if (bool == null) {
                        throw new java.lang.NullPointerException();
                    }
                    return bool.booleanValue();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}
