package com.unity3d.services.analytics;

/* JADX INFO: loaded from: classes6.dex */
public enum AcquisitionType {
    SOFT,
    PREMIUM;

    /* JADX INFO: renamed from: com.unity3d.services.analytics.AcquisitionType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$analytics$AcquisitionType;

        static {
            int[] iArr = new int[com.unity3d.services.analytics.AcquisitionType.values().length];
            $SwitchMap$com$unity3d$services$analytics$AcquisitionType = iArr;
            try {
                iArr[com.unity3d.services.analytics.AcquisitionType.SOFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$analytics$AcquisitionType[com.unity3d.services.analytics.AcquisitionType.PREMIUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        int i = com.unity3d.services.analytics.AcquisitionType.AnonymousClass1.$SwitchMap$com$unity3d$services$analytics$AcquisitionType[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "premium";
        }
        return "soft";
    }
}
