package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
public class TypeAnnotationNode extends org.objectweb.asm.tree.AnnotationNode {
    public org.objectweb.asm.TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i, org.objectweb.asm.TypePath typePath, java.lang.String str) {
        this(589824, i, typePath, str);
        if (getClass() != org.objectweb.asm.tree.TypeAnnotationNode.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    public TypeAnnotationNode(int i, int i2, org.objectweb.asm.TypePath typePath, java.lang.String str) {
        super(i, str);
        this.typeRef = i2;
        this.typePath = typePath;
    }
}
