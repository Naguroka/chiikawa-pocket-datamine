package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001:\u0019\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u001d"}, d2 = {"Lcom/ironsource/j3;", "", "<init>", "()V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", "f", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "m", com.json.zb.q, "o", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "q", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "t", "u", "v", "w", "x", "y", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.j3 f2780a = new com.json.j3();

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÂ\u0003J\u001c\u0010\u0004\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\f\b\u0002\u0010\n\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0018\u0010\n\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ironsource/j3$a;", "Lcom/ironsource/k3;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.ironsource.mediationsdk.IronSource.AD_UNIT value;

        public a(com.ironsource.mediationsdk.IronSource.AD_UNIT value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.a a(com.ironsource.j3.a aVar, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ad_unit = aVar.value;
            }
            return aVar.a(ad_unit);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final com.ironsource.mediationsdk.IronSource.AD_UNIT getValue() {
            return this.value;
        }

        public final com.ironsource.j3.a a(com.ironsource.mediationsdk.IronSource.AD_UNIT value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.a(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", java.lang.Integer.valueOf(com.json.rt.b(this.value)));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.a) && this.value == ((com.ironsource.j3.a) other).value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "AdFormatEntity(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$b;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        public b(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.b a(com.ironsource.j3.b bVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bVar.value;
            }
            return bVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getValue() {
            return this.value;
        }

        public final com.ironsource.j3.b a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.b(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.ironsource.j3.b) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "AdIdentifier(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/j3$c;", "Lcom/ironsource/k3;", "", "", "", "bundle", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/ironsourceads/AdSize;", "Lcom/unity3d/ironsourceads/AdSize;", "size", "<init>", "(Lcom/unity3d/ironsourceads/AdSize;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.unity3d.ironsourceads.AdSize size;

        public c(com.unity3d.ironsourceads.AdSize size) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
            this.size = size;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String sizeDescription = this.size.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals(com.json.mediationsdk.l.f2983a)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else if (sizeDescription.equals(com.json.mediationsdk.l.d)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                } else if (sizeDescription.equals(com.json.mediationsdk.l.b)) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (sizeDescription.equals(com.json.mediationsdk.l.g)) {
                i = 3;
            } else {
                i = 0;
            }
            bundle.put(com.json.mediationsdk.l.h, java.lang.Integer.valueOf(i));
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$d;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "auctionId", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class d implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String auctionId;

        public d(java.lang.String auctionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.auctionId = auctionId;
        }

        public static /* synthetic */ com.ironsource.j3.d a(com.ironsource.j3.d dVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dVar.auctionId;
            }
            return dVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getAuctionId() {
            return this.auctionId;
        }

        public final com.ironsource.j3.d a(java.lang.String auctionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new com.ironsource.j3.d(auctionId);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.auctionId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionId, ((com.ironsource.j3.d) other).auctionId);
        }

        public int hashCode() {
            return this.auctionId.hashCode();
        }

        public java.lang.String toString() {
            return "AuctionId(auctionId=" + this.auctionId + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$e;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "value", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class e implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public e(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.ironsource.j3.e a(com.ironsource.j3.e eVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.value;
            }
            return eVar.a(i);
        }

        public final com.ironsource.j3.e a(int value) {
            return new com.ironsource.j3.e(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, java.lang.Integer.valueOf(this.value));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.e) && this.value == ((com.ironsource.j3.e) other).value;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "DemandOnly(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/j3$f;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "duration", "toString", "", "hashCode", "other", "", "equals", "J", "<init>", "(J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class f implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long duration;

        public f(long j) {
            this.duration = j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final long getDuration() {
            return this.duration;
        }

        public static /* synthetic */ com.ironsource.j3.f a(com.ironsource.j3.f fVar, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fVar.duration;
            }
            return fVar.a(j);
        }

        public final com.ironsource.j3.f a(long duration) {
            return new com.ironsource.j3.f(duration);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("duration", java.lang.Long.valueOf(this.duration));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.f) && this.duration == ((com.ironsource.j3.f) other).duration;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.duration);
        }

        public java.lang.String toString() {
            return "Duration(duration=" + this.duration + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$g;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "dynamicSourceId", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class g implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String dynamicSourceId;

        public g(java.lang.String dynamicSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.dynamicSourceId = dynamicSourceId;
        }

        public static /* synthetic */ com.ironsource.j3.g a(com.ironsource.j3.g gVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = gVar.dynamicSourceId;
            }
            return gVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getDynamicSourceId() {
            return this.dynamicSourceId;
        }

        public final com.ironsource.j3.g a(java.lang.String dynamicSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new com.ironsource.j3.g(dynamicSourceId);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.dynamicSourceId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.dynamicSourceId, ((com.ironsource.j3.g) other).dynamicSourceId);
        }

        public int hashCode() {
            return this.dynamicSourceId.hashCode();
        }

        public java.lang.String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.dynamicSourceId + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$h;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "sourceId", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class h implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String sourceId;

        public h(java.lang.String sourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.sourceId = sourceId;
        }

        public static /* synthetic */ com.ironsource.j3.h a(com.ironsource.j3.h hVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = hVar.sourceId;
            }
            return hVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getSourceId() {
            return this.sourceId;
        }

        public final com.ironsource.j3.h a(java.lang.String sourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new com.ironsource.j3.h(sourceId);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.sourceId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceId, ((com.ironsource.j3.h) other).sourceId);
        }

        public int hashCode() {
            return this.sourceId.hashCode();
        }

        public java.lang.String toString() {
            return "DynamicSourceId(sourceId=" + this.sourceId + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ironsource/j3$i;", "Lcom/ironsource/k3;", "", "", "", "bundle", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class i implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.j3.i f2789a = new com.ironsource.j3.i();

        private i() {
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$j;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "code", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class j implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        public j(int i) {
            this.code = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.ironsource.j3.j a(com.ironsource.j3.j jVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.code;
            }
            return jVar.a(i);
        }

        public final com.ironsource.j3.j a(int code) {
            return new com.ironsource.j3.j(code);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(this.code));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.j) && this.code == ((com.ironsource.j3.j) other).code;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.code);
        }

        public java.lang.String toString() {
            return "ErrorCode(code=" + this.code + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$k;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "reason", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class k implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String reason;

        public k(java.lang.String str) {
            this.reason = str;
        }

        public static /* synthetic */ com.ironsource.j3.k a(com.ironsource.j3.k kVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = kVar.reason;
            }
            return kVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getReason() {
            return this.reason;
        }

        public final com.ironsource.j3.k a(java.lang.String reason) {
            return new com.ironsource.j3.k(reason);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.lang.String str = this.reason;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.reason);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.ironsource.j3.k) other).reason);
        }

        public int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public java.lang.String toString() {
            return "ErrorReason(reason=" + this.reason + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$l;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class l implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        public l(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.l a(com.ironsource.j3.l lVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lVar.value;
            }
            return lVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getValue() {
            return this.value;
        }

        public final com.ironsource.j3.l a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.l(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.ironsource.j3.l) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "Ext1(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/j3$m;", "Lcom/ironsource/k3;", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "genericParams", "toString", "", "hashCode", "other", "", "equals", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class m implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final org.json.JSONObject genericParams;

        public m(org.json.JSONObject jSONObject) {
            this.genericParams = jSONObject;
        }

        public static /* synthetic */ com.ironsource.j3.m a(com.ironsource.j3.m mVar, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.genericParams;
            }
            return mVar.a(jSONObject);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final org.json.JSONObject getGenericParams() {
            return this.genericParams;
        }

        public final com.ironsource.j3.m a(org.json.JSONObject genericParams) {
            return new com.ironsource.j3.m(genericParams);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            org.json.JSONObject jSONObject = this.genericParams;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.genericParams, ((com.ironsource.j3.m) other).genericParams);
        }

        public int hashCode() {
            org.json.JSONObject jSONObject = this.genericParams;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public java.lang.String toString() {
            return "GenericParams(genericParams=" + this.genericParams + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$n;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "instanceType", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class n implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int instanceType;

        public n(int i) {
            this.instanceType = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getInstanceType() {
            return this.instanceType;
        }

        public static /* synthetic */ com.ironsource.j3.n a(com.ironsource.j3.n nVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.instanceType;
            }
            return nVar.a(i);
        }

        public final com.ironsource.j3.n a(int instanceType) {
            return new com.ironsource.j3.n(instanceType);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", java.lang.Integer.valueOf(this.instanceType));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.n) && this.instanceType == ((com.ironsource.j3.n) other).instanceType;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.instanceType);
        }

        public java.lang.String toString() {
            return "InstanceType(instanceType=" + this.instanceType + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$o;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "value", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class o implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public o(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.ironsource.j3.o a(com.ironsource.j3.o oVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.value;
            }
            return oVar.a(i);
        }

        public final com.ironsource.j3.o a(int value) {
            return new com.ironsource.j3.o(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", java.lang.Integer.valueOf(this.value));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.o) && this.value == ((com.ironsource.j3.o) other).value;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "MultipleAdObjects(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$p;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "value", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class p implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public p(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.ironsource.j3.p a(com.ironsource.j3.p pVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.value;
            }
            return pVar.a(i);
        }

        public final com.ironsource.j3.p a(int value) {
            return new com.ironsource.j3.p(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", java.lang.Integer.valueOf(this.value));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.p) && this.value == ((com.ironsource.j3.p) other).value;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "OneFlow(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$q;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class q implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        public q(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.q a(com.ironsource.j3.q qVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = qVar.value;
            }
            return qVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getValue() {
            return this.value;
        }

        public final com.ironsource.j3.q a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.q(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.q) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.ironsource.j3.q) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "Placement(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$r;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class r implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int programmatic;

        public r(int i) {
            this.programmatic = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getProgrammatic() {
            return this.programmatic;
        }

        public static /* synthetic */ com.ironsource.j3.r a(com.ironsource.j3.r rVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.programmatic;
            }
            return rVar.a(i);
        }

        public final com.ironsource.j3.r a(int programmatic) {
            return new com.ironsource.j3.r(programmatic);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(this.programmatic));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.r) && this.programmatic == ((com.ironsource.j3.r) other).programmatic;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.programmatic);
        }

        public java.lang.String toString() {
            return "Programmatic(programmatic=" + this.programmatic + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$s;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "sourceName", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class s implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String sourceName;

        public s(java.lang.String sourceName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.sourceName = sourceName;
        }

        public static /* synthetic */ com.ironsource.j3.s a(com.ironsource.j3.s sVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sVar.sourceName;
            }
            return sVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getSourceName() {
            return this.sourceName;
        }

        public final com.ironsource.j3.s a(java.lang.String sourceName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new com.ironsource.j3.s(sourceName);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.sourceName);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.s) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceName, ((com.ironsource.j3.s) other).sourceName);
        }

        public int hashCode() {
            return this.sourceName.hashCode();
        }

        public java.lang.String toString() {
            return "Provider(sourceName=" + this.sourceName + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$t;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "value", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class t implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public t(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.ironsource.j3.t a(com.ironsource.j3.t tVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.value;
            }
            return tVar.a(i);
        }

        public final com.ironsource.j3.t a(int value) {
            return new com.ironsource.j3.t(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(this.value));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.t) && this.value == ((com.ironsource.j3.t) other).value;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "RewardAmount(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$u;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class u implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        public u(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.u a(com.ironsource.j3.u uVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uVar.value;
            }
            return uVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getValue() {
            return this.value;
        }

        public final com.ironsource.j3.u a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.u(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, this.value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.u) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.ironsource.j3.u) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "RewardName(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$v;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "version", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class v implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String version;

        public v(java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
        }

        public static /* synthetic */ com.ironsource.j3.v a(com.ironsource.j3.v vVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = vVar.version;
            }
            return vVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getVersion() {
            return this.version;
        }

        public final com.ironsource.j3.v a(java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            return new com.ironsource.j3.v(version);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.version);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.v) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, ((com.ironsource.j3.v) other).version);
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public java.lang.String toString() {
            return "SdkVersion(version=" + this.version + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$w;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "", "bundle", "", "sessionDepth", "toString", "hashCode", "other", "", "equals", "I", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class w implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int sessionDepth;

        public w(int i) {
            this.sessionDepth = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final int getSessionDepth() {
            return this.sessionDepth;
        }

        public static /* synthetic */ com.ironsource.j3.w a(com.ironsource.j3.w wVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.sessionDepth;
            }
            return wVar.a(i);
        }

        public final com.ironsource.j3.w a(int sessionDepth) {
            return new com.ironsource.j3.w(sessionDepth);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", java.lang.Integer.valueOf(this.sessionDepth));
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.w) && this.sessionDepth == ((com.ironsource.j3.w) other).sessionDepth;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.sessionDepth);
        }

        public java.lang.String toString() {
            return "SessionDepth(sessionDepth=" + this.sessionDepth + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$x;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "subProviderId", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class x implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String subProviderId;

        public x(java.lang.String subProviderId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.subProviderId = subProviderId;
        }

        public static /* synthetic */ com.ironsource.j3.x a(com.ironsource.j3.x xVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = xVar.subProviderId;
            }
            return xVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getSubProviderId() {
            return this.subProviderId;
        }

        public final com.ironsource.j3.x a(java.lang.String subProviderId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new com.ironsource.j3.x(subProviderId);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.subProviderId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.subProviderId, ((com.ironsource.j3.x) other).subProviderId);
        }

        public int hashCode() {
            return this.subProviderId.hashCode();
        }

        public java.lang.String toString() {
            return "SubProviderId(subProviderId=" + this.subProviderId + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u001c\u0010\u0003\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/j3$y;", "Lcom/ironsource/k3;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "bundle", "", "value", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class y implements com.json.k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        public y(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ com.ironsource.j3.y a(com.ironsource.j3.y yVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = yVar.value;
            }
            return yVar.a(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        private final java.lang.String getValue() {
            return this.value;
        }

        public final com.ironsource.j3.y a(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.ironsource.j3.y(value);
        }

        @Override // com.json.k3
        public void a(java.util.Map<java.lang.String, java.lang.Object> bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, this.value);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.j3.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.ironsource.j3.y) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "TransId(value=" + this.value + ')';
        }
    }

    private j3() {
    }
}
