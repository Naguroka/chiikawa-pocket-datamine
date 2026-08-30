package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
abstract class TypeVisitor {
    private final java.util.Set<java.lang.reflect.Type> visited = com.google.common.collect.Sets.newHashSet();

    void visitClass(java.lang.Class<?> t) {
    }

    void visitGenericArrayType(java.lang.reflect.GenericArrayType t) {
    }

    void visitParameterizedType(java.lang.reflect.ParameterizedType t) {
    }

    void visitTypeVariable(java.lang.reflect.TypeVariable<?> t) {
    }

    void visitWildcardType(java.lang.reflect.WildcardType t) {
    }

    TypeVisitor() {
    }

    public final void visit(java.lang.reflect.Type... types) {
        for (java.lang.reflect.Type type : types) {
            if (type != null && this.visited.add(type)) {
                try {
                    if (type instanceof java.lang.reflect.TypeVariable) {
                        visitTypeVariable((java.lang.reflect.TypeVariable) type);
                    } else if (type instanceof java.lang.reflect.WildcardType) {
                        visitWildcardType((java.lang.reflect.WildcardType) type);
                    } else if (type instanceof java.lang.reflect.ParameterizedType) {
                        visitParameterizedType((java.lang.reflect.ParameterizedType) type);
                    } else if (type instanceof java.lang.Class) {
                        visitClass((java.lang.Class) type);
                    } else if (type instanceof java.lang.reflect.GenericArrayType) {
                        visitGenericArrayType((java.lang.reflect.GenericArrayType) type);
                    } else {
                        throw new java.lang.AssertionError("Unknown type: " + type);
                    }
                } catch (java.lang.Throwable th) {
                    this.visited.remove(type);
                    throw th;
                }
            }
        }
    }
}
