package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ContextUtils {
    public static android.app.Activity getActivity(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
