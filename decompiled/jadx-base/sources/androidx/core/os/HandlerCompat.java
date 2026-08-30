package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    public static android.os.Handler createAsync(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.os.HandlerCompat.Api28Impl.createAsync(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, true);
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.InstantiationException e2) {
            e = e2;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.NoSuchMethodException e3) {
            e = e3;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static android.os.Handler createAsync(android.os.Looper looper, android.os.Handler.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.os.HandlerCompat.Api28Impl.createAsync(looper, callback);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, callback, true);
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper, callback);
        } catch (java.lang.InstantiationException e2) {
            e = e2;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper, callback);
        } catch (java.lang.NoSuchMethodException e3) {
            e = e3;
            android.util.Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper, callback);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static boolean postDelayed(android.os.Handler handler, java.lang.Runnable runnable, java.lang.Object obj, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.os.HandlerCompat.Api28Impl.postDelayed(handler, runnable, obj, j);
        }
        android.os.Message messageObtain = android.os.Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }

    public static boolean hasCallbacks(android.os.Handler handler, java.lang.Runnable runnable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.os.HandlerCompat.Api29Impl.hasCallbacks(handler, runnable);
        }
        try {
            return ((java.lang.Boolean) android.os.Handler.class.getMethod("hasCallbacks", java.lang.Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            throw new java.lang.UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (java.lang.NoSuchMethodException e2) {
            e = e2;
            throw new java.lang.UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (java.lang.NullPointerException e3) {
            e = e3;
            throw new java.lang.UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    private HandlerCompat() {
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(android.os.Handler handler, java.lang.Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        public static android.os.Handler createAsync(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }

        public static android.os.Handler createAsync(android.os.Looper looper, android.os.Handler.Callback callback) {
            return android.os.Handler.createAsync(looper, callback);
        }

        public static boolean postDelayed(android.os.Handler handler, java.lang.Runnable runnable, java.lang.Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }
}
