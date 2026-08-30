package javax.annotation.meta;

/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network.dex
  classes6.dex
 */
/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface TypeQualifier {
    java.lang.Class<?> applicableTo() default java.lang.Object.class;
}
