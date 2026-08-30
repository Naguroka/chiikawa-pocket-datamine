package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class VB extends com.bytedance.sdk.openadsdk.core.widget.Kg {
    private long IL;
    private long bg;

    @Override // com.bytedance.sdk.openadsdk.core.widget.Kg
    protected boolean bg() {
        return false;
    }

    public VB(android.content.Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public void bX() {
        setVisibility(8);
        if (this.bg != 0) {
            this.IL = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        if (isShown()) {
            return;
        }
        IL();
        setVisibility(0);
        this.bg = android.os.SystemClock.elapsedRealtime();
        bg(tuv, i);
    }

    public boolean eqN() {
        return this.bg > 0 && this.IL > 0;
    }

    public long getDisplayDuration() {
        if (this.bg == 0) {
            return 0L;
        }
        if (this.IL == 0) {
            this.IL = android.os.SystemClock.elapsedRealtime();
        }
        return this.IL - this.bg;
    }
}
