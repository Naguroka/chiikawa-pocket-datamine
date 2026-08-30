package org.jacoco.core.internal.analysis.filter;

/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractMatcher {
    org.objectweb.asm.tree.AbstractInsnNode cursor;
    final java.util.Map<java.lang.String, org.objectweb.asm.tree.VarInsnNode> vars = new java.util.HashMap();

    AbstractMatcher() {
    }

    final void firstIsALoad0(org.objectweb.asm.tree.MethodNode methodNode) {
        this.cursor = methodNode.instructions.getFirst();
        skipNonOpcodes();
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode != null && abstractInsnNode.getOpcode() == 25 && ((org.objectweb.asm.tree.VarInsnNode) this.cursor).var == 0) {
            return;
        }
        this.cursor = null;
    }

    final void nextIsType(int i, java.lang.String str) {
        nextIs(i);
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || ((org.objectweb.asm.tree.TypeInsnNode) abstractInsnNode).desc.equals(str)) {
            return;
        }
        this.cursor = null;
    }

    final void nextIsInvoke(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        nextIs(i);
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        org.objectweb.asm.tree.MethodInsnNode methodInsnNode = (org.objectweb.asm.tree.MethodInsnNode) abstractInsnNode;
        if (str.equals(methodInsnNode.owner) && str2.equals(methodInsnNode.name) && str3.equals(methodInsnNode.desc)) {
            return;
        }
        this.cursor = null;
    }

    final void nextIsField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        nextIs(i);
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        org.objectweb.asm.tree.FieldInsnNode fieldInsnNode = (org.objectweb.asm.tree.FieldInsnNode) abstractInsnNode;
        if (str.equals(fieldInsnNode.owner) && str2.equals(fieldInsnNode.name) && str3.equals(fieldInsnNode.desc)) {
            return;
        }
        this.cursor = null;
    }

    final void nextIsVar(int i, java.lang.String str) {
        nextIs(i);
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        org.objectweb.asm.tree.VarInsnNode varInsnNode = (org.objectweb.asm.tree.VarInsnNode) abstractInsnNode;
        org.objectweb.asm.tree.VarInsnNode varInsnNode2 = this.vars.get(str);
        if (varInsnNode2 == null) {
            this.vars.put(str, varInsnNode);
        } else if (varInsnNode2.var != varInsnNode.var) {
            this.cursor = null;
        }
    }

    final void nextIsSwitch() {
        int opcode;
        next();
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || (opcode = abstractInsnNode.getOpcode()) == 170 || opcode == 171) {
            return;
        }
        this.cursor = null;
    }

    final void nextIs(int i) {
        next();
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || abstractInsnNode.getOpcode() == i) {
            return;
        }
        this.cursor = null;
    }

    final void next() {
        org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        this.cursor = abstractInsnNode.getNext();
        skipNonOpcodes();
    }

    final void skipNonOpcodes() {
        this.cursor = skipNonOpcodes(this.cursor);
    }

    static org.objectweb.asm.tree.AbstractInsnNode skipNonOpcodes(org.objectweb.asm.tree.AbstractInsnNode abstractInsnNode) {
        while (abstractInsnNode != null && (abstractInsnNode.getType() == 14 || abstractInsnNode.getType() == 8 || abstractInsnNode.getType() == 15)) {
            abstractInsnNode = abstractInsnNode.getNext();
        }
        return abstractInsnNode;
    }
}
