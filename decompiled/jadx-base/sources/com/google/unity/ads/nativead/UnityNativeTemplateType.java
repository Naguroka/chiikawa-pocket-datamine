package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public enum UnityNativeTemplateType {
    SMALL(com.google.unity.ads.R.layout.small_template_view_layout),
    MEDIUM(com.google.unity.ads.R.layout.medium_template_view_layout);

    private final int resourceId;

    UnityNativeTemplateType(int resourceId) {
        this.resourceId = resourceId;
    }

    public int resourceId() {
        return this.resourceId;
    }

    public static com.google.unity.ads.nativead.UnityNativeTemplateType fromIntValue(int value) {
        if (value >= 0 && value < values().length) {
            return values()[value];
        }
        android.util.Log.w(com.google.unity.ads.PluginUtils.LOGTAG, "Invalid template type index: " + value);
        return MEDIUM;
    }
}
