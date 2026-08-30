package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: DeletionRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\fJ\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "deletionMode", "", "matchBehavior", androidx.media3.extractor.text.ttml.TtmlNode.START, "Ljava/time/Instant;", androidx.media3.extractor.text.ttml.TtmlNode.END, "domainUris", "", "Landroid/net/Uri;", "originUris", "(IILjava/time/Instant;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;)V", "getDeletionMode", "()I", "getDomainUris", "()Ljava/util/List;", "getEnd", "()Ljava/time/Instant;", "getMatchBehavior", "getOriginUris", "getStart", "convertToAdServices", "Landroid/adservices/measurement/DeletionRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "", "Builder", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeletionRequest {
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final java.util.List<android.net.Uri> domainUris;
    private final java.time.Instant end;
    private final int matchBehavior;
    private final java.util.List<android.net.Uri> originUris;
    private final java.time.Instant start;

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i, int i2, java.time.Instant start, java.time.Instant end, java.util.List<? extends android.net.Uri> domainUris, java.util.List<? extends android.net.Uri> originUris) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainUris, "domainUris");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originUris, "originUris");
        this.deletionMode = i;
        this.matchBehavior = i2;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i, int i2, java.time.Instant MIN, java.time.Instant MAX, java.util.List list, java.util.List list2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 4) != 0) {
            MIN = java.time.Instant.MIN;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        }
        java.time.Instant instant = MIN;
        if ((i3 & 8) != 0) {
            MAX = java.time.Instant.MAX;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        }
        this(i, i2, instant, MAX, (i3 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i3 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.time.Instant getStart() {
        return this.start;
    }

    public final java.time.Instant getEnd() {
        return this.end;
    }

    public final java.util.List<android.net.Uri> getDomainUris() {
        return this.domainUris;
    }

    public final java.util.List<android.net.Uri> getOriginUris() {
        return this.originUris;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.deletionMode) * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + java.lang.Integer.hashCode(this.matchBehavior);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.measurement.DeletionRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.measurement.DeletionRequest deletionRequest = (androidx.privacysandbox.ads.adservices.measurement.DeletionRequest) other;
        return this.deletionMode == deletionRequest.deletionMode && kotlin.jvm.internal.Intrinsics.areEqual(new java.util.HashSet(this.domainUris), new java.util.HashSet(deletionRequest.domainUris)) && kotlin.jvm.internal.Intrinsics.areEqual(new java.util.HashSet(this.originUris), new java.util.HashSet(deletionRequest.originUris)) && kotlin.jvm.internal.Intrinsics.areEqual(this.start, deletionRequest.start) && kotlin.jvm.internal.Intrinsics.areEqual(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public java.lang.String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.DeletionRequest deletionRequestBuild = new android.adservices.measurement.DeletionRequest.Builder().setDeletionMode(this.deletionMode).setMatchBehavior(this.matchBehavior).setStart(this.start).setEnd(this.end).setDomainUris(this.domainUris).setOriginUris(this.originUris).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    /* JADX INFO: compiled from: DeletionRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "", "deletionMode", "", "matchBehavior", "(II)V", "domainUris", "", "Landroid/net/Uri;", androidx.media3.extractor.text.ttml.TtmlNode.END, "Ljava/time/Instant;", "originUris", androidx.media3.extractor.text.ttml.TtmlNode.START, "build", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "setDomainUris", "setEnd", "setOriginUris", "setStart", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final int deletionMode;
        private java.util.List<? extends android.net.Uri> domainUris;
        private java.time.Instant end;
        private final int matchBehavior;
        private java.util.List<? extends android.net.Uri> originUris;
        private java.time.Instant start;

        public Builder(int i, int i2) {
            this.deletionMode = i;
            this.matchBehavior = i2;
            java.time.Instant MIN = java.time.Instant.MIN;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
            this.start = MIN;
            java.time.Instant MAX = java.time.Instant.MAX;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
            this.end = MAX;
            this.domainUris = kotlin.collections.CollectionsKt.emptyList();
            this.originUris = kotlin.collections.CollectionsKt.emptyList();
        }

        public final androidx.privacysandbox.ads.adservices.measurement.DeletionRequest.Builder setStart(java.time.Instant start) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.DeletionRequest.Builder setEnd(java.time.Instant end) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
            this.end = end;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.DeletionRequest.Builder setDomainUris(java.util.List<? extends android.net.Uri> domainUris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.DeletionRequest.Builder setOriginUris(java.util.List<? extends android.net.Uri> originUris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.DeletionRequest build() {
            return new androidx.privacysandbox.ads.adservices.measurement.DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }
    }
}
