package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public final class UnityAdInspector {
    private UnityAdInspector() {
    }

    public static void openAdInspector(final android.app.Activity activity, final com.google.unity.ads.UnityAdInspectorListener adInspectorListener) {
        activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAdInspector.1
            @Override // java.lang.Runnable
            public void run() {
                android.app.Activity activity2 = activity;
                final com.google.unity.ads.UnityAdInspectorListener unityAdInspectorListener = adInspectorListener;
                com.google.android.gms.ads.MobileAds.openAdInspector(activity2, new com.google.android.gms.ads.OnAdInspectorClosedListener(this) { // from class: com.google.unity.ads.UnityAdInspector.1.1
                    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
                    public void onAdInspectorClosed(com.google.android.gms.ads.AdInspectorError adInspectorError) {
                        com.google.unity.ads.UnityAdInspectorListener unityAdInspectorListener2 = unityAdInspectorListener;
                        if (unityAdInspectorListener2 != null) {
                            unityAdInspectorListener2.onAdInspectorClosed(adInspectorError);
                        }
                    }
                });
            }
        });
    }
}
