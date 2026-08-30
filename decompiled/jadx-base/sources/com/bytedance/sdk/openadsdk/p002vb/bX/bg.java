package com.bytedance.sdk.openadsdk.p002vb.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final android.content.SharedPreferences bg;

    public bg(android.content.Context context) {
        this.bg = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long bg() {
        return this.bg.getLong("last_upload_time", 0L);
    }

    public void bg(long j) {
        android.content.SharedPreferences.Editor editorEdit = this.bg.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
