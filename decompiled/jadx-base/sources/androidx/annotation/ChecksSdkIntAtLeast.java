package androidx.annotation;

/* JADX INFO: compiled from: ChecksSdkIntAtLeast.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\tR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u000f\u0010\b\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000f\u0010\u0007\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000f\u0010\u0006\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/annotation/ChecksSdkIntAtLeast;", "", "api", "", "codename", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "lambda", "extension", "()I", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@java.lang.annotation.Documented
public @interface ChecksSdkIntAtLeast {
    int api() default -1;

    java.lang.String codename() default "";

    int extension() default 0;

    int lambda() default -1;

    int parameter() default -1;
}
