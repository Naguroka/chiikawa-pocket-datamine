package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class EnumFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (isMethodFiltered(iFilterContext.getClassName(), iFilterContext.getSuperClassName(), methodNode.name, methodNode.desc)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    private boolean isMethodFiltered(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!"java/lang/Enum".equals(str2)) {
            return false;
        }
        if ("values".equals(str3) && ("()[L" + str + ";").equals(str4)) {
            return true;
        }
        return "valueOf".equals(str3) && new java.lang.StringBuilder("(Ljava/lang/String;)L").append(str).append(";").toString().equals(str4);
    }
}
