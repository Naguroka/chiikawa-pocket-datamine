package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SignalsCollectorBase implements com.unity3d.scar.adapter.common.signals.ISignalsCollector {
    public static final java.lang.String SCAR_BAN_SIGNAL = "gmaScarBiddingBannerSignal";
    public static final java.lang.String SCAR_INT_SIGNAL = "gmaScarBiddingInterstitialSignal";
    public static final java.lang.String SCAR_RV_SIGNAL = "gmaScarBiddingRewardedSignal";

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener) {
        com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup = new com.unity3d.scar.adapter.common.DispatchGroup();
        com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult = new com.unity3d.scar.adapter.common.signals.SignalsResult();
        dispatchGroup.enter();
        getSCARSignal(context, str, unityAdFormat, dispatchGroup, signalsResult);
        dispatchGroup.notify(new com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.GMAScarDispatchCompleted(iSignalCollectionListener, signalsResult));
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public void getSCARBiddingSignals(android.content.Context context, boolean z, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener) {
        com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup = new com.unity3d.scar.adapter.common.DispatchGroup();
        com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult = new com.unity3d.scar.adapter.common.signals.SignalsResult();
        dispatchGroup.enter();
        getSCARSignalForHB(context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL, dispatchGroup, signalsResult);
        dispatchGroup.enter();
        getSCARSignalForHB(context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED, dispatchGroup, signalsResult);
        if (z) {
            dispatchGroup.enter();
            getSCARSignalForHB(context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER, dispatchGroup, signalsResult);
        }
        dispatchGroup.notify(new com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.GMAScarDispatchCompleted(iSignalCollectionListener, signalsResult));
    }

    public void onOperationNotSupported(java.lang.String str, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
        signalsResult.setErrorMessage(java.lang.String.format("Operation Not supported: %s.", str));
        dispatchGroup.leave();
    }

    private class GMAScarDispatchCompleted implements java.lang.Runnable {
        private com.unity3d.scar.adapter.common.signals.ISignalCollectionListener _signalListener;
        private com.unity3d.scar.adapter.common.signals.SignalsResult _signalsResult;

        public GMAScarDispatchCompleted(com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
            this._signalListener = iSignalCollectionListener;
            this._signalsResult = signalsResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.Map<java.lang.String, java.lang.String> signalsMap = this._signalsResult.getSignalsMap();
            if (signalsMap.size() > 0) {
                this._signalListener.onSignalsCollected(new org.json.JSONObject(signalsMap).toString());
            } else if (this._signalsResult.getErrorMessage() == null) {
                this._signalListener.onSignalsCollected("");
            } else {
                this._signalListener.onSignalsCollectionFailed(this._signalsResult.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.scar.adapter.common.signals.SignalsCollectorBase$1, reason: invalid class name */
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

    public java.lang.String getAdKey(com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat) {
        int i = com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.AnonymousClass1.$SwitchMap$com$unity3d$scar$adapter$common$scarads$UnityAdFormat[unityAdFormat.ordinal()];
        if (i == 1) {
            return SCAR_BAN_SIGNAL;
        }
        if (i != 2) {
            return i != 3 ? "" : SCAR_RV_SIGNAL;
        }
        return SCAR_INT_SIGNAL;
    }
}
