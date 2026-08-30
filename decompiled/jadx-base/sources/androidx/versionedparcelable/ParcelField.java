package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface ParcelField {
    java.lang.String defaultValue() default "";

    int value();
}
