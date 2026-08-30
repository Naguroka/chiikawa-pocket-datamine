package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: OMResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMResult;", "", "()V", "Failure", "Success", "Lcom/unity3d/ads/core/data/model/OMResult$Failure;", "Lcom/unity3d/ads/core/data/model/OMResult$Success;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OMResult {
    public /* synthetic */ OMResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: OMResult.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMResult$Success;", "Lcom/unity3d/ads/core/data/model/OMResult;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success extends com.unity3d.ads.core.data.model.OMResult {
        public static final com.unity3d.ads.core.data.model.OMResult.Success INSTANCE = new com.unity3d.ads.core.data.model.OMResult.Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    /* JADX INFO: compiled from: OMResult.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMResult$Failure;", "Lcom/unity3d/ads/core/data/model/OMResult;", "reason", "", "reasonDebug", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getReasonDebug", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.unity3d.ads.core.data.model.OMResult {
        private final java.lang.String reason;
        private final java.lang.String reasonDebug;

        public static /* synthetic */ com.unity3d.ads.core.data.model.OMResult.Failure copy$default(com.unity3d.ads.core.data.model.OMResult.Failure failure, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getReasonDebug() {
            return this.reasonDebug;
        }

        public final com.unity3d.ads.core.data.model.OMResult.Failure copy(java.lang.String reason, java.lang.String reasonDebug) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            return new com.unity3d.ads.core.data.model.OMResult.Failure(reason, reasonDebug);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.OMResult.Failure)) {
                return false;
            }
            com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, failure.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonDebug, failure.reasonDebug);
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            java.lang.String str = this.reasonDebug;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public java.lang.String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Failure(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getReasonDebug() {
            return this.reasonDebug;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(java.lang.String reason, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }
    }
}
