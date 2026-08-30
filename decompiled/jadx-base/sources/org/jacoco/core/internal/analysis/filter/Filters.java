package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class Filters implements org.jacoco.core.internal.analysis.filter.IFilter {
    public static final org.jacoco.core.internal.analysis.filter.IFilter NONE = new org.jacoco.core.internal.analysis.filter.Filters(new org.jacoco.core.internal.analysis.filter.IFilter[0]);
    private final org.jacoco.core.internal.analysis.filter.IFilter[] filters;

    public static org.jacoco.core.internal.analysis.filter.IFilter all() {
        return new org.jacoco.core.internal.analysis.filter.Filters(new org.jacoco.core.internal.analysis.filter.EnumFilter(), new org.jacoco.core.internal.analysis.filter.SyntheticFilter(), new org.jacoco.core.internal.analysis.filter.BridgeFilter(), new org.jacoco.core.internal.analysis.filter.SynchronizedFilter(), new org.jacoco.core.internal.analysis.filter.TryWithResourcesJavac11Filter(), new org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter(), new org.jacoco.core.internal.analysis.filter.TryWithResourcesEcjFilter(), new org.jacoco.core.internal.analysis.filter.FinallyFilter(), new org.jacoco.core.internal.analysis.filter.PrivateEmptyNoArgConstructorFilter(), new org.jacoco.core.internal.analysis.filter.AssertFilter(), new org.jacoco.core.internal.analysis.filter.StringSwitchJavacFilter(), new org.jacoco.core.internal.analysis.filter.StringSwitchFilter(), new org.jacoco.core.internal.analysis.filter.EnumEmptyConstructorFilter(), new org.jacoco.core.internal.analysis.filter.RecordsFilter(), new org.jacoco.core.internal.analysis.filter.AnnotationGeneratedFilter(), new org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter(), new org.jacoco.core.internal.analysis.filter.KotlinLateinitFilter(), new org.jacoco.core.internal.analysis.filter.KotlinWhenFilter(), new org.jacoco.core.internal.analysis.filter.KotlinWhenStringFilter(), new org.jacoco.core.internal.analysis.filter.KotlinUnsafeCastOperatorFilter(), new org.jacoco.core.internal.analysis.filter.KotlinNotNullOperatorFilter(), new org.jacoco.core.internal.analysis.filter.KotlinDefaultArgumentsFilter(), new org.jacoco.core.internal.analysis.filter.KotlinInlineFilter(), new org.jacoco.core.internal.analysis.filter.KotlinCoroutineFilter(), new org.jacoco.core.internal.analysis.filter.KotlinDefaultMethodsFilter());
    }

    private Filters(org.jacoco.core.internal.analysis.filter.IFilter... iFilterArr) {
        this.filters = iFilterArr;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        for (org.jacoco.core.internal.analysis.filter.IFilter iFilter : this.filters) {
            iFilter.filter(methodNode, iFilterContext, iFilterOutput);
        }
    }
}
