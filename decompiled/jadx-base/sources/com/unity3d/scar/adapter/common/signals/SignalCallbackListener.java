package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public class SignalCallbackListener<T> implements com.unity3d.scar.adapter.common.signals.ISignalCallbackListener<T> {
    private com.unity3d.scar.adapter.common.DispatchGroup _dispatchGroup;
    private com.unity3d.scar.adapter.common.signals.SignalsResult _signalsResult;
    private com.unity3d.scar.adapter.common.signals.SignalsStorage<T> _signalsStorage;

    public SignalCallbackListener(com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
        this(dispatchGroup, null, signalsResult);
    }

    public SignalCallbackListener(com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsStorage<T> signalsStorage, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult) {
        this._dispatchGroup = dispatchGroup;
        this._signalsStorage = signalsStorage;
        this._signalsResult = signalsResult;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCallbackListener
    public void onSuccess(java.lang.String str, java.lang.String str2, T t) {
        this._signalsResult.addToSignalsMap(str, str2);
        com.unity3d.scar.adapter.common.signals.SignalsStorage<T> signalsStorage = this._signalsStorage;
        if (signalsStorage != null) {
            signalsStorage.put(str, t);
        }
        this._dispatchGroup.leave();
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCallbackListener
    public void onFailure(java.lang.String str) {
        this._signalsResult.setErrorMessage(str);
        this._dispatchGroup.leave();
    }
}
