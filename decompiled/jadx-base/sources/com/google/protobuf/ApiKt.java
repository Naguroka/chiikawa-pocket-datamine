package com.google.protobuf;

/* JADX INFO: compiled from: ApiKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ApiKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ApiKt {
    public static final com.google.protobuf.ApiKt INSTANCE = new com.google.protobuf.ApiKt();

    /* JADX INFO: compiled from: ApiKt.kt */
    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u0001:\u0004MNOPB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0001J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u0006\u00100\u001a\u000201J%\u00102\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b3J%\u00102\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\b4J%\u00102\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u000f\u001a\u00020\u0017H\u0007¢\u0006\u0002\b5J+\u00106\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0007¢\u0006\u0002\b9J+\u00106\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\f08H\u0007¢\u0006\u0002\b:J+\u00106\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001708H\u0007¢\u0006\u0002\b;J\u001d\u0010<\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\b=J\u001d\u0010<\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006H\u0007¢\u0006\u0002\b>J\u001d\u0010<\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0006H\u0007¢\u0006\u0002\b?J&\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\bAJ,\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0087\n¢\u0006\u0002\bBJ&\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0087\n¢\u0006\u0002\bCJ,\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\f08H\u0087\n¢\u0006\u0002\bDJ&\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u000f\u001a\u00020\u0017H\u0087\n¢\u0006\u0002\bEJ,\u0010@\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001708H\u0087\n¢\u0006\u0002\bFJ.\u0010G\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010H\u001a\u00020I2\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\bJJ.\u0010G\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010H\u001a\u00020I2\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\bKJ.\u0010G\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010H\u001a\u00020I2\u0006\u0010\u000f\u001a\u00020\u0017H\u0087\u0002¢\u0006\u0002\bLR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015¨\u0006Q"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Api$Builder;", "(Lcom/google/protobuf/Api$Builder;)V", "methods", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Method;", "Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "getMethods", "()Lcom/google/protobuf/kotlin/DslList;", "mixins", "Lcom/google/protobuf/Mixin;", "Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "getMixins", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "options", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "getOptions", "Lcom/google/protobuf/SourceContext;", "sourceContext", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "Lcom/google/protobuf/Syntax;", "syntax", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "version", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "setVersion", "_build", "Lcom/google/protobuf/Api;", "clearName", "", "clearSourceContext", "clearSyntax", "clearVersion", "hasSourceContext", "", "add", "addMethods", "addMixins", "addOptions", "addAll", "values", "", "addAllMethods", "addAllMixins", "addAllOptions", "clear", "clearMethods", "clearMixins", "clearOptions", "plusAssign", "plusAssignMethods", "plusAssignAllMethods", "plusAssignMixins", "plusAssignAllMixins", "plusAssignOptions", "plusAssignAllOptions", "set", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "setMethods", "setMixins", "setOptions", "Companion", "MethodsProxy", "MixinsProxy", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.ApiKt.Dsl.Companion INSTANCE = new com.google.protobuf.ApiKt.Dsl.Companion(null);
        private final com.google.protobuf.Api.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Api.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Api.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: ApiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ApiKt$Dsl;", "builder", "Lcom/google/protobuf/Api$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.ApiKt.Dsl _create(com.google.protobuf.Api.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.ApiKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Api _build() {
            com.google.protobuf.Api apiBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apiBuild, "_builder.build()");
            return apiBuild;
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

        /* JADX INFO: compiled from: ApiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class MethodsProxy extends com.google.protobuf.kotlin.DslProxy {
            private MethodsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getMethods() {
            java.util.List<com.google.protobuf.Method> methodsList = this._builder.getMethodsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodsList, "_builder.getMethodsList()");
            return new com.google.protobuf.kotlin.DslList(methodsList);
        }

        public final /* synthetic */ void addMethods(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Method value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addMethods(value);
        }

        public final /* synthetic */ void plusAssignMethods(com.google.protobuf.kotlin.DslList<com.google.protobuf.Method, com.google.protobuf.ApiKt.Dsl.MethodsProxy> dslList, com.google.protobuf.Method value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addMethods(dslList, value);
        }

        public final /* synthetic */ void addAllMethods(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMethods(values);
        }

        public final /* synthetic */ void plusAssignAllMethods(com.google.protobuf.kotlin.DslList<com.google.protobuf.Method, com.google.protobuf.ApiKt.Dsl.MethodsProxy> dslList, java.lang.Iterable<com.google.protobuf.Method> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllMethods(dslList, values);
        }

        public final /* synthetic */ void setMethods(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Method value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMethods(i, value);
        }

        public final /* synthetic */ void clearMethods(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearMethods();
        }

        /* JADX INFO: compiled from: ApiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class OptionsProxy extends com.google.protobuf.kotlin.DslProxy {
            private OptionsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getOptions() {
            java.util.List<com.google.protobuf.Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optionsList, "_builder.getOptionsList()");
            return new com.google.protobuf.kotlin.DslList(optionsList);
        }

        public final /* synthetic */ void addOptions(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void plusAssignOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.ApiKt.Dsl.OptionsProxy> dslList, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void addAllOptions(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void plusAssignAllOptions(com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, com.google.protobuf.ApiKt.Dsl.OptionsProxy> dslList, java.lang.Iterable<com.google.protobuf.Option> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void setOptions(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOptions(i, value);
        }

        public final /* synthetic */ void clearOptions(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final java.lang.String getVersion() {
            java.lang.String version = this._builder.getVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(version, "_builder.getVersion()");
            return version;
        }

        public final void setVersion(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVersion(value);
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final com.google.protobuf.SourceContext getSourceContext() {
            com.google.protobuf.SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final void setSourceContext(com.google.protobuf.SourceContext value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        /* JADX INFO: compiled from: ApiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class MixinsProxy extends com.google.protobuf.kotlin.DslProxy {
            private MixinsProxy() {
            }
        }

        public final /* synthetic */ com.google.protobuf.kotlin.DslList getMixins() {
            java.util.List<com.google.protobuf.Mixin> mixinsList = this._builder.getMixinsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mixinsList, "_builder.getMixinsList()");
            return new com.google.protobuf.kotlin.DslList(mixinsList);
        }

        public final /* synthetic */ void addMixins(com.google.protobuf.kotlin.DslList dslList, com.google.protobuf.Mixin value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addMixins(value);
        }

        public final /* synthetic */ void plusAssignMixins(com.google.protobuf.kotlin.DslList<com.google.protobuf.Mixin, com.google.protobuf.ApiKt.Dsl.MixinsProxy> dslList, com.google.protobuf.Mixin value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            addMixins(dslList, value);
        }

        public final /* synthetic */ void addAllMixins(com.google.protobuf.kotlin.DslList dslList, java.lang.Iterable values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMixins(values);
        }

        public final /* synthetic */ void plusAssignAllMixins(com.google.protobuf.kotlin.DslList<com.google.protobuf.Mixin, com.google.protobuf.ApiKt.Dsl.MixinsProxy> dslList, java.lang.Iterable<com.google.protobuf.Mixin> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            addAllMixins(dslList, values);
        }

        public final /* synthetic */ void setMixins(com.google.protobuf.kotlin.DslList dslList, int i, com.google.protobuf.Mixin value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMixins(i, value);
        }

        public final /* synthetic */ void clearMixins(com.google.protobuf.kotlin.DslList dslList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearMixins();
        }

        public final com.google.protobuf.Syntax getSyntax() {
            com.google.protobuf.Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final void setSyntax(com.google.protobuf.Syntax value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSyntax(value);
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }
    }

    private ApiKt() {
    }
}
