package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.openadsdk.core.Ja {
    private final android.content.Context IL;
    private com.bytedance.sdk.openadsdk.bX.eqN bX;
    public com.bytedance.sdk.openadsdk.bX.PX bg;
    private boolean eqN;
    private com.bytedance.sdk.openadsdk.core.Ja.bg zx;

    public bX(android.content.Context context, java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2, java.lang.String str3) {
        if (!(context instanceof android.app.Activity)) {
            com.bytedance.sdk.component.utils.PX.IL("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.IL = context;
        bg(str, list, str2, str3);
    }

    private void bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2, java.lang.String str3) {
        this.bX = new com.bytedance.sdk.openadsdk.bX.eqN(this.IL, str, list, str3);
        com.bytedance.sdk.openadsdk.bX.PX px = new com.bytedance.sdk.openadsdk.bX.PX(this.IL, this.bX.getDislikeManager());
        this.bg = px;
        px.bg(str, str2);
        this.bg.bg(str3);
        this.bg.bg(new com.bytedance.sdk.openadsdk.bX.PX.bg() { // from class: com.bytedance.sdk.openadsdk.bX.bX.1
            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bg() {
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void IL() {
                com.bytedance.sdk.openadsdk.bX.bX.this.bg();
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bX() {
                com.bytedance.sdk.openadsdk.bX.bX.this.bg();
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bg(int i, com.bytedance.sdk.openadsdk.FilterWord filterWord, java.lang.String str4) {
                com.bytedance.sdk.openadsdk.bX.bX.this.bX.onSuggestionSubmit(str4);
                com.bytedance.sdk.openadsdk.bX.bX.this.bg();
            }
        });
        this.bX.bg(new com.bytedance.sdk.openadsdk.bX.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.bX.bX.2
            @Override // com.bytedance.sdk.openadsdk.bX.eqN.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.bX.bX.this.bg(true);
                if (com.bytedance.sdk.openadsdk.bX.bX.this.bX != null && com.bytedance.sdk.openadsdk.bX.bX.this.bX.isShowing()) {
                    com.bytedance.sdk.openadsdk.bX.bX.this.bX.hide();
                }
                com.bytedance.sdk.openadsdk.bX.bX.this.eqN();
            }

            @Override // com.bytedance.sdk.openadsdk.bX.eqN.bg
            public void bg(int i, com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && com.bytedance.sdk.openadsdk.bX.bX.this.zx != null) {
                        com.bytedance.sdk.openadsdk.bX.bX.this.zx.bg(i, filterWord.getName());
                    }
                    com.bytedance.sdk.component.utils.PX.bg("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + filterWord.getName());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bX.eqN.bg
            public void IL() {
                com.bytedance.sdk.component.utils.PX.bg("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (com.bytedance.sdk.openadsdk.bX.bX.this.zx != null) {
                        com.bytedance.sdk.openadsdk.bX.bX.this.zx.bg();
                    }
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ja
    public void bg() {
        android.content.Context context = this.IL;
        if (!((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) || this.bX.isShowing()) {
            return;
        }
        this.bX.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ja
    public void bg(com.bytedance.sdk.openadsdk.core.Ja.bg bgVar) {
        this.zx = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ja
    public void IL() {
        com.bytedance.sdk.openadsdk.bX.eqN eqn = this.bX;
        if (eqn != null) {
            eqn.destroy();
        }
    }

    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.bX.eqN eqn = this.bX;
        if (eqn != null) {
            eqn.bg(str);
        }
    }

    public boolean bX() {
        return this.eqN;
    }

    public void bg(boolean z) {
        this.eqN = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        android.content.Context context = this.IL;
        if ((context instanceof android.app.Activity) && (!((android.app.Activity) context).isFinishing()) && !this.bg.isShowing()) {
            this.bg.show();
        }
    }
}
