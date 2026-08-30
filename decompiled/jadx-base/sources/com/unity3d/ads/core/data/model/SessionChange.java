package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: SessionChange.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange;", "", "()V", "PrivacyFsmChange", "UserConsentChange", "Lcom/unity3d/ads/core/data/model/SessionChange$PrivacyFsmChange;", "Lcom/unity3d/ads/core/data/model/SessionChange$UserConsentChange;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SessionChange {
    public /* synthetic */ SessionChange(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: SessionChange.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange$UserConsentChange;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "value", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;)V", "getValue", "()Lcom/google/protobuf/ByteString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UserConsentChange extends com.unity3d.ads.core.data.model.SessionChange {
        private final com.google.protobuf.ByteString value;

        public static /* synthetic */ com.unity3d.ads.core.data.model.SessionChange.UserConsentChange copy$default(com.unity3d.ads.core.data.model.SessionChange.UserConsentChange userConsentChange, com.google.protobuf.ByteString byteString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.google.protobuf.ByteString getValue() {
            return this.value;
        }

        public final com.unity3d.ads.core.data.model.SessionChange.UserConsentChange copy(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.unity3d.ads.core.data.model.SessionChange.UserConsentChange(value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(com.google.protobuf.ByteString value) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final com.google.protobuf.ByteString getValue() {
            return this.value;
        }
    }

    private SessionChange() {
    }

    /* JADX INFO: compiled from: SessionChange.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange$PrivacyFsmChange;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "value", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;)V", "getValue", "()Lcom/google/protobuf/ByteString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PrivacyFsmChange extends com.unity3d.ads.core.data.model.SessionChange {
        private final com.google.protobuf.ByteString value;

        public static /* synthetic */ com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange copy$default(com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange privacyFsmChange, com.google.protobuf.ByteString byteString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.google.protobuf.ByteString getValue() {
            return this.value;
        }

        public final com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange copy(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange(value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(com.google.protobuf.ByteString value) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final com.google.protobuf.ByteString getValue() {
            return this.value;
        }
    }
}
