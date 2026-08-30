package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTDelegateActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity {
    private static final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.bX.eqN.bg> bX = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private com.bytedance.sdk.openadsdk.core.Ja IL;
    private android.content.Intent bg;

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        if (tuv == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.bytedance.sdk.openadsdk.core.VzQ.bg(), (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("ext_info", tuv.Ny());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.bg.bg(tuv.kU()));
        intent.putExtra("creative_info", tuv.ZTq().toString());
        intent.putExtra("closed_listener_key", str);
        if (bgVar != null) {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.core.WR.IL().bg(str, bgVar);
            } else {
                bX.put(str, bgVar);
            }
        }
        com.bytedance.sdk.component.utils.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), intent, null);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        bg(tuv, str, null);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        IL();
        this.bg = getIntent();
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(this);
        }
    }

    private void IL() {
        android.view.Window window = getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(this);
        }
        setIntent(intent);
        this.bg = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.sdk.openadsdk.core.Ja ja = this.IL;
        if ((ja == null || ((com.bytedance.sdk.openadsdk.bX.bX) ja).bg == null || !((com.bytedance.sdk.openadsdk.bX.bX) this.IL).bg.isShowing()) && this.bg != null) {
            bX();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.Ja ja = this.IL;
        if (ja != null) {
            ja.IL();
        }
    }

    private void bX() {
        int intExtra = this.bg.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra == 6) {
                bg(this.bg.getStringExtra("ext_info"), this.bg.getStringExtra("filter_words"), this.bg.getStringExtra("closed_listener_key"), this.bg.getStringExtra("creative_info"));
                return;
            }
            finish();
        }
    }

    private void bg(java.lang.String str, java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        if (str2 != null && str != null && this.IL == null) {
            com.bytedance.sdk.openadsdk.bX.bX bXVar = new com.bytedance.sdk.openadsdk.bX.bX(this, str, com.bytedance.sdk.openadsdk.tool.bg.bg(str2), str4, "other");
            this.IL = bXVar;
            bXVar.bg(str3);
            this.IL.bg(new com.bytedance.sdk.openadsdk.core.Ja.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.Ja.bg
                public void bg(int i, java.lang.String str5) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVarZx;
                    if (com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bX != null && com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bX.size() > 0 && !android.text.TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar = (com.bytedance.sdk.openadsdk.core.bX.eqN.bg) com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bX.get(str3);
                        if (bgVar != null) {
                            bgVar.bg();
                        }
                    } else if (!android.text.TextUtils.isEmpty(str3) && (bgVarZx = com.bytedance.sdk.openadsdk.core.WR.IL().zx(str3)) != null) {
                        bgVarZx.bg();
                        com.bytedance.sdk.openadsdk.core.WR.IL().ldr(str3);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.bg(str3);
                    com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.Ja.bg
                public void bg() {
                    if (!((com.bytedance.sdk.openadsdk.bX.bX) com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.IL).bX()) {
                        com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.bg(str3);
                        com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.bX.bX) com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.this.IL).bg(false);
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.Ja ja = this.IL;
        if (ja != null) {
            ja.bg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str) {
        java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.bX.eqN.bg> map = bX;
        if (map == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.PX.eqN()) {
            map.size();
        }
    }
}
