package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {
    private static final int INIT_FAILED = 2;
    private static final int INIT_SUCCESS = 1;
    private static final int NOT_INITIALIAZED = 0;
    private static java.lang.reflect.Field sHField;
    private static java.lang.reflect.Field sNextServedViewField;
    private static int sReflectedFieldsInitialized;
    private static java.lang.reflect.Field sServedViewField;
    private android.app.Activity mActivity;

    ImmLeaksCleaner(android.app.Activity activity) {
        this.mActivity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        if (event != androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (sReflectedFieldsInitialized == 0) {
            initializeReflectiveFields();
        }
        if (sReflectedFieldsInitialized == 1) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.mActivity.getSystemService("input_method");
            try {
                java.lang.Object obj = sHField.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            android.view.View view = (android.view.View) sServedViewField.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                sNextServedViewField.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (java.lang.IllegalAccessException unused) {
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    } catch (java.lang.ClassCastException unused2) {
                    } catch (java.lang.IllegalAccessException unused3) {
                    }
                }
            } catch (java.lang.IllegalAccessException unused4) {
            }
        }
    }

    private static void initializeReflectiveFields() {
        try {
            sReflectedFieldsInitialized = 2;
            java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mServedView");
            sServedViewField = declaredField;
            declaredField.setAccessible(true);
            java.lang.reflect.Field declaredField2 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mNextServedView");
            sNextServedViewField = declaredField2;
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mH");
            sHField = declaredField3;
            declaredField3.setAccessible(true);
            sReflectedFieldsInitialized = 1;
        } catch (java.lang.NoSuchFieldException unused) {
        }
    }
}
