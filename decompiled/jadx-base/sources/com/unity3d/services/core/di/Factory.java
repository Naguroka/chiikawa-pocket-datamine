package com.unity3d.services.core.di;

/* JADX INFO: compiled from: ServiceFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/core/di/Factory;", "T", "Lkotlin/Lazy;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Factory<T> implements kotlin.Lazy<T> {
    private final kotlin.jvm.functions.Function0<T> initializer;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(kotlin.jvm.functions.Function0<? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.initializer.invoke();
    }
}
