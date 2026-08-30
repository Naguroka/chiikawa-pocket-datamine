package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: LoadEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/adplayer/model/LoadEvent;", "", "()V", "Completed", "Error", "Lcom/unity3d/ads/adplayer/model/LoadEvent$Completed;", "Lcom/unity3d/ads/adplayer/model/LoadEvent$Error;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LoadEvent {
    public /* synthetic */ LoadEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: LoadEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/adplayer/model/LoadEvent$Completed;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Completed extends com.unity3d.ads.adplayer.model.LoadEvent {
        public static final com.unity3d.ads.adplayer.model.LoadEvent.Completed INSTANCE = new com.unity3d.ads.adplayer.model.LoadEvent.Completed();

        private Completed() {
            super(null);
        }
    }

    private LoadEvent() {
    }

    /* JADX INFO: compiled from: LoadEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/adplayer/model/LoadEvent$Error;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "(Ljava/lang/String;I)V", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends com.unity3d.ads.adplayer.model.LoadEvent {
        private final int errorCode;
        private final java.lang.String message;

        public static /* synthetic */ com.unity3d.ads.adplayer.model.LoadEvent.Error copy$default(com.unity3d.ads.adplayer.model.LoadEvent.Error error, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            return error.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public final com.unity3d.ads.adplayer.model.LoadEvent.Error copy(java.lang.String message, int errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            return new com.unity3d.ads.adplayer.model.LoadEvent.Error(message, errorCode);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                return false;
            }
            com.unity3d.ads.adplayer.model.LoadEvent.Error error = (com.unity3d.ads.adplayer.model.LoadEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.errorCode == error.errorCode;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Integer.hashCode(this.errorCode);
        }

        public java.lang.String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String message, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }
    }
}
