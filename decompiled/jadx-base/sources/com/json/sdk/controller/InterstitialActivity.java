package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class InterstitialActivity extends com.json.sdk.controller.ControllerActivity {
    private static final java.lang.String r = "InterstitialActivity";

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.json.sdk.utils.Logger.i(r, "onCreate");
    }

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.json.sdk.utils.Logger.i(r, com.ironsource.y8.h.t0);
    }

    @Override // com.json.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.json.sdk.utils.Logger.i(r, com.ironsource.y8.h.u0);
    }
}
