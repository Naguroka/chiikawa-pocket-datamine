package org.checkerframework.checker.signature.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.TargetLocations({org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_LOWER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_UPPER_BOUND})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.LOWER_BOUND})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.signature.qual.FieldDescriptorForPrimitive.class, org.checkerframework.checker.signature.qual.PrimitiveType.class, org.checkerframework.checker.signature.qual.CanonicalNameAndBinaryName.class, org.checkerframework.checker.signature.qual.MethodDescriptor.class})
public @interface SignatureBottom {
}
