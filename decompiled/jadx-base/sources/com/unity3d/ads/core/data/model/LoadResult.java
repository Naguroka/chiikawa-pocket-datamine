package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: LoadResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult;", "", "()V", "Companion", "Failure", "Success", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LoadResult {
    public static final java.lang.String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final java.lang.String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final java.lang.String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final java.lang.String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final java.lang.String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final java.lang.String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final java.lang.String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final java.lang.String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final java.lang.String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final java.lang.String MSG_NO_FILL = "[UnityAds] No fill";
    public static final java.lang.String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    public static final java.lang.String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final java.lang.String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final java.lang.String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    public /* synthetic */ LoadResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: LoadResult.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends com.unity3d.ads.core.data.model.LoadResult {
        private final com.unity3d.ads.core.data.model.AdObject adObject;

        public static /* synthetic */ com.unity3d.ads.core.data.model.LoadResult.Success copy$default(com.unity3d.ads.core.data.model.LoadResult.Success success, com.unity3d.ads.core.data.model.AdObject adObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.ads.core.data.model.AdObject getAdObject() {
            return this.adObject;
        }

        public final com.unity3d.ads.core.data.model.LoadResult.Success copy(com.unity3d.ads.core.data.model.AdObject adObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
            return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.model.LoadResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.adObject, ((com.unity3d.ads.core.data.model.LoadResult.Success) other).adObject);
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public java.lang.String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.unity3d.ads.core.data.model.AdObject adObject) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
            this.adObject = adObject;
        }

        public final com.unity3d.ads.core.data.model.AdObject getAdObject() {
            return this.adObject;
        }
    }

    private LoadResult() {
    }

    /* JADX INFO: compiled from: LoadResult.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "error", "Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", "(Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "getMessage", "()Ljava/lang/String;", "getReason", "getReasonDebug", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.unity3d.ads.core.data.model.LoadResult {
        private final com.unity3d.ads.UnityAds.UnityAdsLoadError error;
        private final java.lang.String message;
        private final java.lang.String reason;
        private final java.lang.String reasonDebug;
        private final java.lang.Throwable throwable;

        public static /* synthetic */ com.unity3d.ads.core.data.model.LoadResult.Failure copy$default(com.unity3d.ads.core.data.model.LoadResult.Failure failure, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i & 2) != 0) {
                str = failure.message;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            java.lang.Throwable th2 = th;
            if ((i & 8) != 0) {
                str2 = failure.reason;
            }
            java.lang.String str5 = str2;
            if ((i & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            return failure.copy(unityAdsLoadError, str4, th2, str5, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.ads.UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final java.lang.String getReasonDebug() {
            return this.reasonDebug;
        }

        public final com.unity3d.ads.core.data.model.LoadResult.Failure copy(com.unity3d.ads.UnityAds.UnityAdsLoadError error, java.lang.String message, java.lang.Throwable throwable, java.lang.String reason, java.lang.String reasonDebug) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            return new com.unity3d.ads.core.data.model.LoadResult.Failure(error, message, throwable, reason, reasonDebug);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.LoadResult.Failure)) {
                return false;
            }
            com.unity3d.ads.core.data.model.LoadResult.Failure failure = (com.unity3d.ads.core.data.model.LoadResult.Failure) other;
            return this.error == failure.error && kotlin.jvm.internal.Intrinsics.areEqual(this.message, failure.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, failure.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, failure.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonDebug, failure.reasonDebug);
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            java.lang.String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.Throwable th = this.throwable;
            int iHashCode3 = (((iHashCode2 + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
            java.lang.String str2 = this.reasonDebug;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(unityAdsLoadError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, str2, (i & 16) != 0 ? null : str3);
        }

        public final com.unity3d.ads.UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getReasonDebug() {
            return this.reasonDebug;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError error, java.lang.String str, java.lang.Throwable th, java.lang.String reason, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th;
            this.reason = reason;
            this.reasonDebug = str2;
        }
    }
}
