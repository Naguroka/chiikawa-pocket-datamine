package com.bytedance.sdk.component.WR;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static boolean bg(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (java.util.regex.Pattern.matches(it.next(), str)) {
                        return true;
                    }
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
            }
        }
        return false;
    }
}
