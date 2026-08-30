package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: CacheResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult;", "", "()V", "Failure", "Success", "Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CacheResult {
    public /* synthetic */ CacheResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: CacheResult.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "(Lcom/unity3d/ads/core/data/model/CachedFile;Lcom/unity3d/ads/core/data/model/CacheSource;)V", "getCachedFile", "()Lcom/unity3d/ads/core/data/model/CachedFile;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends com.unity3d.ads.core.data.model.CacheResult {
        private final com.unity3d.ads.core.data.model.CachedFile cachedFile;
        private final com.unity3d.ads.core.data.model.CacheSource source;

        public static /* synthetic */ com.unity3d.ads.core.data.model.CacheResult.Success copy$default(com.unity3d.ads.core.data.model.CacheResult.Success success, com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource cacheSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.ads.core.data.model.CachedFile getCachedFile() {
            return this.cachedFile;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }

        public final com.unity3d.ads.core.data.model.CacheResult.Success copy(com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.unity3d.ads.core.data.model.CacheResult.Success(cachedFile, source);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
                return false;
            }
            com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        public java.lang.String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.unity3d.ads.core.data.model.CachedFile cachedFile, com.unity3d.ads.core.data.model.CacheSource source) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public final com.unity3d.ads.core.data.model.CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }
    }

    private CacheResult() {
    }

    /* JADX INFO: compiled from: CacheResult.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "error", "Lcom/unity3d/ads/core/data/model/CacheError;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;)V", "getError", "()Lcom/unity3d/ads/core/data/model/CacheError;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.unity3d.ads.core.data.model.CacheResult {
        private final com.unity3d.ads.core.data.model.CacheError error;
        private final com.unity3d.ads.core.data.model.CacheSource source;

        public static /* synthetic */ com.unity3d.ads.core.data.model.CacheResult.Failure copy$default(com.unity3d.ads.core.data.model.CacheResult.Failure failure, com.unity3d.ads.core.data.model.CacheError cacheError, com.unity3d.ads.core.data.model.CacheSource cacheSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            return failure.copy(cacheError, cacheSource);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheError getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }

        public final com.unity3d.ads.core.data.model.CacheResult.Failure copy(com.unity3d.ads.core.data.model.CacheError error, com.unity3d.ads.core.data.model.CacheSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.unity3d.ads.core.data.model.CacheResult.Failure(error, source);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.data.model.CacheResult.Failure)) {
                return false;
            }
            com.unity3d.ads.core.data.model.CacheResult.Failure failure = (com.unity3d.ads.core.data.model.CacheResult.Failure) other;
            return this.error == failure.error && this.source == failure.source;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.source.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.unity3d.ads.core.data.model.CacheError error, com.unity3d.ads.core.data.model.CacheSource source) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.error = error;
            this.source = source;
        }

        public /* synthetic */ Failure(com.unity3d.ads.core.data.model.CacheError cacheError, com.unity3d.ads.core.data.model.CacheSource cacheSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i & 2) != 0 ? com.unity3d.ads.core.data.model.CacheSource.LOCAL : cacheSource);
        }

        public final com.unity3d.ads.core.data.model.CacheError getError() {
            return this.error;
        }

        public final com.unity3d.ads.core.data.model.CacheSource getSource() {
            return this.source;
        }
    }
}
