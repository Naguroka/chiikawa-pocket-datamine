package com.unity3d.services.core.di;

/* JADX INFO: compiled from: IServiceComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0086\b¨\u0006\u000b"}, d2 = {"get", "T", "", "Lcom/unity3d/services/core/di/IServiceComponent;", "named", "", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", com.ironsource.y8.a.t, "Lkotlin/LazyThreadSafetyMode;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IServiceComponentKt {
    public static /* synthetic */ java.lang.Object get$default(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return registry.getService(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public static final /* synthetic */ <T> T get(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) registry.getService(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public static /* synthetic */ kotlin.Lazy inject$default(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, kotlin.LazyThreadSafetyMode mode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        if ((i & 2) != 0) {
            mode = kotlin.LazyThreadSafetyMode.NONE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(mode, (kotlin.jvm.functions.Function0) new com.unity3d.services.core.di.IServiceComponentKt.AnonymousClass1(iServiceComponent, named));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: IServiceComponent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
        final /* synthetic */ java.lang.String $named;
        final /* synthetic */ com.unity3d.services.core.di.IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            com.unity3d.services.core.di.IServiceComponent iServiceComponent = this.$this_inject;
            java.lang.String str = this.$named;
            com.unity3d.services.core.di.IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return (T) registry.getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        }
    }

    public static final /* synthetic */ <T> kotlin.Lazy<T> inject(com.unity3d.services.core.di.IServiceComponent iServiceComponent, java.lang.String named, kotlin.LazyThreadSafetyMode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(mode, (kotlin.jvm.functions.Function0) new com.unity3d.services.core.di.IServiceComponentKt.AnonymousClass1(iServiceComponent, named));
    }
}
