package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "", "()V", "MuteChange", "VolumeChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$MuteChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$VolumeChange;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class VolumeSettingsChange {
    public /* synthetic */ VolumeSettingsChange(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$MuteChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "isMuted", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MuteChange extends com.unity3d.ads.core.data.datasource.VolumeSettingsChange {
        private final boolean isMuted;

        public static /* synthetic */ com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange copy$default(com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange muteChange, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = muteChange.isMuted;
            }
            return muteChange.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsMuted() {
            return this.isMuted;
        }

        public final com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange copy(boolean isMuted) {
            return new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange(isMuted);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) && this.isMuted == ((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) other).isMuted;
        }

        public int hashCode() {
            boolean z = this.isMuted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public java.lang.String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }
    }

    private VolumeSettingsChange() {
    }

    /* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange$VolumeChange;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "volume", "", "(D)V", "getVolume", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VolumeChange extends com.unity3d.ads.core.data.datasource.VolumeSettingsChange {
        private final double volume;

        public static /* synthetic */ com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange copy$default(com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange volumeChange, double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = volumeChange.volume;
            }
            return volumeChange.copy(d);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getVolume() {
            return this.volume;
        }

        public final com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange copy(double volume) {
            return new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange(volume);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange) && java.lang.Double.compare(this.volume, ((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange) other).volume) == 0;
        }

        public int hashCode() {
            return java.lang.Double.hashCode(this.volume);
        }

        public java.lang.String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }

        public VolumeChange(double d) {
            super(null);
            this.volume = d;
        }

        public final double getVolume() {
            return this.volume;
        }
    }
}
