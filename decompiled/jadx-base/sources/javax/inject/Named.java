package javax.inject;

/* JADX INFO: loaded from: classes6.dex */
@javax.inject.Qualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Named {
    java.lang.String value() default "";
}
