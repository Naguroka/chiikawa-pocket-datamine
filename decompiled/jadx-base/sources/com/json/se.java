package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "initialValue", "Lkotlin/properties/ReadWriteProperty;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class se {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J&\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"com/ironsource/se$a", "Lkotlin/properties/ReadWriteProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/ref/WeakReference;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "reference", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a<T> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private java.lang.ref.WeakReference<T> reference;

        a(T t) {
            this.reference = new java.lang.ref.WeakReference<>(t);
        }

        public final java.lang.ref.WeakReference<T> a() {
            return this.reference;
        }

        public final void a(java.lang.ref.WeakReference<T> weakReference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.reference = weakReference;
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public T getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
            return this.reference.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
            this.reference = new java.lang.ref.WeakReference<>(value);
        }
    }

    public static final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> a(T t) {
        return new com.ironsource.se.a(t);
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty a(java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }
}
