package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: ShowEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "()V", "CancelTimeout", "Clicked", "Completed", "Error", "LeftApplication", "Started", "Lcom/unity3d/ads/core/data/model/ShowEvent$CancelTimeout;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Clicked;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Completed;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Error;", "Lcom/unity3d/ads/core/data/model/ShowEvent$LeftApplication;", "Lcom/unity3d/ads/core/data/model/ShowEvent$Started;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ShowEvent {
    public /* synthetic */ ShowEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Started;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Started extends com.unity3d.ads.core.data.model.ShowEvent {
        public static final com.unity3d.ads.core.data.model.ShowEvent.Started INSTANCE = new com.unity3d.ads.core.data.model.ShowEvent.Started();

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Clicked;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Clicked extends com.unity3d.ads.core.data.model.ShowEvent {
        public static final com.unity3d.ads.core.data.model.ShowEvent.Clicked INSTANCE = new com.unity3d.ads.core.data.model.ShowEvent.Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$CancelTimeout;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelTimeout extends com.unity3d.ads.core.data.model.ShowEvent {
        public static final com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout INSTANCE = new com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Completed;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "status", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "(Lcom/unity3d/ads/adplayer/model/ShowStatus;)V", "getStatus", "()Lcom/unity3d/ads/adplayer/model/ShowStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Completed extends com.unity3d.ads.core.data.model.ShowEvent {
        private final com.unity3d.ads.adplayer.model.ShowStatus status;

        public static /* synthetic */ com.unity3d.ads.core.data.model.ShowEvent.Completed copy$default(com.unity3d.ads.core.data.model.ShowEvent.Completed completed, com.unity3d.ads.adplayer.model.ShowStatus showStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            return completed.copy(showStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.ads.adplayer.model.ShowStatus getStatus() {
            return this.status;
        }

        public final com.unity3d.ads.core.data.model.ShowEvent.Completed copy(com.unity3d.ads.adplayer.model.ShowStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
            return new com.unity3d.ads.core.data.model.ShowEvent.Completed(status);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) && this.status == ((com.unity3d.ads.core.data.model.ShowEvent.Completed) other).status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public java.lang.String toString() {
            return "Completed(status=" + this.status + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(com.unity3d.ads.adplayer.model.ShowStatus status) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public final com.unity3d.ads.adplayer.model.ShowStatus getStatus() {
            return this.status;
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$Error;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "reason", "(Ljava/lang/String;ILjava/lang/String;)V", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "getReason", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends com.unity3d.ads.core.data.model.ShowEvent {
        private final int errorCode;
        private final java.lang.String message;
        private final java.lang.String reason;

        public static /* synthetic */ com.unity3d.ads.core.data.model.ShowEvent.Error copy$default(com.unity3d.ads.core.data.model.ShowEvent.Error error, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final com.unity3d.ads.core.data.model.ShowEvent.Error copy(java.lang.String message, int errorCode, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            return new com.unity3d.ads.core.data.model.ShowEvent.Error(message, errorCode, reason);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) {
                return false;
            }
            com.unity3d.ads.core.data.model.ShowEvent.Error error = (com.unity3d.ads.core.data.model.ShowEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.errorCode == error.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, error.reason);
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + java.lang.Integer.hashCode(this.errorCode)) * 31) + this.reason.hashCode();
        }

        public java.lang.String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String message, int i, java.lang.String reason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i;
            this.reason = reason;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: ShowEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent$LeftApplication;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LeftApplication extends com.unity3d.ads.core.data.model.ShowEvent {
        public static final com.unity3d.ads.core.data.model.ShowEvent.LeftApplication INSTANCE = new com.unity3d.ads.core.data.model.ShowEvent.LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }
}
