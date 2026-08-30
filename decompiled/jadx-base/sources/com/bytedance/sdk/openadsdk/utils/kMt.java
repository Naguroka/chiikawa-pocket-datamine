package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class kMt {
    public static boolean bg = bg();

    private static boolean bg() {
        android.content.SharedPreferences sharedPreferences;
        try {
            return com.bytedance.sdk.openadsdk.core.VzQ.bg() == null || (sharedPreferences = com.bytedance.sdk.openadsdk.core.VzQ.bg().getSharedPreferences("pag_sp_prop_switch", 0)) == null || sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
        return true;
    }

    public static void bg(int i) {
        try {
            android.content.SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.VzQ.bg().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i);
            editorEdit.apply();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
    }
}
