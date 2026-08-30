package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/p;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface p {

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ironsource/sdk/controller/p$a;", "Lcom/ironsource/sdk/controller/p;", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/sdk/controller/p$b;", "Lcom/ironsource/sdk/controller/p$b;", "openUrlStrategy", "", "method", "Lcom/ironsource/qo;", "openUrlConfigurations", "Lcom/ironsource/h;", "activityIntentFactory", "Lcom/ironsource/g;", "actionIntentFactory", "<init>", "(Ljava/lang/String;Lcom/ironsource/qo;Lcom/ironsource/h;Lcom/ironsource/g;)V", "(Ljava/lang/String;Lcom/ironsource/qo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.sdk.controller.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private com.ironsource.sdk.controller.p.b openUrlStrategy;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String method, com.json.qo openUrlConfigurations) {
            this(method, openUrlConfigurations, new com.ironsource.sdk.controller.k.b(), new com.ironsource.sdk.controller.k.a());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        public a(java.lang.String method, com.json.qo openUrlConfigurations, com.json.h activityIntentFactory, com.json.g actionIntentFactory) {
            com.ironsource.sdk.controller.p.b aVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int iHashCode = method.hashCode();
            if (iHashCode != -1455867212) {
                if (iHashCode != 109770977) {
                    if (iHashCode == 1224424441 && method.equals(com.ironsource.y8.h.K)) {
                        aVar = new com.ironsource.sdk.controller.p.b.d(openUrlConfigurations, activityIntentFactory);
                    } else {
                        aVar = new com.ironsource.sdk.controller.p.b.C0248b(method);
                    }
                } else if (method.equals(com.ironsource.y8.h.U)) {
                    aVar = new com.ironsource.sdk.controller.p.b.c(openUrlConfigurations, activityIntentFactory);
                } else {
                    aVar = new com.ironsource.sdk.controller.p.b.C0248b(method);
                }
            } else if (method.equals(com.ironsource.y8.h.J)) {
                aVar = new com.ironsource.sdk.controller.p.b.a(openUrlConfigurations, actionIntentFactory);
            } else {
                aVar = new com.ironsource.sdk.controller.p.b.C0248b(method);
            }
            this.openUrlStrategy = aVar;
        }

        @Override // com.json.sdk.controller.p
        public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.openUrlStrategy.a(context, openUrl);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                java.lang.String message = e.getMessage();
                java.lang.String message2 = message == null || message.length() == 0 ? "" : e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message2);
                return new com.ironsource.sdk.controller.p.c.a(message2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/p$b;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$a;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/qo;", "Lcom/ironsource/qo;", "configurations", "Lcom/ironsource/g;", "b", "Lcom/ironsource/g;", "intentFactory", "<init>", "(Lcom/ironsource/qo;Lcom/ironsource/g;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements com.ironsource.sdk.controller.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.json.qo configurations;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final com.json.g intentFactory;

            public a(com.json.qo configurations, com.json.g intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (android.text.TextUtils.isEmpty(openUrl.d())) {
                    return new com.ironsource.sdk.controller.p.c.a("url is empty");
                }
                android.content.Intent intentA = this.intentFactory.a();
                intentA.setData(android.net.Uri.parse(openUrl.d()));
                java.lang.String strC = openUrl.c();
                if (!(strC == null || strC.length() == 0)) {
                    intentA = intentA.setPackage(openUrl.c());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof android.app.Activity)) {
                    intentA = intentA.addFlags(this.configurations.c());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentA, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentA);
                return com.ironsource.sdk.controller.p.c.b.f3346a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$b;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/lang/String;", "method", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0248b implements com.ironsource.sdk.controller.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String method;

            public C0248b(java.lang.String method) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
                this.method = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new com.ironsource.sdk.controller.p.c.a("method " + this.method + " is unsupported");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$c;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/qo;", "Lcom/ironsource/qo;", "configurations", "Lcom/ironsource/h;", "b", "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/qo;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class c implements com.ironsource.sdk.controller.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.json.qo configurations;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final com.json.h intentFactory;

            public c(com.json.qo configurations, com.json.h intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).b(true).c(true).a(context));
                return com.ironsource.sdk.controller.p.c.b.f3346a;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$d;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/po;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/qo;", "Lcom/ironsource/qo;", "configurations", "Lcom/ironsource/h;", "b", "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/qo;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class d implements com.ironsource.sdk.controller.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.json.qo configurations;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final com.json.h intentFactory;

            public d(com.json.qo configurations, com.json.h intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).a(this.configurations.d()).b(true).a(context));
                return com.ironsource.sdk.controller.p.c.b.f3346a;
            }
        }

        com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/p$c;", "", "<init>", "()V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c {

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "errorMessage", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class a extends com.ironsource.sdk.controller.p.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String errorMessage;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.String errorMessage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ com.ironsource.sdk.controller.p.c.a a(com.ironsource.sdk.controller.p.c.a aVar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.errorMessage;
                }
                return aVar.a(str);
            }

            public final com.ironsource.sdk.controller.p.c.a a(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new com.ironsource.sdk.controller.p.c.a(errorMessage);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String b() {
                return this.errorMessage;
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.ironsource.sdk.controller.p.c.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.ironsource.sdk.controller.p.c.a) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public java.lang.String toString() {
                return "Error(errorMessage=" + this.errorMessage + ')';
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$b;", "Lcom/ironsource/sdk/controller/p$c;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends com.ironsource.sdk.controller.p.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final com.ironsource.sdk.controller.p.c.b f3346a = new com.ironsource.sdk.controller.p.c.b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    com.ironsource.sdk.controller.p.c a(android.content.Context context, com.json.po openUrl);
}
