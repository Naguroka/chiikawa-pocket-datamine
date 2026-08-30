package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface AdComponentView {
    void addView(android.view.View view);

    void addView(android.view.View view, int i);

    void addView(android.view.View view, int i, int i2);

    void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams);

    void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z);

    void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams);
}
