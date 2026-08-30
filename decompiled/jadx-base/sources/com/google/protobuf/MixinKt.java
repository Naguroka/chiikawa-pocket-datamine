package com.google.protobuf;

/* JADX INFO: compiled from: MixinKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/MixinKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MixinKt {
    public static final com.google.protobuf.MixinKt INSTANCE = new com.google.protobuf.MixinKt();

    /* JADX INFO: compiled from: MixinKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/google/protobuf/MixinKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Mixin$Builder;", "(Lcom/google/protobuf/Mixin$Builder;)V", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "root", "getRoot", "setRoot", "_build", "Lcom/google/protobuf/Mixin;", "clearName", "", "clearRoot", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.MixinKt.Dsl.Companion INSTANCE = new com.google.protobuf.MixinKt.Dsl.Companion(null);
        private final com.google.protobuf.Mixin.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Mixin.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Mixin.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: MixinKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/MixinKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/MixinKt$Dsl;", "builder", "Lcom/google/protobuf/Mixin$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.MixinKt.Dsl _create(com.google.protobuf.Mixin.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.MixinKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Mixin _build() {
            com.google.protobuf.Mixin mixinBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mixinBuild, "_builder.build()");
            return mixinBuild;
        }

        public final java.lang.String getName() {
            java.lang.String name = this._builder.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        public final void setName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final java.lang.String getRoot() {
            java.lang.String root = this._builder.getRoot();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "_builder.getRoot()");
            return root;
        }

        public final void setRoot(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRoot(value);
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }
    }

    private MixinKt() {
    }
}
