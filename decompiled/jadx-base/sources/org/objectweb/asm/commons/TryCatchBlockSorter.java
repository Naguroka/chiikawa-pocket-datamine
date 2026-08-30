package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class TryCatchBlockSorter extends org.objectweb.asm.tree.MethodNode {
    public TryCatchBlockSorter(org.objectweb.asm.MethodVisitor methodVisitor, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this(589824, methodVisitor, i, str, str2, str3, strArr);
        if (getClass() != org.objectweb.asm.commons.TryCatchBlockSorter.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected TryCatchBlockSorter(int i, org.objectweb.asm.MethodVisitor methodVisitor, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.mv = methodVisitor;
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
        java.util.Collections.sort(this.tryCatchBlocks, new java.util.Comparator<org.objectweb.asm.tree.TryCatchBlockNode>() { // from class: org.objectweb.asm.commons.TryCatchBlockSorter.1
            @Override // java.util.Comparator
            public int compare(org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode, org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode2) {
                return blockLength(tryCatchBlockNode) - blockLength(tryCatchBlockNode2);
            }

            private int blockLength(org.objectweb.asm.tree.TryCatchBlockNode tryCatchBlockNode) {
                return org.objectweb.asm.commons.TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.end) - org.objectweb.asm.commons.TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.start);
            }
        });
        for (int i = 0; i < this.tryCatchBlocks.size(); i++) {
            this.tryCatchBlocks.get(i).updateIndex(i);
        }
        if (this.mv != null) {
            accept(this.mv);
        }
    }
}
