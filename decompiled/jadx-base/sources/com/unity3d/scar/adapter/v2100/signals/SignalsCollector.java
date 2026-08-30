package com.unity3d.scar.adapter.v2100.signals;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsCollector extends com.unity3d.scar.adapter.common.signals.SignalsCollectorBase implements com.unity3d.scar.adapter.common.signals.ISignalsCollector {
    private com.unity3d.scar.adapter.v2100.requests.AdRequestFactory _adRequestFactory;

    public SignalsCollector(com.unity3d.scar.adapter.v2100.requests.AdRequestFactory adRequestFactory) {
        this._adRequestFactory = adRequestFactory;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
        com.google.android.gms.ads.query.QueryInfo.generate(context, getAdFormat(unityAdFormat), this._adRequestFactory.buildAdRequest(), new com.unity3d.scar.adapter.v2100.signals.QueryInfoCallback(str, new com.unity3d.scar.adapter.common.signals.SignalCallbackListener(dispatchGroup, signalsResult)));
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARSignalForHB(android.content.Context context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
        getSCARSignal(context, getAdKey(unityAdFormat), unityAdFormat, dispatchGroup, signalsResult);
    }

    /* JADX INFO: renamed from: com.unity3d.scar.adapter.v2100.signals.SignalsCollector$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat;

        static {
            int[] iArr = new int[com.unity3d.scar.adapter.common.scarads.UnityAdFormat.values().length];
            $SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat = iArr;
            try {
                iArr[com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat[com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat[com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public com.google.android.gms.ads.AdFormat getAdFormat(com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat) {
        int i = com.unity3d.scar.adapter.v2100.signals.SignalsCollector.AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat[unityAdFormat.ordinal()];
        if (i == 1) {
            return com.google.android.gms.ads.AdFormat.BANNER;
        }
        if (i == 2) {
            return com.google.android.gms.ads.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return com.google.android.gms.ads.AdFormat.REWARDED;
        }
        return com.google.android.gms.ads.AdFormat.UNKNOWN;
    }
}
