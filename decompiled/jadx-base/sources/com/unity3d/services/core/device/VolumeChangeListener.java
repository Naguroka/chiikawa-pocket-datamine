package com.unity3d.services.core.device;

/* JADX INFO: compiled from: VolumeChangeListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/VolumeChangeListener;", "", "getStreamType", "", "onVolumeChanged", "", "volume", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VolumeChangeListener {
    int getStreamType();

    void onVolumeChanged(int volume);
}
