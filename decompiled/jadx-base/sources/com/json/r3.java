package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\u0082\u0001\u0001\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/r3;", "", "", "c", "()Ljava/lang/String;", "successCallback", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "failCallback", "Lcom/ironsource/zg$e;", "b", "()Lcom/ironsource/zg$e;", com.ironsource.y8.h.m, "d", "demandSourceName", "Lcom/ironsource/r3$a;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.json.r3.Companion INSTANCE = com.json.r3.Companion.f3232a;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/r3$a;", "Lcom/ironsource/r3;", "", "getUrl", "()Ljava/lang/String;", "url", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lcom/ironsource/r3$a$a;", "Lcom/ironsource/r3$a$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a extends com.json.r3 {

        /* JADX INFO: renamed from: com.ironsource.r3$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0016\u0010 R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*¨\u0006."}, d2 = {"Lcom/ironsource/r3$a$a;", "Lcom/ironsource/r3$a;", "", "e", "f", "Lcom/ironsource/zg$e;", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/r3$a$a$a;", "j", "", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "successCallback", "failCallback", com.ironsource.y8.h.m, "demandSourceName", "url", com.json.z8.COORDINATES, "action", com.json.z8.META_STATE, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/ironsource/zg$e;", "()Lcom/ironsource/zg$e;", "getUrl", "Lcom/ironsource/r3$a$a$a;", com.json.zb.q, "()Lcom/ironsource/r3$a$a$a;", "I", "m", "()I", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/zg$e;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/r3$a$a$a;II)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class C0241a implements com.ironsource.r3.a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final java.lang.String successCallback;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final java.lang.String failCallback;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final com.ironsource.zg.e productType;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final java.lang.String demandSourceName;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final java.lang.String url;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final com.ironsource.r3.a.C0241a.C0242a coordinates;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final int action;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final int metaState;

            /* JADX INFO: renamed from: com.ironsource.r3$a$a$a, reason: collision with other inner class name */
            @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/r3$a$a$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "x", "y", "", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "d", "<init>", "(II)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
            public static final /* data */ class C0242a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int x;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                private final int y;

                public C0242a(int i, int i2) {
                    this.x = i;
                    this.y = i2;
                }

                public static /* synthetic */ com.ironsource.r3.a.C0241a.C0242a a(com.ironsource.r3.a.C0241a.C0242a c0242a, int i, int i2, int i3, java.lang.Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c0242a.x;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c0242a.y;
                    }
                    return c0242a.a(i, i2);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getX() {
                    return this.x;
                }

                public final com.ironsource.r3.a.C0241a.C0242a a(int x, int y) {
                    return new com.ironsource.r3.a.C0241a.C0242a(x, y);
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getY() {
                    return this.y;
                }

                public final int c() {
                    return this.x;
                }

                public final int d() {
                    return this.y;
                }

                public boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.ironsource.r3.a.C0241a.C0242a)) {
                        return false;
                    }
                    com.ironsource.r3.a.C0241a.C0242a c0242a = (com.ironsource.r3.a.C0241a.C0242a) other;
                    return this.x == c0242a.x && this.y == c0242a.y;
                }

                public int hashCode() {
                    return (java.lang.Integer.hashCode(this.x) * 31) + java.lang.Integer.hashCode(this.y);
                }

                public java.lang.String toString() {
                    return "Coordinates(x=" + this.x + ", y=" + this.y + ')';
                }
            }

            public C0241a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.zg.e productType, java.lang.String demandSourceName, java.lang.String url, com.ironsource.r3.a.C0241a.C0242a coordinates, int i, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.successCallback = successCallback;
                this.failCallback = failCallback;
                this.productType = productType;
                this.demandSourceName = demandSourceName;
                this.url = url;
                this.coordinates = coordinates;
                this.action = i;
                this.metaState = i2;
            }

            public final com.ironsource.r3.a.C0241a a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.zg.e productType, java.lang.String demandSourceName, java.lang.String url, com.ironsource.r3.a.C0241a.C0242a coordinates, int action, int metaState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new com.ironsource.r3.a.C0241a(successCallback, failCallback, productType, demandSourceName, url, coordinates, action, metaState);
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: a, reason: from getter */
            public java.lang.String getFailCallback() {
                return this.failCallback;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: b, reason: from getter */
            public com.ironsource.zg.e getProductType() {
                return this.productType;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: c, reason: from getter */
            public java.lang.String getSuccessCallback() {
                return this.successCallback;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: d, reason: from getter */
            public java.lang.String getDemandSourceName() {
                return this.demandSourceName;
            }

            public final java.lang.String e() {
                return this.successCallback;
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.ironsource.r3.a.C0241a)) {
                    return false;
                }
                com.ironsource.r3.a.C0241a c0241a = (com.ironsource.r3.a.C0241a) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.successCallback, c0241a.successCallback) && kotlin.jvm.internal.Intrinsics.areEqual(this.failCallback, c0241a.failCallback) && this.productType == c0241a.productType && kotlin.jvm.internal.Intrinsics.areEqual(this.demandSourceName, c0241a.demandSourceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, c0241a.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.coordinates, c0241a.coordinates) && this.action == c0241a.action && this.metaState == c0241a.metaState;
            }

            public final java.lang.String f() {
                return this.failCallback;
            }

            public final com.ironsource.zg.e g() {
                return this.productType;
            }

            @Override // com.ironsource.r3.a
            public java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String h() {
                return this.demandSourceName;
            }

            public int hashCode() {
                return (((((((((((((this.successCallback.hashCode() * 31) + this.failCallback.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.demandSourceName.hashCode()) * 31) + this.url.hashCode()) * 31) + this.coordinates.hashCode()) * 31) + java.lang.Integer.hashCode(this.action)) * 31) + java.lang.Integer.hashCode(this.metaState);
            }

            public final java.lang.String i() {
                return this.url;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final com.ironsource.r3.a.C0241a.C0242a getCoordinates() {
                return this.coordinates;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final int getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final int getMetaState() {
                return this.metaState;
            }

            public final int m() {
                return this.action;
            }

            public final com.ironsource.r3.a.C0241a.C0242a n() {
                return this.coordinates;
            }

            public final int o() {
                return this.metaState;
            }

            public java.lang.String toString() {
                return "Click(successCallback=" + this.successCallback + ", failCallback=" + this.failCallback + ", productType=" + this.productType + ", demandSourceName=" + this.demandSourceName + ", url=" + this.url + ", coordinates=" + this.coordinates + ", action=" + this.action + ", metaState=" + this.metaState + ')';
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/r3$a$b;", "Lcom/ironsource/r3$a;", "", "e", "f", "Lcom/ironsource/zg$e;", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "successCallback", "failCallback", com.ironsource.y8.h.m, "demandSourceName", "url", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/ironsource/zg$e;", "()Lcom/ironsource/zg$e;", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/zg$e;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class b implements com.ironsource.r3.a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final java.lang.String successCallback;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final java.lang.String failCallback;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final com.ironsource.zg.e productType;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final java.lang.String demandSourceName;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final java.lang.String url;

            public b(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.zg.e productType, java.lang.String demandSourceName, java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                this.successCallback = successCallback;
                this.failCallback = failCallback;
                this.productType = productType;
                this.demandSourceName = demandSourceName;
                this.url = url;
            }

            public static /* synthetic */ com.ironsource.r3.a.b a(com.ironsource.r3.a.b bVar, java.lang.String str, java.lang.String str2, com.ironsource.zg.e eVar, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.successCallback;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.failCallback;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    eVar = bVar.productType;
                }
                com.ironsource.zg.e eVar2 = eVar;
                if ((i & 8) != 0) {
                    str3 = bVar.demandSourceName;
                }
                java.lang.String str6 = str3;
                if ((i & 16) != 0) {
                    str4 = bVar.url;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            public final com.ironsource.r3.a.b a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.zg.e productType, java.lang.String demandSourceName, java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                return new com.ironsource.r3.a.b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: a, reason: from getter */
            public java.lang.String getFailCallback() {
                return this.failCallback;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: b, reason: from getter */
            public com.ironsource.zg.e getProductType() {
                return this.productType;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: c, reason: from getter */
            public java.lang.String getSuccessCallback() {
                return this.successCallback;
            }

            @Override // com.json.r3
            /* JADX INFO: renamed from: d, reason: from getter */
            public java.lang.String getDemandSourceName() {
                return this.demandSourceName;
            }

            public final java.lang.String e() {
                return this.successCallback;
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.ironsource.r3.a.b)) {
                    return false;
                }
                com.ironsource.r3.a.b bVar = (com.ironsource.r3.a.b) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.successCallback, bVar.successCallback) && kotlin.jvm.internal.Intrinsics.areEqual(this.failCallback, bVar.failCallback) && this.productType == bVar.productType && kotlin.jvm.internal.Intrinsics.areEqual(this.demandSourceName, bVar.demandSourceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, bVar.url);
            }

            public final java.lang.String f() {
                return this.failCallback;
            }

            public final com.ironsource.zg.e g() {
                return this.productType;
            }

            @Override // com.ironsource.r3.a
            public java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String h() {
                return this.demandSourceName;
            }

            public int hashCode() {
                return (((((((this.successCallback.hashCode() * 31) + this.failCallback.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.demandSourceName.hashCode()) * 31) + this.url.hashCode();
            }

            public final java.lang.String i() {
                return this.url;
            }

            public java.lang.String toString() {
                return "Impression(successCallback=" + this.successCallback + ", failCallback=" + this.failCallback + ", productType=" + this.productType + ", demandSourceName=" + this.demandSourceName + ", url=" + this.url + ')';
            }
        }

        java.lang.String getUrl();
    }

    /* JADX INFO: renamed from: com.ironsource.r3$b, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/r3$b;", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/r3$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "jsonString", "Lcom/ironsource/r3;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ com.json.r3.Companion f3232a = new com.json.r3.Companion();

        private Companion() {
        }

        private final com.ironsource.r3.a a(org.json.JSONObject json) throws org.json.JSONException {
            java.lang.String successCallback = json.getString("success");
            java.lang.String failCallback = json.getString(com.ironsource.y8.f.e);
            java.lang.String demandSourceName = json.getString("demandSourceName");
            java.lang.String string = json.getString(com.ironsource.y8.h.m);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            com.ironsource.zg.e eVarValueOf = com.ironsource.zg.e.valueOf(string);
            org.json.JSONObject jSONObject = json.getJSONObject("params");
            java.lang.String url = jSONObject.getString("url");
            java.lang.String strOptString = jSONObject.optString("type");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(strOptString, com.json.z8.CLICK)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(strOptString, "impression")) {
                    throw new java.lang.IllegalArgumentException("JSON does not contain valid type: " + jSONObject.optString("type"));
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                return new com.ironsource.r3.a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.json.z8.COORDINATES);
            int i = jSONObject2.getInt(com.json.z8.SCREEN_X);
            int i2 = jSONObject2.getInt(com.json.z8.SCREEN_Y);
            int iOptInt = jSONObject.optInt("action", 0);
            int iOptInt2 = jSONObject.optInt(com.json.z8.META_STATE, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
            return new com.ironsource.r3.a.C0241a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new com.ironsource.r3.a.C0241a.C0242a(i, i2), iOptInt, iOptInt2);
        }

        @kotlin.jvm.JvmStatic
        public final com.json.r3 a(java.lang.String jsonString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
            java.lang.String strOptString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.Intrinsics.areEqual(strOptString, com.json.z8.ATTRIBUTION)) {
                return a(jSONObject);
            }
            throw new java.lang.IllegalArgumentException("unsupported message type: " + strOptString);
        }
    }

    @kotlin.jvm.JvmStatic
    static com.json.r3 a(java.lang.String str) {
        return INSTANCE.a(str);
    }

    /* JADX INFO: renamed from: a */
    java.lang.String getFailCallback();

    /* JADX INFO: renamed from: b */
    com.ironsource.zg.e getProductType();

    /* JADX INFO: renamed from: c */
    java.lang.String getSuccessCallback();

    /* JADX INFO: renamed from: d */
    java.lang.String getDemandSourceName();
}
