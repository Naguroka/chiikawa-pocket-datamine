package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends android.widget.Button {
    public iR(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        setId(com.bytedance.sdk.openadsdk.utils.Ta.jA);
        android.content.Context context = getContext();
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_browser_download_selector"));
        setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
