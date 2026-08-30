package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
final class Subroutine {
    final java.util.List<org.objectweb.asm.tree.JumpInsnNode> callers;
    final boolean[] localsUsed;
    final org.objectweb.asm.tree.LabelNode start;

    Subroutine(org.objectweb.asm.tree.LabelNode labelNode, int i, org.objectweb.asm.tree.JumpInsnNode jumpInsnNode) {
        this.start = labelNode;
        this.localsUsed = new boolean[i];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.callers = arrayList;
        arrayList.add(jumpInsnNode);
    }

    Subroutine(org.objectweb.asm.tree.analysis.Subroutine subroutine) {
        this.start = subroutine.start;
        this.localsUsed = (boolean[]) subroutine.localsUsed.clone();
        this.callers = new java.util.ArrayList(subroutine.callers);
    }

    public boolean merge(org.objectweb.asm.tree.analysis.Subroutine subroutine) {
        int i = 0;
        boolean z = false;
        while (true) {
            boolean[] zArr = this.localsUsed;
            if (i >= zArr.length) {
                break;
            }
            if (subroutine.localsUsed[i] && !zArr[i]) {
                zArr[i] = true;
                z = true;
            }
            i++;
        }
        if (subroutine.start == this.start) {
            for (int i2 = 0; i2 < subroutine.callers.size(); i2++) {
                org.objectweb.asm.tree.JumpInsnNode jumpInsnNode = subroutine.callers.get(i2);
                if (!this.callers.contains(jumpInsnNode)) {
                    this.callers.add(jumpInsnNode);
                    z = true;
                }
            }
        }
        return z;
    }
}
