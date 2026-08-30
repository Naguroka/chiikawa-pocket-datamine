package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinInlineFilter implements org.jacoco.core.internal.analysis.filter.IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final java.util.regex.Pattern LINE_INFO_PATTERN = java.util.regex.Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final java.util.regex.Pattern FILE_INFO_PATTERN = java.util.regex.Pattern.compile("\\+ ([0-9]++) (.++)");

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(org.objectweb.asm.tree.MethodNode methodNode, org.jacoco.core.internal.analysis.filter.IFilterContext iFilterContext, org.jacoco.core.internal.analysis.filter.IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && org.jacoco.core.internal.analysis.filter.KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            int i = 0;
            for (org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                if (15 == abstractInsnNode.getType()) {
                    i = ((org.objectweb.asm.tree.LineNumberNode) abstractInsnNode).line;
                }
                if (i >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
                }
            }
        }
    }

    private static int getFirstGeneratedLineNumber(java.lang.String str, java.lang.String str2) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.StringReader(str2));
            expectLine(bufferedReader, "SMAP");
            expectLine(bufferedReader, str);
            expectLine(bufferedReader, "Kotlin");
            expectLine(bufferedReader, "*S Kotlin");
            expectLine(bufferedReader, "*F");
            java.util.BitSet bitSet = new java.util.BitSet();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (!"*L".equals(line)) {
                    bufferedReader.readLine();
                    java.util.regex.Matcher matcher = FILE_INFO_PATTERN.matcher(line);
                    if (!matcher.matches()) {
                        throw new java.lang.IllegalStateException("Unexpected SMAP line: " + line);
                    }
                    if (matcher.group(2).equals(str)) {
                        bitSet.set(java.lang.Integer.parseInt(matcher.group(1)));
                    }
                } else {
                    if (bitSet.isEmpty()) {
                        throw new java.lang.IllegalStateException("Unexpected SMAP FileSection");
                    }
                    int iMin = Integer.MAX_VALUE;
                    while (true) {
                        java.lang.String line2 = bufferedReader.readLine();
                        if (line2.equals("*E") || line2.equals("*S KotlinDebug")) {
                            break;
                            break;
                        }
                        java.util.regex.Matcher matcher2 = LINE_INFO_PATTERN.matcher(line2);
                        if (!matcher2.matches()) {
                            throw new java.lang.IllegalStateException("Unexpected SMAP line: " + line2);
                        }
                        int i = java.lang.Integer.parseInt(matcher2.group(1));
                        int i2 = java.lang.Integer.parseInt(matcher2.group(2).substring(1));
                        int i3 = java.lang.Integer.parseInt(matcher2.group(4));
                        if (!bitSet.get(i2) || i != i3) {
                            iMin = java.lang.Math.min(i3, iMin);
                        }
                    }
                    return iMin;
                }
            }
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static void expectLine(java.io.BufferedReader bufferedReader, java.lang.String str) throws java.io.IOException {
        java.lang.String line = bufferedReader.readLine();
        if (!str.equals(line)) {
            throw new java.lang.IllegalStateException("Unexpected SMAP line: " + line);
        }
    }
}
