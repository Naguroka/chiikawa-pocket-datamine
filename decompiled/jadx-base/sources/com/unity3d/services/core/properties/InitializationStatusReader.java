package com.unity3d.services.core.properties;

/* JADX INFO: loaded from: classes6.dex */
public class InitializationStatusReader {
    private static final java.lang.String STATE_INITIALIZED_FAILED = "initialized_failed";
    private static final java.lang.String STATE_INITIALIZED_SUCCESSFULLY = "initialized_successfully";
    private static final java.lang.String STATE_INITIALIZING = "initializing";
    private static final java.lang.String STATE_NOT_INITIALIZED = "not_initialized";

    /* JADX INFO: renamed from: com.unity3d.services.core.properties.InitializationStatusReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        static {
            int[] iArr = new int[com.unity3d.services.core.properties.SdkProperties.InitializationState.values().length];
            $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = iArr;
            try {
                iArr[com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public java.lang.String getInitializationStateString(com.unity3d.services.core.properties.SdkProperties.InitializationState initializationState) {
        int i = com.unity3d.services.core.properties.InitializationStatusReader.AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[initializationState.ordinal()];
        if (i == 1) {
            return "not_initialized";
        }
        if (i == 2) {
            return STATE_INITIALIZING;
        }
        if (i == 3) {
            return STATE_INITIALIZED_SUCCESSFULLY;
        }
        if (i != 4) {
            return null;
        }
        return STATE_INITIALIZED_FAILED;
    }
}
