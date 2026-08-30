package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTAdActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity {
    private com.bytedance.sdk.openadsdk.activity.IL bg;

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVarBX = com.bytedance.sdk.openadsdk.core.JAA.bg().bX();
        com.bytedance.sdk.openadsdk.bg.bX.IL ilEqN = com.bytedance.sdk.openadsdk.core.JAA.bg().eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) null);
        if (tuvBg != null) {
            com.bytedance.sdk.openadsdk.activity.IL il = new com.bytedance.sdk.openadsdk.activity.IL(this, tuvBg);
            this.bg = il;
            il.bg(this, bundle, bgVarBX, ilEqN);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.bg(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.bg((android.app.Activity) this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.eqN(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.bX(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.IL(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.bg(z);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.zx(this);
        }
        com.bytedance.sdk.openadsdk.core.JAA.bg().bg((com.bytedance.sdk.openadsdk.bg.zx.bg) null);
        com.bytedance.sdk.openadsdk.core.JAA.bg().bg((com.bytedance.sdk.openadsdk.bg.bX.IL) null);
        com.bytedance.sdk.openadsdk.utils.PX.bg();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il != null) {
            il.bg(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.activity.IL il = this.bg;
        if (il == null) {
            super.onBackPressed();
        } else {
            il.eqN();
        }
    }
}
