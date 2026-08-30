package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public interface ISignalsCollector {
    void getSCARBiddingSignals(android.content.Context context, boolean z, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult);

    void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARSignalForHB(android.content.Context context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult);
}
