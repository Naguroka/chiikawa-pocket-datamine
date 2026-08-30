package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTBaseActivity extends android.app.Activity {
    protected boolean iR = false;

    @Override // android.app.Activity
    protected void onResume() {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (java.lang.IllegalArgumentException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, java.lang.Boolean.TRUE);
                    return;
                } catch (java.lang.Exception e2) {
                    com.bytedance.sdk.component.utils.PX.bg("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            try {
                super.onPause();
                return;
            } catch (java.lang.IllegalArgumentException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTBaseActivity", "super.onPause(); run fail", e);
                try {
                    java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, java.lang.Boolean.TRUE);
                    return;
                } catch (java.lang.Exception e2) {
                    com.bytedance.sdk.component.utils.PX.bg("TTBaseActivity", "onPause() set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onPause();
    }

    public void IL(boolean z) {
        this.iR = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (java.lang.Exception unused) {
        }
    }
}
