package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public interface IFilterContext {
    java.util.Set<java.lang.String> getClassAnnotations();

    java.util.Set<java.lang.String> getClassAttributes();

    java.lang.String getClassName();

    java.lang.String getSourceDebugExtension();

    java.lang.String getSourceFileName();

    java.lang.String getSuperClassName();
}
