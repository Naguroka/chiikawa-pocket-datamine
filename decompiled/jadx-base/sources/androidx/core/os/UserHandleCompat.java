package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class UserHandleCompat {
    private static java.lang.reflect.Method sGetUserIdMethod;
    private static java.lang.reflect.Constructor<android.os.UserHandle> sUserHandleConstructor;

    private UserHandleCompat() {
    }

    public static android.os.UserHandle getUserHandleForUid(int i) {
        return androidx.core.os.UserHandleCompat.Api24Impl.getUserHandleForUid(i);
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.UserHandle getUserHandleForUid(int i) {
            return android.os.UserHandle.getUserHandleForUid(i);
        }
    }

    private static java.lang.reflect.Method getGetUserIdMethod() throws java.lang.NoSuchMethodException {
        if (sGetUserIdMethod == null) {
            java.lang.reflect.Method declaredMethod = android.os.UserHandle.class.getDeclaredMethod("getUserId", java.lang.Integer.TYPE);
            sGetUserIdMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sGetUserIdMethod;
    }

    private static java.lang.reflect.Constructor<android.os.UserHandle> getUserHandleConstructor() throws java.lang.NoSuchMethodException {
        if (sUserHandleConstructor == null) {
            java.lang.reflect.Constructor<android.os.UserHandle> declaredConstructor = android.os.UserHandle.class.getDeclaredConstructor(java.lang.Integer.TYPE);
            sUserHandleConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return sUserHandleConstructor;
    }
}
