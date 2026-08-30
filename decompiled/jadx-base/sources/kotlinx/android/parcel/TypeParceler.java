package kotlinx.android.parcel;

/* JADX INFO: compiled from: TypeParceler.kt */
/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.PROPERTY})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u00032\u00020\u0004B\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/android/parcel/TypeParceler;", "T", "P", "Lkotlinx/android/parcel/Parceler;", "", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(kotlinx.android.parcel.TypeParceler.Container.class)
public @interface TypeParceler<T, P extends kotlinx.android.parcel.Parceler<? super T>> {

    /* JADX INFO: compiled from: TypeParceler.kt */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.PROPERTY})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        kotlinx.android.parcel.TypeParceler[] value();
    }
}
