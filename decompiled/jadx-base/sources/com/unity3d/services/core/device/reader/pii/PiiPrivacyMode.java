package com.unity3d.services.core.device.reader.pii;

/* JADX INFO: loaded from: classes6.dex */
public enum PiiPrivacyMode {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    public static com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getPiiPrivacyMode(java.lang.String str) {
        if (str == null) {
            return NULL;
        }
        com.unity3d.services.core.device.reader.pii.PiiPrivacyMode piiPrivacyMode = UNDEFINED;
        try {
            return valueOf(str.toUpperCase(java.util.Locale.ROOT));
        } catch (java.lang.IllegalArgumentException unused) {
            return piiPrivacyMode;
        }
    }
}
