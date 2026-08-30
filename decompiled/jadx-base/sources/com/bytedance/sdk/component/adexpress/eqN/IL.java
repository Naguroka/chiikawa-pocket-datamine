package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static boolean bg(android.content.Context context) {
        if (context == null) {
            return false;
        }
        return (android.text.TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
