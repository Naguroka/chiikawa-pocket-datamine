package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
class FrameSnapshot implements org.jacoco.core.internal.flow.IFrame {
    private static final org.jacoco.core.internal.flow.FrameSnapshot NOP = new org.jacoco.core.internal.flow.FrameSnapshot(null, null);
    private final java.lang.Object[] locals;
    private final java.lang.Object[] stack;

    private FrameSnapshot(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.locals = objArr;
        this.stack = objArr2;
    }

    static org.jacoco.core.internal.flow.IFrame create(org.objectweb.asm.commons.AnalyzerAdapter analyzerAdapter, int i) {
        if (analyzerAdapter == null || analyzerAdapter.locals == null) {
            return NOP;
        }
        return new org.jacoco.core.internal.flow.FrameSnapshot(reduce(analyzerAdapter.locals, 0), reduce(analyzerAdapter.stack, i));
    }

    private static java.lang.Object[] reduce(java.util.List<java.lang.Object> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        int size = list.size() - i;
        arrayList.subList(size, list.size()).clear();
        while (true) {
            size--;
            if (size >= 0) {
                java.lang.Object obj = list.get(size);
                if (obj == org.objectweb.asm.Opcodes.LONG || obj == org.objectweb.asm.Opcodes.DOUBLE) {
                    arrayList.remove(size + 1);
                }
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // org.jacoco.core.internal.flow.IFrame
    public void accept(org.objectweb.asm.MethodVisitor methodVisitor) {
        java.lang.Object[] objArr = this.locals;
        if (objArr != null) {
            int length = objArr.length;
            java.lang.Object[] objArr2 = this.stack;
            methodVisitor.visitFrame(-1, length, objArr, objArr2.length, objArr2);
        }
    }
}
