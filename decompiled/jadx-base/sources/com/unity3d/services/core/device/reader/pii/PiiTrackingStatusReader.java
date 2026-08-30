package com.unity3d.services.core.device.reader.pii;

/* JADX INFO: loaded from: classes6.dex */
public class PiiTrackingStatusReader {
    private final com.unity3d.services.core.misc.IJsonStorageReader _jsonStorageReader;
    private final com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader _nonBehavioralFlagReader;

    public PiiTrackingStatusReader(com.unity3d.services.core.misc.IJsonStorageReader iJsonStorageReader) {
        this._jsonStorageReader = iJsonStorageReader;
        this._nonBehavioralFlagReader = new com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader(iJsonStorageReader);
    }

    public com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getPrivacyMode() {
        if (getUserPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NULL && getSpmPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NULL) {
            return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NULL;
        }
        if (getUserPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.APP || getSpmPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.APP) {
            return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.APP;
        }
        if (getUserPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED || getSpmPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED) {
            return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED;
        }
        if (getUserPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE || getSpmPrivacyMode() == com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE) {
            return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE;
        }
        return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.UNDEFINED;
    }

    public boolean getUserNonBehavioralFlag() {
        return this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.TRUE;
    }

    private com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getUserPrivacyMode() {
        return getPrivacyMode(com.unity3d.services.core.device.reader.JsonStorageKeyNames.PRIVACY_MODE_KEY);
    }

    private com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getSpmPrivacyMode() {
        return getPrivacyMode(com.unity3d.services.core.device.reader.JsonStorageKeyNames.PRIVACY_SPM_KEY);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getPrivacyMode(java.lang.String str) {
        java.lang.String str2;
        com.unity3d.services.core.misc.IJsonStorageReader iJsonStorageReader = this._jsonStorageReader;
        if (iJsonStorageReader != null) {
            java.lang.Object obj = iJsonStorageReader.get(str);
            if (obj instanceof java.lang.String) {
                str2 = (java.lang.String) obj;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        return com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.getPiiPrivacyMode(str2);
    }
}
